package com.school.app.service.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.school.app.model.StudyMaterial;
import com.school.app.model.StudyMaterialType;

public interface StudyMaterialService 
{
	//studymatrialType
	
	public  ResponseEntity<Object> saveStudyMaterial(StudyMaterial studyMaterial);
	
	public 	ResponseEntity<List<StudyMaterial>> getAllStudyMaterials();
	
	public  ResponseEntity<Object> getStudyMaterialById(int id);
	
 	public  ResponseEntity<Object> updateStudyMaterial(StudyMaterial studyMaterial,int id);
 	
 	public 	ResponseEntity<Object> deleteStudyMaterialById(int id);
 	
 	//StudyMaterialType
 	public 	ResponseEntity<List<StudyMaterialType>> getAllStudyMaterialTypes();
}
