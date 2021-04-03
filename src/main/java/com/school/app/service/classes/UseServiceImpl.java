package com.school.app.service.classes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.User;
import com.school.app.model.UserType;
import com.school.app.repository.UserRepository;
import com.school.app.repository.UserTypeRepository;
import com.school.app.service.interfaces.UserService;

@Service
public class UseServiceImpl implements UserService
{

	@Autowired
	private UserRepository userrepository;
	
	@Autowired
	private UserTypeRepository usertyperepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder; 
	
	@Override
	public ResponseEntity<Object> saveUser(User user)
	{
		try
		{
			String encodePasswordString = passwordEncoder.encode(user.getPassword());
			user.setPassword(encodePasswordString);
			User add_user = userrepository.save(user);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_user);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
		
	}
	
	@Override
	public ResponseEntity<Object> updateUser(User user, int id) {
		User userById =  userrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		try 
		{
			userById.setContactNo1(user.getContactNo1());
			userById.setEmailId(user.getEmailId());
			userById.setName(user.getName());
			userById.setPassword(user.getPassword());
			userById.setUserName(user.getUserName());
			
			userrepository.save(userById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(userById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}	
	}

	@Override
	public ResponseEntity<List<User>> getAllUsers() 
	{
		List<User> user_list = (List<User>)userrepository.findAll();
		if(user_list.size() < 1)
		{
			throw new ResourceNotFoundException("Sorry! Not Found.");
		}
		return ResponseEntity.status(HttpStatus.OK).body(user_list);
	}

	@Override
	public ResponseEntity<Object> getUserById(int id) 
	{
		User user =  userrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}

	@Override
	public ResponseEntity<Object> deleteUserById(int id)
	{
		userrepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Sorry! Not found for :" + id));
		userrepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("User successfully deleted");
	}
	
	@Override
	public ResponseEntity<List<UserType>> getAllUserTypes() 
	{
		List<UserType> usertype_list = (List<UserType>)usertyperepository.findAll();
		if(usertype_list.size() < 1)
		{
			throw new ResourceNotFoundException("Sorry! Not Found.");
		}
		return ResponseEntity.status(HttpStatus.OK).body(usertype_list);
	}
	
}
