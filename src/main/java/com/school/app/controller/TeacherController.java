package com.school.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.app.model.Teacher;
import com.school.app.service.interfaces.TeacherService;

@RestController
@RequestMapping("/sms")
@CrossOrigin(origins = "http://localhost:4200")
public class TeacherController
{
	@Autowired
	private TeacherService teacherservice;
	
	@GetMapping("/teachers")
	public ResponseEntity<List<Teacher>> getTeacherList()
	{
		return teacherservice.getAllTeachers();
	}
	
	@GetMapping("/teacher/{id}")
	public ResponseEntity<Object> getTeacher(@PathVariable int id)
	{
		return teacherservice.getTeacherById(id);
	}
	
	@PostMapping("/teacher")
	public ResponseEntity<Object> addTeacher(@RequestBody Teacher teacher)
	{
		return teacherservice.saveTeacher(teacher);
	}
	
	@PutMapping("/teacher/{id}")
	public ResponseEntity<Object> updateTeacher(@RequestBody Teacher teacher,@PathVariable int id)
	{
		return teacherservice.updateTeacher(teacher, id);
	}
	
	@DeleteMapping("/teacher/{id}")
	public ResponseEntity<Object> deleteTeacher(@PathVariable int id)
	{
		return teacherservice.deleteTeacherById(id);
	}
}
