package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.ExamType;

public interface ExamTypeService 
{
	//public  ExamType saveExamType(ExamType examType);
	
	public List<ExamType> getAllExamTypes();
	
	public  ExamType getExamTypeById(int id);
	
 	//public  ExamType updateExamType(int id, ExamType examType);
 	
 	//public void deleteExamTypeById(int id);
 	
 	//public void deleteAllExamTypes();
}
