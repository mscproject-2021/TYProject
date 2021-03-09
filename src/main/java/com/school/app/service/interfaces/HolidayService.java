package com.school.app.service.interfaces;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.school.app.model.Holiday;

public interface HolidayService 
{
	public  ResponseEntity<Object> saveHoliday(Holiday holiday);
	
	public ResponseEntity<List<Holiday>> getAllHolidays();
	
	public  ResponseEntity<Object> getHolidayById(int id);
	
	public  ResponseEntity<Object> updateHoliday(Holiday holiday,int id);
 	
 	public ResponseEntity<Object> deleteHolidayById(int id);
 	
}
