package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.Holiday;

public interface HolidayService
{
	public  Holiday saveHoliday(Holiday holiday);
	
	public List<Holiday> getAllHolidays();
	
	//public  Holiday getHolidayById(int id);
	
 	public  Holiday updateHoliday(int id, Holiday holiday);
 	
 	//public void deleteHolidayById(int id);
 	
 	public void deleteAllHolidays();
}
