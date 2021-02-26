package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.Event;

public interface EventService
{
	public Event saveEvent(Event event);
	
	public List<Event> getAllEvents();
	
	//public Event getEventyById(int id);
	
 	public Event updateEvent(int id,Event event);
 	
 	//public void deleteEventyById(int id);
 	
 	public void deleteAllEvents();
}
