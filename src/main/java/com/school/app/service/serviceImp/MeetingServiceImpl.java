package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.Meeting;
import com.school.app.repository.MeetingRepository;
import com.school.app.service.serviceClass.MeetingService;

@Service
public class MeetingServiceImpl implements MeetingService
{

	@Autowired
	MeetingRepository meetingrepository;
	
	@Override
	public Meeting saveMeeting(Meeting meeting) 
	{
		return meetingrepository.save(meeting);
	}

	@Override
	public List<Meeting> getAllMeetings()
	{
		return (List<Meeting>)meetingrepository.findAll(); 
	}

	@Override
	public Meeting getMeetingById(int id)
	{
		return meetingrepository.findById(id).get();
	}

	@Override
	public Meeting updateMeeting(int id, Meeting meeting)
	{
		return meetingrepository.save(meeting);
	}

	@Override
	public void deleteMeetingById(int id) 
	{
		meetingrepository.deleteById(id);
	}

	@Override
	public void deleteAllMeetings()
	{
		meetingrepository.deleteAll();
	}
	
}
