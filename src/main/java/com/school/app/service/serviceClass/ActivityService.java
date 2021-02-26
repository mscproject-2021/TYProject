package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.Activity;

public interface ActivityService 
{
	public Activity saveActivity(Activity activity);
	
	public List<Activity> getAllActivities();
	
	public Activity getActivityById(int id);
	
 	public Activity updateActivity(int id,Activity activity);
 	
 	public void deleteActivityById(int id);
 	
 	public void deleteAllActivities();
}
