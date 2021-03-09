package com.school.app.service.interfaces;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.school.app.model.Activity;

public interface ActivityService
{
	public ResponseEntity<Object> saveActivity(Activity activity);
	
	public ResponseEntity<List<Activity>> getAllActivities();
	
	public ResponseEntity<Object> getActivityById(int id);
	
 	public ResponseEntity<Object> updateActivity(Activity activity,int id);
 	
 	public ResponseEntity<Object> deleteActivityById(int id);
}
