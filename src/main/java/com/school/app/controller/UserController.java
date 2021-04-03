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
import com.school.app.model.User;
import com.school.app.model.UserType;
import com.school.app.service.interfaces.UserService;

@RestController
@RequestMapping("/sms")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController 
{
	
	@Autowired
	private UserService userservice;
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUserList()
	{
		return userservice.getAllUsers();
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<Object> getUser(@PathVariable int id)
	{
		return userservice.getUserById(id);
	}
	
	@PostMapping("/user")
	public ResponseEntity<Object> addUser(@RequestBody User user)
	{
		return userservice.saveUser(user);
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<Object> updateUser(@RequestBody User user,@PathVariable int id)
	{
		return userservice.updateUser(user, id);
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<Object> deleteUser(@PathVariable int id)
	{
		return userservice.deleteUserById(id);
	}
	
	@GetMapping("/usertypes")
	public ResponseEntity<List<UserType>> getUserTypeList()
	{
		return userservice.getAllUserTypes();
	}
	
	
}
