package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.Parent;
import com.school.app.repository.ParentRepository;
import com.school.app.service.serviceClass.ParentService;

@Service
public class ParentServiceImpl implements ParentService
{

	@Autowired
	ParentRepository parentrepository;
	
	@Override
	public Parent saveParent(Parent parent) 
	{
		return parentrepository.save(parent);
	}

	@Override
	public List<Parent> getAllParents() 
	{
		return (List<Parent>)parentrepository.findAll();
	}

	@Override
	public Parent getParentById(int id) 
	{
		return parentrepository.findById(id).get();
	}

	@Override
	public Parent updateParent(int id,Parent parent) 
	{
		return parentrepository.save(parent);
	}

	@Override
	public void deleteParentById(int id)
	{
		parentrepository.deleteById(id);
	}

	@Override
	public void deleteAllParent() 
	{	
		parentrepository.deleteAll();
	}

}
