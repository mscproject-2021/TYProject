package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.Login;

public interface LoginService 
{
	//save
	public Login saveLogin(Login login);
	
	//get all
	public List<Login> getAllLogins();
	
	//getbyId
	public Login getLoginById(int id);
	
	//update
	public Login updateLogin(int id,Login login);
	
	//deleteby id
	public void deleteLoginById(int id);
	
	//deleteall
	public void deleteAllLogins();
}
