package com.school.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.school.app.model.Division;
import com.school.app.model.Standard;
import com.school.app.model.Subject;
import com.school.app.model.image;
import com.school.app.service.interfaces.CoreService;
@RestController
@RequestMapping("/sms")
@CrossOrigin(origins = "http://localhost:4200")

public class CoreServiceController
{
	@Autowired
	private CoreService coreservice;
	
	@GetMapping("/divisions")
	public ResponseEntity<List<Division>> getDivisionList()
	{
		return coreservice.getAllDivisions();
	}
	
	@GetMapping("/standards")
	public ResponseEntity<List<Standard>> getStandardList()
	{
		return coreservice.getAllStandards();
	}
	
	@GetMapping("/subjects")
	public ResponseEntity<List<Subject>> getSubjectList()
	{
		return coreservice.getAllSubjects();
	}
	
	@GetMapping("/images")
	public ResponseEntity<List<image>> getImageList()
	{
		return coreservice.getAllImages();
	}
	
	@GetMapping("/image/{id}")
	public ResponseEntity<Object> getImage(@PathVariable int id)
	{
		return coreservice.getImageById(id);
	}
	
	@PostMapping("/image")
	public ResponseEntity<Object> addImage(@RequestBody image image)
	{
		return coreservice.saveImage(image);
	}
		
	@PutMapping("/image/{id}")
	public ResponseEntity<Object> updateImage(@RequestBody image image,@PathVariable int id)
	{
		return coreservice.updateImage(image, id);
	}
	
	@DeleteMapping("/image/{id}")
	public ResponseEntity<Object> deleteImage(@PathVariable int id)
	{
		return coreservice.deleteImageById(id);
	}

	
}
