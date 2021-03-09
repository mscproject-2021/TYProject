package com.school.app.service.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.school.app.model.TimeTable;


public interface TimetableService 
{
	public  ResponseEntity<Object> saveTimeTable(TimeTable timeTable);
	
	public ResponseEntity<List<TimeTable>> getAllTimeTables();
	
	public  ResponseEntity<Object> getTimeTableById(int id);
 	
 	public ResponseEntity<Object> deleteTimeTableById(int id);

	public ResponseEntity<Object> updateTimeTable(TimeTable timeTable, int id);
}
