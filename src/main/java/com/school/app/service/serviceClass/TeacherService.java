package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.Teacher;

public interface TeacherService 
{
	//save
	public Teacher saveTeacher(Teacher teacher);
	
	//get all
	public List<Teacher> getAllTeachers();
	
	//get by id
	public Teacher getTeacheById(int id);
	
	//update
	public Teacher updateTeacher(int id,Teacher teacher);
	
	//delete by id
	public void deleteTeacherById(int id);
	
	//delete all
	public void deleteAllTeachers();
}