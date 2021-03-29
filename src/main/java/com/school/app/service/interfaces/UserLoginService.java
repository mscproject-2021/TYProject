package com.school.app.service.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.school.app.model.Login;
import com.school.app.model.UserType;

public interface UserLoginService 
{
	//login
	
	public ResponseEntity<Object> saveUserLogin(Login login);
	
	public ResponseEntity<Object> getUserLoginById(int id);
	
	public ResponseEntity<List<Login>> getAllUserLogins();
	
	//UserType
	
	public ResponseEntity<List<UserType>> getAllUserTypes();
}