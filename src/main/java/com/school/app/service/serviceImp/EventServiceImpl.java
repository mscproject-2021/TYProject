package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.Event;
import com.school.app.repository.EventRepository;
import com.school.app.service.serviceClass.EventService;

@Service
public class EventServiceImpl implements EventService
{
	
	@Autowired
	EventRepository eventrepository;
	
	@Override
	public Event saveEvent(Event event) 
	{
		return eventrepository.save(event);
	}

	@Override
	public List<Event> getAllEvents() 
	{
		return (List<Event>)eventrepository.findAll();
	}

	@Override
	public Event updateEvent(int id, Event event)
	{
		return eventrepository.save(event);
	}

	@Override
	public void deleteAllEvents() 
	{
		eventrepository.deleteAll();
	}

}
