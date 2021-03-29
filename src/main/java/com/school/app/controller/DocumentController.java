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
import com.school.app.model.Activity;
import com.school.app.model.Event;
import com.school.app.model.Holiday;
import com.school.app.model.SchoolDetail;
import com.school.app.model.StudyMaterial;
import com.school.app.model.StudyMaterialType;
import com.school.app.service.interfaces.ActivityService;
import com.school.app.service.interfaces.AdminService;
import com.school.app.service.interfaces.EventService;
import com.school.app.service.interfaces.HolidayService;
import com.school.app.service.interfaces.StudyMaterialService;

@RestController
@RequestMapping("/sms")
@CrossOrigin(origins = "http://localhost:4200")

public class DocumentController 
{
	@Autowired
	private HolidayService holidayservice;
	
	@Autowired
	private EventService eventservice;
	
	@Autowired
	private ActivityService activityservice;
	
	@Autowired
	private AdminService adminservice;
	
	@Autowired
	private StudyMaterialService studymaterialservice;
	
	@GetMapping("/holidays")
	public ResponseEntity<List<Holiday>> getHolidayList()
	{
		return holidayservice.getAllHolidays();
	}
	
	@GetMapping("/holiday/{id}")
	public ResponseEntity<Object> getHoliday(@PathVariable int id)
	{
		return holidayservice.getHolidayById(id);
	}
	
	@PostMapping("/holiday")	
	public ResponseEntity<Object> addHoliday(@RequestBody Holiday holiday)
	{
		return holidayservice.saveHoliday(holiday);
	}
	
	@DeleteMapping("/holiday/{id}")
	public ResponseEntity<Object> deleteHoliday(@PathVariable int id)
	{
		return holidayservice.deleteHolidayById(id);
	}
	
	@PutMapping("/holiday/{id}")
	public ResponseEntity<Object> updateHoliday(@RequestBody Holiday holiday,@PathVariable int id)
	{
		return holidayservice.updateHoliday(holiday, id);
	}
	
	
	@GetMapping("/events")
	public ResponseEntity<List<Event>> getEventList()
	{
		return eventservice.getAllEvents();
	}
	
	@GetMapping("/event/{id}")
	public ResponseEntity<Object> getEventById(@PathVariable int  id)
	{
		return eventservice.getEventyById(id);
	}
	
	@PostMapping("/event")
	public ResponseEntity<Object> addEvent(@RequestBody Event event)
	{
		return eventservice.saveEvent(event);
	}
	
	@PutMapping("/event/{id}")
	public ResponseEntity<Object> updateHoliday(@RequestBody Event event,@PathVariable int id)
	{
		return eventservice.updateEvent(event, id);
	}
	
	@DeleteMapping("event/{id}")
	public ResponseEntity<Object> deleteEvent(@PathVariable int id)
	{
		return eventservice.deleteEventyById(id);
	}
	
	@GetMapping("/activities")
	public ResponseEntity<List<Activity>> getActivityList()
	{
		return activityservice.getAllActivities();
	}
	
	@GetMapping("/activity/{id}")
	public ResponseEntity<Object> getActivity(@PathVariable int id)
	{
		return activityservice.getActivityById(id);
	}

	@PostMapping("/activity")
	public ResponseEntity<Object> addActivity(@RequestBody Activity activity)
	{
		return activityservice.saveActivity(activity);
	}

	@PutMapping("/activity/{id}")
	public ResponseEntity<Object> updateHoliday(@RequestBody Activity activity,@PathVariable int id)
	{
		return activityservice.updateActivity(activity, id);
	}
	
	@DeleteMapping("/activity/{id}")
	public ResponseEntity<Object> deleteActivity(@PathVariable int id)
	{
		return activityservice.deleteActivityById(id);
	}
	
	@GetMapping("/schooldetails")
	public ResponseEntity<List<SchoolDetail>> getSchoolDetailList()
	{
		return adminservice.getAllSchoolDetails();
	}
	
	@PutMapping("/schooldetail/{id}")
	public ResponseEntity<Object> updateSchoolDetail(@RequestBody SchoolDetail schooldetail,@PathVariable int id)
	{
		return adminservice.updateSchoolDetail(schooldetail, id);
	}
	
	@GetMapping("/studymaterials")
	public ResponseEntity<List<StudyMaterial>> getStudyMaterialList()
	{
		return studymaterialservice.getAllStudyMaterials();
	}
	
	@GetMapping("/studymaterial/{id}")
	public ResponseEntity<Object> getStudyMaterial(@PathVariable int id)
	{
		return studymaterialservice.getStudyMaterialById(id);
	}
	
	@PostMapping("/studymaterial")	
	public ResponseEntity<Object> addStudyMaterial(@RequestBody StudyMaterial studymaterial)
	{
		return studymaterialservice.saveStudyMaterial(studymaterial);
	}
	
	@DeleteMapping("/studymaterial/{id}")
	public ResponseEntity<Object> deleteStudyMaterial(@PathVariable int id)
	{
		return studymaterialservice.deleteStudyMaterialById(id);
	}
	
	@PutMapping("/studymaterial/{id}")
	public ResponseEntity<Object> updateStudyMaterial(@RequestBody StudyMaterial studymaterial,@PathVariable int id)
	{
		return studymaterialservice.updateStudyMaterial(studymaterial, id);
	}
	
	@GetMapping("/studymaterialTypes")
	public ResponseEntity<List<StudyMaterialType>> getStudyMaterialTypeList()
	{
		return studymaterialservice.getAllStudyMaterialTypes();
	}
	
}
