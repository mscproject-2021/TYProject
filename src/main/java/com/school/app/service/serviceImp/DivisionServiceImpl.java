package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.Division;
import com.school.app.repository.DivisionRepository;
import com.school.app.service.serviceClass.DivisionService;

@Service
public class DivisionServiceImpl implements DivisionService
{
	@Autowired
	DivisionRepository divisionrepository;
	
	@Override
	public List<Division> getAllDivision()
	{
		return (List<Division>)divisionrepository.findAll();
	}

	@Override
	public Division getDivisionById(int id) 
	{
		return divisionrepository.findById(id).get();
	}

}
