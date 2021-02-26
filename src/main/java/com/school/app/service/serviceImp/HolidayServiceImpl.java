package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.Holiday;
import com.school.app.repository.HolidayRepository;
import com.school.app.service.serviceClass.HolidayService;

@Service
public class HolidayServiceImpl implements HolidayService
{

	@Autowired
	HolidayRepository holidayrepository;
	
	@Override
	public Holiday saveHoliday(Holiday holiday) 
	{
		return holidayrepository.save(holiday);
	}

	@Override
	public List<Holiday> getAllHolidays() 
	{
		return (List<Holiday>)holidayrepository.findAll();
	}

	@Override
	public Holiday updateHoliday(int id, Holiday holiday) 
	{
		return holidayrepository.save(holiday);
	}

	@Override
	public void deleteAllHolidays()
	{
		holidayrepository.deleteAll();
	}

}
