package com.school.app.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false,length = 5)
	private int activityId;
	
	@ManyToMany(mappedBy = "activity")
	private List<Student> student;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,nullable = false)
	private String activityName;
	
	@NotNull
	@Size(max=20)
	@Column(length = 20,nullable = false)
	private String achievementName;
	
	@Size(max=100)
	@Column(length = 100)
	private String achievementDescription;

	//default Constructor
	public Activity() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized Constructor
	public Activity(int activityId, List<Student> student, @NotNull @Size(max = 20) String activityName,
			@NotNull @Size(max = 20) String achievementName, @Size(max = 100) String achievementDescription) {
		super();
		this.activityId = activityId;
		this.student = student;
		this.activityName = activityName;
		this.achievementName = achievementName;
		this.achievementDescription = achievementDescription;
	}

	//getters and setters
	public int getActivityId() 
	{
		return activityId;
	}

	public void setActivityId(int activityId) 
	{
		this.activityId = activityId;
	}

	/*public List<Student> getStudent() 
	{
		return student;
	}

	public void setStudent(List<Student> student)
	{
		this.student = student;
	}*/

	public String getActivityName()
	{
		return activityName;
	}

	public void setActivityName(String activityName)
	{
		this.activityName = activityName;
	}

	public String getAchievementName() 
	{
		return achievementName;
	}

	public void setAchievementName(String achievementName)
	{
		this.achievementName = achievementName;
	}

	public String getAchievementDescription()
	{
		return achievementDescription;
	}

	public void setAchievementDescription(String achievementDescription)
	{
		this.achievementDescription = achievementDescription;
	}

	@Override
	public String toString()
	{
		return "Activity [activityId=" + activityId + ", student=" + student + ", activityName=" + activityName
				+ ", achievementName=" + achievementName + ", achievementDescription=" + achievementDescription + "]";
	}
}
