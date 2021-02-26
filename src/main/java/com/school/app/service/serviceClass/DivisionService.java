package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.Division;

public interface DivisionService
{
	//get all
	public List<Division> getAllDivision();
	
	//get by id
	public Division getDivisionById(int id);
}
