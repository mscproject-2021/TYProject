package com.school.app.service.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;
import com.school.app.model.User;
import com.school.app.model.UserType;

public interface UserService 
{
	//User
	
	public  ResponseEntity<Object> saveUser(User user);
	
	public 	ResponseEntity<List<User>> getAllUsers();
	
	public  ResponseEntity<Object> getUserById(int id);
 	
 	public ResponseEntity<Object> deleteUserById(int id);

	public ResponseEntity<Object> updateUser(User user, int id);
	
	
	//UserType
	
	public ResponseEntity<List<UserType>> getAllUserTypes();
}
