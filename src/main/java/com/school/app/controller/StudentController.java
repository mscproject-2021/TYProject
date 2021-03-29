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

import com.school.app.model.Attendance;
import com.school.app.model.Student;
import com.school.app.service.interfaces.AttendanceService;
import com.school.app.service.interfaces.StudentService;

@RestController
@RequestMapping("/sms")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController 
{
	@Autowired
	StudentService studentservice;
	
	@Autowired
	AttendanceService attendanceservice;
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getStudentList()
	{
		return studentservice.getAllStudents();
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Object> getStudent(@PathVariable int id)
	{
		return studentservice.getStudentById(id);
	}
	
	@PostMapping("/student")
	public ResponseEntity<Object> addStudent(@RequestBody Student student)
	{
		return studentservice.saveStudent(student);
	}
		
	@PutMapping("/student/{id}")
	public ResponseEntity<Object> updateStudent(@RequestBody Student student,@PathVariable int id)
	{
		return studentservice.updateStudent(student, id);
	}
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity<Object> deleteStudent(@PathVariable int id)
	{
		return studentservice.deleteStudentById(id);
	}
	
	@GetMapping("/attendance/{id}")
	public ResponseEntity<Object> getAttendance(@PathVariable int id)
	{
		return attendanceservice.getAttendanceById(id);
	}
	
	@PostMapping("/attendance")
	public ResponseEntity<Object> addAttendance(@RequestBody Attendance attendance)
	{
		return attendanceservice.saveAttendance(attendance);
	}
		
	@PutMapping("/attendance/{id}")
	public ResponseEntity<Object> updateAttendance(@RequestBody Attendance attendance,@PathVariable int id)
	{
		return attendanceservice.updateAttendance(attendance, id);
	}
	
	@DeleteMapping("/attendance/{id}")
	public ResponseEntity<Object> deleteAttendance(@PathVariable int id)
	{
		return attendanceservice.deleteAttendanceById(id);
	}
}
