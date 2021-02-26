package com.school.app.service.serviceClass;

//import java.util.List;

import com.school.app.model.Attendance;


public interface AttendanceService 
{
	public Attendance saveAttendance(Attendance attendance);
	
	//public List<Attendance> getAllAttendances();
	
	public Attendance getAttendanceById(int id);
	
 	public Attendance updateAttendance(int id,Attendance attendance);
 	
 	public void deleteAttendanceById(int id);
 	
 	public void deleteAllAttendances();
}
