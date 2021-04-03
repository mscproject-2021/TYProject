package com.school.app.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.Activity;
import com.school.app.repository.ActivityRepository;
import com.school.app.service.interfaces.ActivityService;

@Service
public class ActivityServiceImpl implements ActivityService
{
	@Autowired
	private ActivityRepository activityrepository;
	
	@Override
	public ResponseEntity<Object> saveActivity(Activity activity) 
	{
		try
		{
			Activity add_activity = activityrepository.save(activity);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_activity);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
	}

	@Override
	public ResponseEntity<List<Activity>> getAllActivities() 
	{
		List<Activity> activity_list = (List<Activity>)activityrepository.findAll();
		if(activity_list.size() < 1)
		{
			throw new ResourceNotFoundException("Sorry! Not Found");
		}
		return ResponseEntity.status(HttpStatus.OK).body(activity_list);
	}

	@Override
	public ResponseEntity<Object> getActivityById(int id)
	{
		Activity activity =  activityrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for : " + id));
		return ResponseEntity.status(HttpStatus.OK).body(activity);
	}

	@Override
	public ResponseEntity<Object> deleteActivityById(int id) 
	{
		activityrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		activityrepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Activity Successfully deleted.");
	}

	@Override
	public ResponseEntity<Object> updateActivity(Activity activity, int id) 
	{
		Activity activityById =  activityrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Activity not found for id" + id));
		try
		{
			activityById.setAchievementDescription(activity.getAchievementDescription());
			activityById.setAchievementName(activity.getAchievementName());
			activityById.setActivityName(activity.getActivityName());
			
			activityrepository.save(activityById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(activityById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
	}
}
