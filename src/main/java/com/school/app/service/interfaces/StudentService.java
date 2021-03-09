package com.school.app.service.interfaces;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.school.app.model.Student;

public interface StudentService 
{
	public ResponseEntity<Object> saveStudent(Student student);
	
	public ResponseEntity<List<Student>> getAllStudents();
	
	public ResponseEntity<Object> getStudentById(int id);
	
	public ResponseEntity<Object> updateStudent(Student student,int id);
	
	public ResponseEntity<Object> deleteStudentById(int id);
	
}
