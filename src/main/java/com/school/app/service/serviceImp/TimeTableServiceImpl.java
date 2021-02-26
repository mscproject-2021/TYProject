package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.TimeTable;
import com.school.app.repository.TimeTableRepository;
import com.school.app.service.serviceClass.TimeTableService;

@Service
public class TimeTableServiceImpl implements TimeTableService
{
	@Autowired
	TimeTableRepository timetablerepository;
	
	@Override
	public TimeTable saveTimeTable(TimeTable timeTable)
	{
		return timetablerepository.save(timeTable);
	}

	@Override
	public List<TimeTable> getAllTimeTables() 
	{
		// TODO Auto-generated method stub
		return (List<TimeTable>)timetablerepository.findAll();
	}

	@Override
	public TimeTable getTimeTableById(int id) 
	{
		return timetablerepository.findById(id).get();
	}

	@Override
	public TimeTable updateTimeTable(int id, TimeTable timeTable) 
	{
		return timetablerepository.save(timeTable);
	}

	@Override
	public void deleteTimeTableById(int id)
	{
		timetablerepository.deleteById(id);
	}

	@Override
	public void deleteAllTimeTables() 
	{
		timetablerepository.deleteAll();
	}
	
}
