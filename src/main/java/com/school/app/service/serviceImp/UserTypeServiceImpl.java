package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.UserType;
import com.school.app.repository.UserTypeRepository;
import com.school.app.service.serviceClass.UserTypeService;

@Service
public class UserTypeServiceImpl implements UserTypeService
{

	@Autowired
	UserTypeRepository usertyperepository;
	
	@Override
	public List<UserType> getAllUserTypes() 
	{
		return (List<UserType>)usertyperepository.findAll();
	}

	@Override
	public UserType getUserTypeById(int id) 
	{
		return usertyperepository.findById(id).get();
	}

}