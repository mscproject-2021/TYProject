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
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.app.model.Parent;
import com.school.app.service.interfaces.ParentService;

@RestController
@RequestMapping("/sms")
@CrossOrigin(origins = "http://localhost:4200")

public class ParentController
{
	@Autowired
	private ParentService parentservice;
	
	@GetMapping("/parents")
	public ResponseEntity<List<Parent>> getParentList()
	{
		return parentservice.getAllParents();
	}
	
	@GetMapping("/parent/{id}")
	public ResponseEntity<Object> getParent(@PathVariable int id)
	{
		return parentservice.getParentById(id);
	}
	
	@PostMapping("/parent")
	public ResponseEntity<Object> addParent(@RequestBody Parent parent)
	{
		return parentservice.saveParent(parent);
	}
	
	@PutMapping("/parent/{id}")
	public ResponseEntity<Object> updateParent(@RequestBody Parent parent,@PathVariable int id)
	{
		return parentservice.updateParent(parent, id);
	}
	
	@DeleteMapping("/parent/{id}")
	public ResponseEntity<Object> deleteParent(@PathVariable int id)
	{
		return parentservice.deleteParentById(id);
	}
	
}
