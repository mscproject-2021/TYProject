package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.StudyMaterial;
import com.school.app.repository.StudyMaterialRepository;
import com.school.app.service.serviceClass.StudyMaterialService;

@Service
public class StudyMaterialServiceImpl implements StudyMaterialService 
{
	@Autowired
	StudyMaterialRepository studymaterialrepository;

	@Override
	public StudyMaterial saveStudyMaterial(StudyMaterial studyMaterial)
	{
		return studymaterialrepository.save(studyMaterial);
	}

	@Override
	public List<StudyMaterial> getAllStudyMaterials() 
	{
		return (List<StudyMaterial>)studymaterialrepository.findAll();
	}

	@Override
	public StudyMaterial getStudyMaterialById(int id) 
	{
		return studymaterialrepository.findById(id).get();
	}

	@Override
	public StudyMaterial updateStudyMaterial(int id, StudyMaterial studyMaterial) 
	{
		return studymaterialrepository.save(studyMaterial);
	}

	@Override
	public void deleteStudyMaterialById(int id) 
	{
		studymaterialrepository.deleteById(id);
	}

	@Override
	public void deleteAllStudyMaterials() 
	{
		studymaterialrepository.deleteAll();
	}
	
	
}
