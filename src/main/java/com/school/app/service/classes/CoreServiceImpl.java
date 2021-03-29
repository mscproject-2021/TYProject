package com.school.app.service.classes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.Division;
import com.school.app.model.Standard;
import com.school.app.model.Subject;
import com.school.app.repository.DivisionRepository;
import com.school.app.repository.StandardRepository;
import com.school.app.repository.SubjectRepository;
import com.school.app.service.interfaces.CoreService;

@Service
public class CoreServiceImpl implements CoreService
{
	@Autowired
	DivisionRepository divisionrepository;
	
	@Autowired
	StandardRepository Standardrepository;

	@Autowired
	SubjectRepository subjectrepository;
	
	@Override
	public ResponseEntity<List<Division>> getAllDivisions() 
	{
		List<Division> division_list = (List<Division>)divisionrepository.findAll();
		if(division_list.size() < 1)
		{
			throw new ResourceNotFoundException("division list not found");
		}
		return ResponseEntity.status(HttpStatus.OK).body(division_list);
	}

	@Override
	public ResponseEntity<List<Standard>> getAllStandards() 
	{
		List<Standard> standard_list = (List<Standard>)Standardrepository.findAll();
		if(standard_list.size() < 1)
		{
			throw new ResourceNotFoundException("standard list not found");
		}
		return ResponseEntity.status(HttpStatus.OK).body(standard_list);
	}

	@Override
	public ResponseEntity<List<Subject>> getAllSubjects() 
	{
		List<Subject> subject_list = (List<Subject>)subjectrepository.findAll();
		if(subject_list.size() < 1)
		{
			throw new ResourceNotFoundException("subject list not found");
		}
		return ResponseEntity.status(HttpStatus.OK).body(subject_list);
	}

}
