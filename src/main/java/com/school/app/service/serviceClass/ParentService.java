package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.Parent;

public interface ParentService 
{
	//save
	public Parent saveParent(Parent parent);
	
	//get all
	public List<Parent> getAllParents();
	
	//get by id
	public Parent getParentById(int id);
	
	//update 
	public Parent updateParent(int id,Parent parent);
	
	//delete by id
	public void deleteParentById(int id);
	
	//delete all
	public void deleteAllParent();
}