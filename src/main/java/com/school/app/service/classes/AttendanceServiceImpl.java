package com.school.app.service.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.Attendance;
import com.school.app.repository.AttendanceRepository;
import com.school.app.service.interfaces.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService
{
	@Autowired
	private AttendanceRepository attendancerepository;

	@Override
	public ResponseEntity<Object> saveAttendance(Attendance attendance) 
	{
		try
		{
			Attendance add_attendance = attendancerepository.save(attendance);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_attendance);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

	@Override
	public ResponseEntity<Object> getAttendanceById(int id) 
	{
		Attendance attendance =  attendancerepository.findById(id).orElseThrow(()->new ResourceNotFoundException("attendance not found for id" + id));
		return ResponseEntity.status(HttpStatus.OK).body(attendance);
	}

	@Override
	public ResponseEntity<Object> updateAttendance(Attendance attendance, int id) 
	{
		Attendance attendanceById =  attendancerepository.findById(id).orElseThrow(()->new ResourceNotFoundException("attendance not found for not found for id" + id));
		try
		{
			attendanceById.setAbsentDays(attendance.getAbsentDays());
			attendanceById.setMonth(attendance.getMonth());
			attendanceById.setPresentDays(attendance.getPresentDays());
			attendanceById.setTotalDays(attendance.getTotalDays());
			attendanceById.setYear(attendance.getYear());
			
			attendancerepository.save(attendanceById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(attendanceById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

	@Override
	public ResponseEntity<Object> deleteAttendanceById(int id) 
	{
		attendancerepository.findById(id).orElseThrow(()->new ResourceNotFoundException("attendance not found for not found for id" + id));
		attendancerepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("successfully deleted");
	}
}
