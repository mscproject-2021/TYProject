package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.Result;

public interface ResultService 
{
	//save
	public Result saveResult(Result result);
	
	//get all
	public List<Result> getAllResults();
	
	//get by id
	public Result getResultById(int id);
	
	//update
	public Result updateResult(int id,Result result);
	
	//delete by id
	public void delteResultById(int id);
	
	//delete all
	public void deleteAllResults();
}
