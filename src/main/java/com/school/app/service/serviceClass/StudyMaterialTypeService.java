package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.StudyMaterialType;

public interface StudyMaterialTypeService 
{
	//public  StudyMaterialType saveActivity(StudyMaterialType studyMaterialType);
	
	public List<StudyMaterialType> getAllStudyMaterialTypes();
	
	public  StudyMaterialType getStudyMaterialTypeById(int id);
	
 	//public  StudyMaterialType updateActivity(int id, StudyMaterialType studyMaterialType);
 	
 	//public void deleteActivityById(int id);
 	
 	//public void deleteAllActivities();
}
