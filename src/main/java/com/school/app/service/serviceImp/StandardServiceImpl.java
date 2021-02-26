package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.Standard;
import com.school.app.repository.StandardRepository;
import com.school.app.service.serviceClass.StandardService;

@Service
public class StandardServiceImpl implements StandardService 
{
	@Autowired
	StandardRepository standardrepository;
	
	@Override
	public List<Standard> getAllStandards() 
	{
		return (List<Standard>)standardrepository.findAll();
	}

	@Override
	public Standard getStandardById(int id) 
	{
		return standardrepository.findById(id).get();
	}

}
