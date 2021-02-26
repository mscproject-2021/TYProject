package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.Student;

public interface StudentService 
{
	//save
	//save is not in our app bt created temporary here.
	//remove if is it need
	public Student saveStudent(Student student);
	
	//get all
	public List<Student> getAllStudents();
	
	//get by id
	public Student getStudentById(int id);
	
	//update 
	public Student updateStudent(int id,Student student);
	
	//delete by id
	public void deleteStudentById(int id);
	
	//delete all
	public void deleteAllStudents();
}