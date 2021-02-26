package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.Activity;
import com.school.app.repository.ActivityRepository;
import com.school.app.service.serviceClass.ActivityService;

@Service
public class ActivityServiceImpl implements ActivityService
{

	@Autowired
	ActivityRepository activityrepository;
	
	@Override
	public Activity saveActivity(Activity activity)
	{
		return activityrepository.save(activity);
	}

	@Override
	public List<Activity> getAllActivities()
	{
		return (List<Activity>)activityrepository.findAll();
	}

	@Override
	public Activity getActivityById(int id) 
	{
		return activityrepository.findById(id).get();
	}

	@Override
	public Activity updateActivity(int id, Activity activity)
	{
		return activityrepository.save(activity);
	}

	@Override
	public void deleteActivityById(int id) 
	{
		activityrepository.deleteById(id);		
	}

	@Override
	public void deleteAllActivities()
	{
		activityrepository.deleteAll();
		
	}

}
