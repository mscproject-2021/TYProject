package com.school.app.service.interfaces;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.school.app.model.Event;

public interface EventService 
{
	public ResponseEntity<Object> saveEvent(Event event);
	
	public ResponseEntity<List<Event>> getAllEvents();
	
	public ResponseEntity<Object> getEventyById(int id);
	
 	public ResponseEntity<Object> updateEvent(Event event,int id);
 	
 	public ResponseEntity<Object> deleteEventyById(int id);
}
