package com.school.app.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.Teacher;
import com.school.app.repository.TeacherRepository;
import com.school.app.service.interfaces.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService 
{
	@Autowired
	private TeacherRepository teacherrepository;
	
	@Override
	public ResponseEntity<Object> saveTeacher(Teacher teacher)
	{
		try
		{
			Teacher add_teacher = teacherrepository.save(teacher);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_teacher);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
		
	}

	@Override
	public ResponseEntity<List<Teacher>> getAllTeachers() 
	{
		List<Teacher> teacher_list = (List<Teacher>)teacherrepository.findAll();
		if(teacher_list.size() < 1)
		{
			throw new ResourceNotFoundException("Sorry! Not Found.");
		}
		return ResponseEntity.status(HttpStatus.OK).body(teacher_list);
	}

	@Override
	public ResponseEntity<Object> getTeacherById(int id) 
	{
		Teacher teacher =  teacherrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		return ResponseEntity.status(HttpStatus.OK).body(teacher);
	}

	@Override
	public ResponseEntity<Object> updateTeacher(Teacher teacher,int id) 
	{
		Teacher teacherById =  teacherrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		try
		{
			teacherById.setAddress1(teacher.getAddress1());
			teacherById.setAddress2(teacher.getAddress2());
			teacherById.setGender(teacher.getGender());
			teacherById.setImage(teacher.getImage());
			teacherById.setJoiningDate(teacher.getJoiningDate());
			teacherById.setPincode(teacher.getPincode());
			teacherById.setQualification(teacher.getQualification());
	
			
			teacherrepository.save(teacherById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(teacherById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
	}

	@Override
	public ResponseEntity<Object> deleteTeacherById(int id)
	{
		teacherrepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Sorry! Not found for :" + id));
		teacherrepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Teacher successfully deleted");
	}
	
}
