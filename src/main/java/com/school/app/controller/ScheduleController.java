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
import com.school.app.model.Meeting;
import com.school.app.model.TimeTable;
import com.school.app.service.interfaces.MeetingService;
import com.school.app.service.interfaces.TimetableService;

@RestController
@RequestMapping("/sms")
@CrossOrigin(origins = "http://localhost:4200")

public class ScheduleController 
{
	@Autowired
	private TimetableService timetableservice;
	
	@Autowired
	private MeetingService meetingservice;
	
	@GetMapping("/timetables")
	public ResponseEntity<List<TimeTable>> getTimetableList()
	{
		return timetableservice.getAllTimeTables();
	}
	
	@GetMapping("/timetable/{id}")
	public ResponseEntity<Object> getTimetable(@PathVariable int id)
	{
		return timetableservice.getTimeTableById(id);
	}
	
	@PostMapping("/timetable")
	public ResponseEntity<Object> addTimetable(@RequestBody TimeTable timeTable)
	{
		return timetableservice.saveTimeTable(timeTable);
	}
	
	@DeleteMapping("/timetable/{id}")
	public ResponseEntity<Object> deleteTimetable(@PathVariable int id)
	{
		return timetableservice.deleteTimeTableById(id);
	}
	
	@PutMapping("/timetable/{id}")
	public ResponseEntity<Object> updateTimetable(@RequestBody TimeTable timeTable,@PathVariable int id)
	{
		return timetableservice.updateTimeTable(timeTable, id);
	}
	
	
	// meeting
	@GetMapping("/meetings")
	public ResponseEntity<List<Meeting>> getMeetingList()
	{
		return meetingservice.getAllMeetings();
	}
	
	@GetMapping("/meeting/{id}")
	public ResponseEntity<Object> getMeeting(@PathVariable int id)
	{
		return meetingservice.getMeetingById(id);
	}
	
	@PostMapping("/meeting")
	public ResponseEntity<Object> addMeeting(@RequestBody Meeting meeting)
	{
		return meetingservice.saveMeeting(meeting);
	}
	
	@DeleteMapping("/meeting/{id}")
	public ResponseEntity<Object> deleteMeeting(@PathVariable int id)
	{
		return meetingservice.deleteMeetingById(id);
	}
	
	@PutMapping("/meeting/{id}")
	public ResponseEntity<Object> updayeMeeting(@RequestBody Meeting meeting,@PathVariable int id)
	{
		return meetingservice.updateMeeting(meeting, id);
	}
		
}
