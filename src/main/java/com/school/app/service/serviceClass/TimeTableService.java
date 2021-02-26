package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.TimeTable;

public interface TimeTableService
{
	public  TimeTable saveTimeTable(TimeTable timeTable);
	
	public List<TimeTable> getAllTimeTables();
	
	public  TimeTable getTimeTableById(int id);
	
 	public  TimeTable updateTimeTable(int id, TimeTable timeTable);
 	
 	public void deleteTimeTableById(int id);
 	
 	public void deleteAllTimeTables();
}
