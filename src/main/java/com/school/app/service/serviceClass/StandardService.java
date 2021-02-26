package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.Standard;

public interface StandardService 
{
	//get all
	public List<Standard> getAllStandards();
	
	//get By Id
	public Standard getStandardById(int id);
}
