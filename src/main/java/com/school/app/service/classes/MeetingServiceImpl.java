package com.school.app.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.Meeting;
import com.school.app.repository.MeetingRepository;
import com.school.app.service.interfaces.MeetingService;

@Service
public class MeetingServiceImpl implements MeetingService
{
	@Autowired
	MeetingRepository meetingrepository;
	
	@Override
	public ResponseEntity<Object> saveMeeting(Meeting meeting) 
	{
		try
		{
			Meeting add_meeting = meetingrepository.save(meeting);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_meeting);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

	@Override
	public ResponseEntity<List<Meeting>> getAllMeetings() 
	{
		List<Meeting> meeting_list = (List<Meeting>)meetingrepository.findAll();
		if(meeting_list.size() < 1)
		{
			throw new ResourceNotFoundException("meeting list not found");
		}
		return ResponseEntity.status(HttpStatus.OK).body(meeting_list);
	}

	@Override
	public ResponseEntity<Object> getMeetingById(int id) 
	{
		Meeting meeting =  meetingrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("meeting not found for id" + id));
		return ResponseEntity.status(HttpStatus.OK).body(meeting);
	}

	@Override
	public ResponseEntity<Object> deleteMeetingById(int id)
	{
		meetingrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("meeting not found for id" + id));
		meetingrepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("successfully deleted");
	}

	@Override
	public ResponseEntity<Object> updateMeeting(Meeting meeting,int id) 
	{
		Meeting meetingById =  meetingrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("meeting not found for id" + id));
		try 
		{
			meetingById.setMeetingDate(meeting.getMeetingDate());
			meetingById.setMeetingDescription(meeting.getMeetingDescription());
			meetingById.setMeetingEndTime(meeting.getMeetingEndTime());
			meetingById.setMeetingName(meeting.getMeetingName());
			meetingById.setMeetingStartTime(meeting.getMeetingStartTime());
			
			meetingrepository.save(meetingById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(meetingById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

}
