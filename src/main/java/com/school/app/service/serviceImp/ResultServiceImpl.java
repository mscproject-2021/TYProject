package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.Result;
import com.school.app.repository.ResultRepository;
import com.school.app.service.serviceClass.ResultService;

@Service
public class ResultServiceImpl implements ResultService
{

	@Autowired
	ResultRepository resultrepository;
	
	@Override
	public Result saveResult(Result result) 
	{
		return resultrepository.save(result);
	}

	@Override
	public List<Result> getAllResults() 
	{
		return (List<Result>)resultrepository.findAll();
	}

	@Override
	public Result getResultById(int id) 
	{
		return resultrepository.findById(id).get();
	}

	@Override
	public Result updateResult(int id,Result result) 
	{
		return resultrepository.save(result);
	}

	@Override
	public void delteResultById(int id) 
	{
		resultrepository.deleteById(id);
	}

	@Override
	public void deleteAllResults() 
	{
		resultrepository.deleteAll();
	}

}