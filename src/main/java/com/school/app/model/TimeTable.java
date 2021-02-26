package com.school.app.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class TimeTable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(updatable = false,length = 3)
	private int timetableId; 
	
	//one standard has many timetable
	@ManyToOne(fetch = FetchType.LAZY)
	private Standard standard;
	
	//one teacher has many timetable
	@ManyToOne(fetch = FetchType.LAZY)
	private Teacher teacher;
	
	//many users are belong to one timetable
	@ManyToOne(fetch = FetchType.LAZY)
	private UserType userType;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "file",length = 255 ,nullable = false)
	private String timetableFile;

	//default Constructor
	public TimeTable()
	{
		super();
	}

	//Parameterized Constructor
	public TimeTable(int timetableId, Standard standard, Teacher teacher, UserType userType,
			@NotNull @Size(max = 255) String timetableFile)
	{
		super();
		this.timetableId = timetableId;
		this.standard = standard;
		this.teacher = teacher;
		this.userType = userType;
		this.timetableFile = timetableFile;
	}

	//getters and setters
	public int getTimetableId() 
	{
		return timetableId;
	}

	public void setTimetableId(int timetableId) 
	{
		this.timetableId = timetableId;
	}

	public Standard getStandard() 
	{
		return standard;
	}

	public void setStandard(Standard standard) 
	{
		this.standard = standard;
	}

	public Teacher getTeacher()
	{
		return teacher;
	}

	public void setTeacher(Teacher teacher)
	{
		this.teacher = teacher;
	}

	public UserType getUserType()
	{
		return userType;
	}

	public void setUserType(UserType userType) 
	{
		this.userType = userType;
	}

	public String getTimetableFile()
	{
		return timetableFile;
	}

	public void setTimetableFile(String timetableFile)
	{
		this.timetableFile = timetableFile;
	}

	@Override
	public String toString() 
	{
		return "TimeTable [timetableId=" + timetableId + ", standard=" + standard + ", teacher=" + teacher
				+ ", userType=" + userType + ", timetableFile=" + timetableFile + "]";
	}
	
}
