package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.StudyMaterialType;
import com.school.app.repository.StudyMaterialTypeRepository;
import com.school.app.service.serviceClass.StudyMaterialTypeService;

@Service
public class StudyMaterialTypeServiceImpl implements StudyMaterialTypeService
{
	@Autowired
	StudyMaterialTypeRepository studymaterialtyperepository;
	
	@Override
	public List<StudyMaterialType> getAllStudyMaterialTypes() 
	{
		return (List<StudyMaterialType>)studymaterialtyperepository.findAll();
	}

	@Override
	public StudyMaterialType getStudyMaterialTypeById(int id) 
	{
		return studymaterialtyperepository.findById(id).get();
	}
	
}
