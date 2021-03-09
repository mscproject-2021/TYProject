package com.school.app.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.Login;
import com.school.app.repository.LoginRepository;
import com.school.app.service.interfaces.UserLoginService;

@Service
public class UserLoginImpl implements UserLoginService
{

	@Autowired
	private LoginRepository loginrepository;
	
	@Override
	public ResponseEntity<Object> saveUserLogin(Login login) 
	{
		try
		{
			Login add_logindetail = loginrepository.save(login);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_logindetail);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

	@Override
	public ResponseEntity<Object> getUserLoginById(int id)
	{
		Login login = loginrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("user login detail not found for id" + id));
		return ResponseEntity.status(HttpStatus.OK).body(login);
	}

	@Override
	public ResponseEntity<List<Login>> getAllUserLogins() 
	{
		List<Login> login_list = (List<Login>)loginrepository.findAll();
		if(login_list.size() < 1)
		{
			throw new ResourceNotFoundException("login list not found");
		}
		return ResponseEntity.status(HttpStatus.OK).body(login_list);
	}
	
}
