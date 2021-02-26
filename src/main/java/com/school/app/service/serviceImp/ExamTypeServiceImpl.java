package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.ExamType;
import com.school.app.repository.ExamTypeRepository;
import com.school.app.service.serviceClass.ExamTypeService;

@Service
public class ExamTypeServiceImpl implements ExamTypeService
{
	@Autowired
	ExamTypeRepository examtyperepository;
	
	@Override
	public List<ExamType> getAllExamTypes() 
	{
		return (List<ExamType>)examtyperepository.findAll();
	}

	@Override
	public ExamType getExamTypeById(int id) 
	{
		return examtyperepository.findById(id).get();
	}

}
