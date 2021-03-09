package com.school.app.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.Holiday;
import com.school.app.repository.HolidayRepository;
import com.school.app.service.interfaces.HolidayService;

public class HolidayServiceImpl implements HolidayService
{
	@Autowired
	private HolidayRepository holidayrepository;
	
	@Override
	public ResponseEntity<Object> saveHoliday(Holiday holiday) 
	{
		try
		{
			Holiday add_holiday = holidayrepository.save(holiday);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_holiday);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

	@Override
	public ResponseEntity<List<Holiday>> getAllHolidays() 
	{
		List<Holiday> holiday_list = (List<Holiday>)holidayrepository.findAll();
		if(holiday_list.size() < 1)
		{
			throw new ResourceNotFoundException("holiday list not found");
		}
		return ResponseEntity.status(HttpStatus.OK).body(holiday_list);
	}

	@Override
	public ResponseEntity<Object> getHolidayById(int id)
	{
		Holiday holiday =  holidayrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("holiday not found for id" + id));
		return ResponseEntity.status(HttpStatus.OK).body(holiday);
	}

	@Override
	public ResponseEntity<Object> deleteHolidayById(int id) 
	{	
		holidayrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("holiday not found for id" + id));
		holidayrepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("successfully deleted");
	}

	@Override
	public ResponseEntity<Object> updateHoliday(Holiday holiday, int id)
	{
		Holiday holidayById =  holidayrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Holiday not found for id" + id));
		try
		{
			holidayById.setHolidayDescription(holiday.getHolidayDescription());
			holidayById.setHolidayEnddate(holiday.getHolidayEnddate());
			holidayById.setHolidayName(holiday.getHolidayName());
			holidayById.setHolidayStartdate(holiday.getHolidayStartdate());
			
			holidayrepository.save(holidayById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(holidayById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}
}
