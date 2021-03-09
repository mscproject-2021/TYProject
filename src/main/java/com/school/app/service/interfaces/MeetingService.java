package com.school.app.service.interfaces;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.school.app.model.Meeting;

public interface MeetingService
{
	public  ResponseEntity<Object> saveMeeting(Meeting meeting);
	
	public ResponseEntity<List<Meeting>> getAllMeetings();
	
	public  ResponseEntity<Object> getMeetingById(int id);
	
 	public  ResponseEntity<Object> updateMeeting(Meeting meeting,int id);
 	
 	public ResponseEntity<Object> deleteMeetingById(int id);
}
