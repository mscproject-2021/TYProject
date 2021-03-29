package com.school.app.service.interfaces;

import org.springframework.http.ResponseEntity;
import com.school.app.model.Attendance;

public interface AttendanceService
{
	public ResponseEntity<Object> saveAttendance(Attendance attendance);

	//public ResponseEntity<List<Attendance>> getAllAttendances();
	
	public ResponseEntity<Object> getAttendanceById(int id);
		
	public ResponseEntity<Object> updateAttendance(Attendance attendance,int id);
	 	
	public ResponseEntity<Object> deleteAttendanceById(int id);
	 
	//public ResponseEntity<List<Attendance>> deleteAllAttendance();
}
