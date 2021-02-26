package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.Subject;

public interface SubjectService 
{
	//get all
	public List<Subject> getAllSubjects();
	
	//get by id
	public Subject getSubjectById(int id);
}
