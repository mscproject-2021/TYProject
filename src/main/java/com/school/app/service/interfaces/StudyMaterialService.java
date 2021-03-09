package com.school.app.service.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.school.app.model.StudyMaterial;

public interface StudyMaterialService 
{
	//studymatrialType
	
	public  ResponseEntity<Object> saveStudyMaterial(StudyMaterial studyMaterial);
	
	public 	ResponseEntity<List<StudyMaterial>> getAllStudyMaterials();
	
	public  ResponseEntity<Object> getStudyMaterialById(int id);
	
 	public  ResponseEntity<Object> updateStudyMaterial(int id, StudyMaterial studyMaterial);
 	
 	public 	ResponseEntity<Object> deleteStudyMaterialById(int id);
 	
 	//StudyMaterialType
}
