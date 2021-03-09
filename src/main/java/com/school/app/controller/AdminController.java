package com.school.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.app.model.Activity;
import com.school.app.model.Event;
import com.school.app.model.Holiday;
import com.school.app.model.Inquiry;
import com.school.app.model.Parent;
import com.school.app.model.Query;
import com.school.app.model.SchoolDetail;
import com.school.app.model.Student;
import com.school.app.model.Teacher;
import com.school.app.services.admin.AdminOtherService;
import com.school.app.services.admin.AdminUserService;


@RestController
@RequestMapping(path = "/sms")
public class AdminController 
{
	@Autowired
	private AdminUserService userservice;
	
	@Autowired 
	private AdminOtherService adminotherservice;
	
	@GetMapping("/parents")
	public ResponseEntity<List<Parent>> getParentList()
	{
		return userservice.getAllParents();
	}
	
	@GetMapping("/parent/{id}")
	public ResponseEntity<Object> getParent(@PathVariable int id)
	{
		return userservice.getParentById(id);
	}
	
	@PostMapping("/parent")
	public ResponseEntity<Object> addParent(@RequestBody Parent parent)
	{
		return userservice.saveParent(parent);
	}
	
	@PutMapping("/parent/{id}")
	public ResponseEntity<Object> updateParent(@RequestBody Parent parent,@PathVariable int id)
	{
		return userservice.updateParent(parent, id);
	}
	
	@DeleteMapping("/parent/{id}")
	public ResponseEntity<Object> deleteParent(@PathVariable int id)
	{
		return userservice.deleteParentById(id);
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getStudentList()
	{
		return userservice.getAllStudents();
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Object> getStudent(@PathVariable int id)
	{
		return userservice.getStudentById(id);
	}
	
	@PostMapping("/student")
	public ResponseEntity<Object> addStudent(@RequestBody Student student)
	{
		return userservice.saveStudent(student);
	}
		
	@PutMapping("/student/{id}")
	public ResponseEntity<Object> updateStudent(@RequestBody Student student,@PathVariable int id)
	{
		return userservice.updateStudent(student, id);
	}
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity<Object> deleteStudent(@PathVariable int id)
	{
		return userservice.deleteStudentById(id);
	}
	
	@GetMapping("/teachers")
	public ResponseEntity<List<Teacher>> getTeacherList()
	{
		return userservice.getAllTeachers();
	}
	
	@GetMapping("/teacher/{id}")
	public ResponseEntity<Object> getTeacher(@PathVariable int id)
	{
		return userservice.getTeacheById(id);
	}
	
	@PostMapping("/teacher")
	public ResponseEntity<Object> addTeacher(@RequestBody Teacher teacher)
	{
		return userservice.saveTeacher(teacher);
	}
	
	@PutMapping("/teacher/{id}")
	public ResponseEntity<Object> updateTeacher(@RequestBody Teacher teacher,@PathVariable int id)
	{
		return userservice.updateTeacher(teacher, id);
	}
	
	@DeleteMapping("/teacher/{id}")
	public ResponseEntity<Object> deleteTeacher(@PathVariable int id)
	{
		return userservice.deleteTeacherById(id);
	}
	
	@GetMapping("/inquiries")
	public ResponseEntity<List<Inquiry>> getInquiryList()
	{
		return adminotherservice.getAllInquiries();
	}
	
	@GetMapping("/inquiry/{id}")
	public ResponseEntity<Object> getInquiry(int id)
	{
		return adminotherservice.getInquiryById(id);
	}
	
	@PutMapping("/inquiry/{id}")
	public ResponseEntity<Object> updateInquiry(@RequestBody Inquiry inquiry,@PathVariable int id)
	{
		return adminotherservice.updateInquiry(inquiry, id);
	}

	@PostMapping("/inquiry")
	public ResponseEntity<Object> addInquiry(@RequestBody Inquiry inquiry)
	{
		return adminotherservice.saveInquiry(inquiry);
	}
	
	@DeleteMapping("/inquiry/{id}")
	public ResponseEntity<Object> deleteInquiry(@PathVariable int id)
	{
		return adminotherservice.deleteInquiryById(id);
	}
	
	@GetMapping("/queries")
	public ResponseEntity<List<Query>> getQueryList()
	{
		return adminotherservice.getAllQuiries();
	}
	
	@GetMapping("/query/{id}")
	public ResponseEntity<Object> getQuery(@PathVariable int  id)
	{
		return adminotherservice.getQueryById(id);
	}
	
	@PutMapping("/query/{id}")
	public ResponseEntity<Object> updateInquiry(@RequestBody Query query,@PathVariable int id)
	{
		return adminotherservice.updateQuery(query, id);
	}
	
	@DeleteMapping("/query/{id}")
	public ResponseEntity<Object> deleteQuery(@PathVariable int id)
	{
		return adminotherservice.deleteQueryById(id);
	}
	
	@GetMapping("/upload-document/holidays")
	public ResponseEntity<List<Holiday>> getHolidayList()
	{
		return adminotherservice.getAllHolidays();
	}
	
	@GetMapping("/upload-document/holiday/{id}")
	public ResponseEntity<Object> getHoliday(@PathVariable int id)
	{
		return adminotherservice.getHolidayById(id);
	}
	
	@PostMapping("/upload-document/holiday")
	public ResponseEntity<Object> addHoliday(@RequestBody Holiday holiday)
	{
		return adminotherservice.saveHoliday(holiday);
	}
	
	@DeleteMapping("/upload-document/holiday/{id}")
	public ResponseEntity<Object> deleteHoliday(@PathVariable int id)
	{
		return adminotherservice.deleteHolidayById(id);
	}
	
	@GetMapping("/upload-document/events")
	public ResponseEntity<List<Event>> getEventList()
	{
		return adminotherservice.getAllEvents();
	}
	
	@GetMapping("/upload-document/event/{id}")
	public ResponseEntity<Object> getEventById(int id)
	{
		return adminotherservice.getEventyById(id);
	}
	
	@PostMapping("/upload-document/event")
	public ResponseEntity<Object> addEvent(Event event)
	{
		return adminotherservice.saveEvent(event);
	}
	
	@DeleteMapping("upload-document/event/{id}")
	public ResponseEntity<Object> deleteEvent(int id)
	{
		return adminotherservice.deleteEventyById(id);
	}
	
	@GetMapping("/upload-document/activities")
	public ResponseEntity<List<Activity>> getActivityList()
	{
		return adminotherservice.getAllActivities();
	}
	
	@GetMapping("/upload-document/activity/{id}")
	public ResponseEntity<Object> getActivity(int id)
	{
		return adminotherservice.getActivityById(id);
	}

	@PostMapping("/upload-document/activity")
	public ResponseEntity<Object> addActivity(Activity activity)
	{
		return adminotherservice.saveActivity(activity);
	}

	@DeleteMapping("/upload-document/activity/{id}")
	public ResponseEntity<Object> deleteActivity(int id)
	{
		return adminotherservice.deleteActivityById(id);
	}
	
	@PutMapping("/upload-document/schooldetail/{id}")
	public ResponseEntity<Object> updateSchoolDetail(SchoolDetail schooldetail,int id)
	{
		return adminotherservice.updateSchoolDetail(schooldetail, id);
	}
}
