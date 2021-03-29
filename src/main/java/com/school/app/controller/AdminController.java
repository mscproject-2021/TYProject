package com.school.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.school.app.model.Admin;
import com.school.app.service.interfaces.AdminService;

@RestController
@RequestMapping("/sms")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController 
{
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/profile/{id}")
	public ResponseEntity<Object> getAdmin(@PathVariable int  id)
	{
		return adminService.getAdminById(id);
	}
	
	@PutMapping("/profile/{id}")
	public ResponseEntity<Object> updateAdmin(@RequestBody Admin admin,@PathVariable int id)
	{
		return adminService.updateAdmin(admin, id);
	}	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
