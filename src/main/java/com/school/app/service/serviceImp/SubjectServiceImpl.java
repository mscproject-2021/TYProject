package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.Subject;
import com.school.app.repository.SubjectRepository;
import com.school.app.service.serviceClass.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService 
{

	@Autowired
	SubjectRepository subjectrepository;
	
	@Override
	public List<Subject> getAllSubjects()
	{
		return (List<Subject>)subjectrepository.findAll();
	}

	@Override
	public Subject getSubjectById(int id) 
	{
		return subjectrepository.findById(id).get();
	}

}
