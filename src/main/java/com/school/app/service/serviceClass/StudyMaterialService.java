package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.StudyMaterial;

public interface StudyMaterialService
{
	public  StudyMaterial saveStudyMaterial(StudyMaterial studyMaterial);
	
	public 	List<StudyMaterial> getAllStudyMaterials();
	
	public  StudyMaterial getStudyMaterialById(int id);
	
 	public  StudyMaterial updateStudyMaterial(int id, StudyMaterial studyMaterial);
 	
 	public 	void deleteStudyMaterialById(int id);
 	
 	public 	void deleteAllStudyMaterials();
}
