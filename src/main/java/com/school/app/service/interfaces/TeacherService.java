package com.school.app.service.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.school.app.model.Teacher;

public interface TeacherService
{
	public ResponseEntity<Object> saveTeacher(Teacher teacher);
	
	public ResponseEntity<List<Teacher>> getAllTeachers();
	
	public ResponseEntity<Object> getTeacherById(int id);
	
	public ResponseEntity<Object> updateTeacher(Teacher teacher,int id);
	
	public ResponseEntity<Object> deleteTeacherById(int id);
}
