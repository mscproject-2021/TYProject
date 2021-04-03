package com.school.app.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.Event;
import com.school.app.repository.EventRepository;
import com.school.app.service.interfaces.EventService;

@Service
public class EventServiceImpl implements EventService
{

	@Autowired
	private EventRepository eventrepository;
	
	@Override
	public ResponseEntity<Object> saveEvent(Event event) 
	{
		try
		{
			Event add_event = eventrepository.save(event);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_event);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
	}

	@Override
	public ResponseEntity<List<Event>> getAllEvents() 
	{
		List<Event> event_list = (List<Event>)eventrepository.findAll();
		if(event_list.size() < 1)
		{
			throw new ResourceNotFoundException("Sorry! Not Found.");
		}
		return ResponseEntity.status(HttpStatus.OK).body(event_list);
	}

	@Override
	public ResponseEntity<Object> getEventyById(int id) 
	{
		Event event =  eventrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		return ResponseEntity.status(HttpStatus.OK).body(event);
	}

	@Override
	public ResponseEntity<Object> deleteEventyById(int id) 
	{
		eventrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		eventrepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Event successfully deleted");
	}

	@Override
	public ResponseEntity<Object> updateEvent(Event event, int id) 
	{
		Event eventById =  eventrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		try
		{
			eventById.setEventDescription(event.getEventDescription());
			eventById.setEventEnddate(event.getEventEnddate());
			eventById.setEventEndtime(event.getEventEndtime());
			eventById.setEventName(event.getEventName());
			eventById.setEventStartdate(event.getEventStartdate());
			eventById.setEventStartdate(event.getEventStartdate());
			
			eventrepository.save(eventById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(eventById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
	}

}
