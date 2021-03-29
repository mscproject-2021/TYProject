package com.school.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.school.app.model.Login;
import com.school.app.model.UserType;
import com.school.app.service.interfaces.UserLoginService;

@RestController
@RequestMapping("/sms")
@CrossOrigin(origins = "http://localhost:4200")
public class UserLoginController 
{
	
	@Autowired
	private UserLoginService userloginservice;
	
	@GetMapping("/loginDetails")
	public ResponseEntity<List<Login>> getAllLoginList()
	{
		return userloginservice.getAllUserLogins();
	}
	
	@GetMapping("/login/{id}")
	public ResponseEntity<Object> getLoginDetail(@PathVariable int id)
	{
		return userloginservice.getUserLoginById(id);
	}
	
	@PostMapping("/login")
	public ResponseEntity<Object> addLoginDetail(@RequestBody Login login)
	{
		return userloginservice.saveUserLogin(login);
	}
	
	@GetMapping("/usertypes")
	public ResponseEntity<List<UserType>> getUserTypeList()
	{
		return userloginservice.getAllUserTypes();
	}
	
	
}
