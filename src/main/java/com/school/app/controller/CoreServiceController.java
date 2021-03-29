package com.school.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.school.app.model.Division;
import com.school.app.model.Standard;
import com.school.app.model.Subject;
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
	
}
