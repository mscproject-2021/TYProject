package com.school.app.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.TimeTable;
import com.school.app.repository.TimeTableRepository;
import com.school.app.service.interfaces.TimetableService;

@Service
public class TimetableServiceImpl implements TimetableService
{
	@Autowired
	TimeTableRepository timetablerepository;
	
	@Override
	public ResponseEntity<Object> saveTimeTable(TimeTable timeTable)
	{
		try
		{
			TimeTable add_timetable = timetablerepository.save(timeTable);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_timetable);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
	}

	@Override
	public ResponseEntity<List<TimeTable>> getAllTimeTables() 
	{
		List<TimeTable> timetable_list = (List<TimeTable>)timetablerepository.findAll();
		if(timetable_list.size() < 1)
		{
			throw new ResourceNotFoundException("Sorry! Not Found.");
		}
		return ResponseEntity.status(HttpStatus.OK).body(timetable_list);
	}

	@Override
	public ResponseEntity<Object> getTimeTableById(int id) 
	{
		TimeTable timetable =  timetablerepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		return ResponseEntity.status(HttpStatus.OK).body(timetable);
		
	}

	@Override
	public ResponseEntity<Object> deleteTimeTableById(int id)
	{
		timetablerepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		timetablerepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("TimeTable successfully deleted");

	}
	
	@Override
	public ResponseEntity<Object> updateTimeTable(TimeTable timeTable,int id) 
	{
		TimeTable timetableById =  timetablerepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		try 
		{
			timetableById.setTimetableFile(timeTable.getTimetableFile());
			
			timetablerepository.save(timetableById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(timetableById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
	}

}
