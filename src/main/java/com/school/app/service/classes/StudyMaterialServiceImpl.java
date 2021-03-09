package com.school.app.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.StudyMaterial;
import com.school.app.repository.StudyMaterialRepository;
import com.school.app.service.interfaces.StudyMaterialService;

@Service
public class StudyMaterialServiceImpl implements StudyMaterialService
{
	@Autowired
	private StudyMaterialRepository studyMaterialRepository;

	@Override
	public ResponseEntity<Object> saveStudyMaterial(StudyMaterial studyMaterial) 
	{
		try
		{
			StudyMaterial add_studymaterial = studyMaterialRepository.save(studyMaterial);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_studymaterial);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

	@Override
	public ResponseEntity<List<StudyMaterial>> getAllStudyMaterials() 
	{
		List<StudyMaterial> Studymaterial_list = (List<StudyMaterial>)studyMaterialRepository.findAll();
		if(Studymaterial_list.size() < 1)
		{
			throw new ResourceNotFoundException("Studymateriallist user list not found");
		}
		return ResponseEntity.status(HttpStatus.OK).body(Studymaterial_list);
	}

	@Override
	public ResponseEntity<Object> getStudyMaterialById(int id) 
	{
		StudyMaterial Studymaterial =  studyMaterialRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Studymaterial not found for id" + id));
		return ResponseEntity.status(HttpStatus.OK).body(Studymaterial);
	}

	@Override
	public ResponseEntity<Object> updateStudyMaterial(int id, StudyMaterial studyMaterial) 
	{
		StudyMaterial StudymaterialById =  studyMaterialRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Studymaterial not found for id" + id));
		try
		{
			StudymaterialById.setDescription(studyMaterial.getDescription());
			StudymaterialById.setStudymaterialFile(studyMaterial.getStudymaterialFile());
			
			studyMaterialRepository.save(StudymaterialById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(StudymaterialById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

	@Override
	public ResponseEntity<Object> deleteStudyMaterialById(int id) 
	{
		studyMaterialRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Studymaterial not found for id" + id));
		studyMaterialRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Studymaterial record successfully deleted");
	}
	
	
}
