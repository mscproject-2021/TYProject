package com.school.app.service.interfaces;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.school.app.model.Division;
import com.school.app.model.Standard;
import com.school.app.model.Subject;
import com.school.app.model.image;

public interface CoreService 
{
	public ResponseEntity<List<Division>> getAllDivisions();
	
	//public ResponseEntity<Object> getDivisionById(int id);
	
	public ResponseEntity<List<Standard>> getAllStandards();
	
	//public Standard getStandardById(int id);
	
	public ResponseEntity<List<Subject>> getAllSubjects();

	//public Subject getSubjectById(int id);
	
	// some custome methods are used
	
	public ResponseEntity<List<image>> getAllImages();
	
	public ResponseEntity<Object> saveImage(image image);
	
	public ResponseEntity<Object> updateImage(image image, int id);
 	
	public ResponseEntity<Object> getImageById(int id);
 	
 	public ResponseEntity<Object> deleteImageById(int id);
 	
}
