package com.school.app.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.Student;
import com.school.app.repository.StudentRepository;
import com.school.app.service.interfaces.StudentService;

@Service
public class StudentServiceImpl  implements StudentService
{
	@Autowired
	private StudentRepository studentrepository;
	
	@Override
	public ResponseEntity<Object> saveStudent(Student student)
	{
		try
		{
			Student add_student = studentrepository.save(student);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_student);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

	@Override
	public ResponseEntity<List<Student>> getAllStudents()
	{
		List<Student> student_list = (List<Student>)studentrepository.findAll();
		if(student_list.size() < 1)
		{
			throw new ResourceNotFoundException("student user list not found");
		}
		return ResponseEntity.status(HttpStatus.OK).body(student_list);
	}

	@Override
	public ResponseEntity<Object> getStudentById(int id) 
	{
		Student student =  studentrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User not found for id" + id));
		return ResponseEntity.status(HttpStatus.OK).body(student);
	}

	@Override
	public ResponseEntity<Object> updateStudent(Student student,int id) 
	{
		Student studentById =  studentrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User not found for id" + id));
		try
		{
			studentById.setDivision(student.getDivision());
			studentById.setRollNo(student.getRollNo());
			studentById.setAddress1(student.getAddress1());
			studentById.setAddress2(student.getAddress2());
			studentById.setAdmissionDate(student.getAdmissionDate());
			studentById.setBloodGroup(student.getBloodGroup());
			studentById.setReligion(student.getReligion());
			studentById.setCategory(student.getCategory());
			studentById.setSubCaste(student.getSubCaste());
			studentById.setDateOfBirth(student.getDateOfBirth());
			studentById.setFatherName(student.getFatherName());
			studentById.setFirstName(student.getFirstName());
			studentById.setLastName(student.getLastName());
			studentById.setMiddleName(student.getMiddleName());
			studentById.setMotherName(student.getMotherName());
			studentById.setMedium(student.getMedium());
			studentById.setStream(student.getStream());
			studentById.setGender(student.getGender());
			studentById.setPincode(student.getPincode());
			studentById.setPreviousSchoolName(student.getPreviousSchoolName());
			studentById.setImage(student.getImage());
			
			studentrepository.save(studentById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(studentById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

	@Override
	public ResponseEntity<Object> deleteStudentById(int id) 
	{
		try 
		{
			studentrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User not found for id" + id));
			studentrepository.deleteById(id);
			return ResponseEntity.status(HttpStatus.OK).body("student record successfully deleted");
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
		
	}
}
