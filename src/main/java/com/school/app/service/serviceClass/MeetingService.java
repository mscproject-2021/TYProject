package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.Meeting;

public interface MeetingService
{
	public  Meeting saveMeeting(Meeting meeting);
	
	public List<Meeting> getAllMeetings();
	
	public  Meeting getMeetingById(int id);
	
 	public  Meeting updateMeeting(int id, Meeting meeting);
 	
 	public void deleteMeetingById(int id);
 	
 	public void deleteAllMeetings();
}
