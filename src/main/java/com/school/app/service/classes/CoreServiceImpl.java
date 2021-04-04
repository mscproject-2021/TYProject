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
import com.school.app.model.image;
import com.school.app.repository.DivisionRepository;
import com.school.app.repository.ImageRepository;
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
	
	@Autowired
	ImageRepository imagerepository;
	
	@Override
	public ResponseEntity<List<Division>> getAllDivisions() 
	{
		List<Division> division_list = (List<Division>)divisionrepository.findAll();
		if(division_list.size() < 1)
		{
			throw new ResourceNotFoundException("Sorry! Not Found.");
		}
		return ResponseEntity.status(HttpStatus.OK).body(division_list);
	}

	@Override
	public ResponseEntity<List<Standard>> getAllStandards() 
	{
		List<Standard> standard_list = (List<Standard>)Standardrepository.findAll();
		if(standard_list.size() < 1)
		{
			throw new ResourceNotFoundException("Sorry! Not Found.");
		}
		return ResponseEntity.status(HttpStatus.OK).body(standard_list);
	}

	@Override
	public ResponseEntity<List<Subject>> getAllSubjects() 
	{
		List<Subject> subject_list = (List<Subject>)subjectrepository.findAll();
		if(subject_list.size() < 1)
		{
			throw new ResourceNotFoundException("Sorry! Not Found.");
		}
		return ResponseEntity.status(HttpStatus.OK).body(subject_list);
	}
	
	//image
	@Override
	public ResponseEntity<Object> saveImage(image image) 
	{
		try
		{
			image add_image = imagerepository.save(image);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_image);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
	}
	
	@Override
	public ResponseEntity<List<image>> getAllImages() 
	{
		List<image> image_list = (List<image>)imagerepository.findAll();
		if(image_list.size() < 1)
		{
			throw new ResourceNotFoundException("Sorry! Not Found.");
		}
		return ResponseEntity.status(HttpStatus.OK).body(image_list);
	}
	
	@Override
	public ResponseEntity<Object> getImageById(int id) 
	{
		image image =  imagerepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		return ResponseEntity.status(HttpStatus.OK).body(image);
		
	}
	
	@Override
	public ResponseEntity<Object> updateImage(image image,int id) 
	{
		image imageById =  imagerepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		try 
		{
			imageById.setImageName(image.getImageName());
			imageById.setImagePath(image.getImagePath());
			
			imagerepository.save(imageById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(imageById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
	}
	
	@Override
	public ResponseEntity<Object> deleteImageById(int id) 
	{
		imagerepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		imagerepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("image successfully deleted");
	}



}
