package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.Student;
import com.school.app.repository.StudentRepository;
import com.school.app.service.serviceClass.StudentService;



@Service
public class StudentServiceImpl implements StudentService 
{

	@Autowired
	StudentRepository studentrepository;
	
	@Override
	public Student saveStudent(Student student)
	{
		return studentrepository.save(student);
	}

	@Override
	public List<Student> getAllStudents()
	{
		return (List<Student>)studentrepository.findAll();
	}

	@Override
	public Student getStudentById(int id) 
	{
		return studentrepository.findById(id).get();
	}

	@Override
	public Student updateStudent(int id,Student student) 
	{
		return studentrepository.save(student);
	}

	@Override
	public void deleteStudentById(int id) 
	{
		studentrepository.deleteById(id);
	}

	@Override
	public void deleteAllStudents() 
	{
		studentrepository.deleteAll();
	}

}
