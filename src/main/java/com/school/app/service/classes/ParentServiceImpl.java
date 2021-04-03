package com.school.app.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.Parent;
import com.school.app.repository.ParentRepository;
import com.school.app.service.interfaces.ParentService;

@Service
public class ParentServiceImpl implements ParentService 
{
	@Autowired
	private ParentRepository parentrepository;
	
	@Override
	public ResponseEntity<Object> saveParent(Parent parent) 
	{
		try
		{
			Parent add_parent = parentrepository.save(parent);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_parent);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

	@Override
	public ResponseEntity<List<Parent>> getAllParents() 
	{
		List<Parent> parent_list = (List<Parent>)parentrepository.findAll();
		if(parent_list.size() < 1)
		{
			throw new ResourceNotFoundException("Parent user list not found");
		}
		return ResponseEntity.status(HttpStatus.OK).body(parent_list);
	}

	@Override
	public ResponseEntity<Object> getParentById(int id) 
	{ 
		Parent parent =  parentrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User not found for id" + id));
		return ResponseEntity.status(HttpStatus.OK).body(parent);
	}

	@Override
	public ResponseEntity<Object> updateParent(Parent parent,int id) 
	{
		Parent parentById =  parentrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User not found for id" + id));
		try
		{
			parentById.setContactNo2(parent.getContactNo2());
			parentById.setOccupation(parent.getOccupation());
			parentById.setQualification(parent.getQualification());
			
			parentrepository.save(parentById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(parentById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

	@Override
	public ResponseEntity<Object> deleteParentById(int id)
	{
		parentrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User not found for id" + id));
		parentrepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Parent record Successfully Deleted");
	}
}
