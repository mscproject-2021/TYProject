package com.school.app.service.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.Attendance;
import com.school.app.repository.AttendanceRepository;
import com.school.app.service.serviceClass.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService
{
	@Autowired
	AttendanceRepository attendancerepository;

	@Override
	public Attendance saveAttendance(Attendance attendance) 
	{
		return attendancerepository.save(attendance);
	}

	@Override
	public Attendance getAttendanceById(int id) 
	{
		return attendancerepository.findById(id).get();
	}

	@Override
	public Attendance updateAttendance(int id, Attendance attendance)
	{
		return attendancerepository.save(attendance);
	}

	@Override
	public void deleteAttendanceById(int id) 
	{
		attendancerepository.deleteById(id);
	}

	@Override
	public void deleteAllAttendances() 
	{
		attendancerepository.deleteAll();	
	}

}
