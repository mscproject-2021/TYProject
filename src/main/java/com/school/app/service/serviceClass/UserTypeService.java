package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.UserType;

public interface UserTypeService 
{
	//getAll
	public List<UserType> getAllUserTypes();
	
	//getById
	public UserType getUserTypeById(int id);
}