package com.school.app.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class TimeTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false,length = 3)
	private int timetableId; 
	
	@ManyToOne
	private Standard standard;
	
	@ManyToOne
	private Teacher teacher;
	
	@ManyToOne
	private UserType usertype;
	
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
	public TimeTable(int timetableId, Standard standard, Teacher teacher, UserType usertype,
			@NotNull @Size(max = 255) String timetableFile) {
		super();
		this.timetableId = timetableId;
		this.standard = standard;
		this.teacher = teacher;
		this.usertype = usertype;
		this.timetableFile = timetableFile;
	}

	//getters and setters
	public int getTimetableId() {
		return timetableId;
	}

	public void setTimetableId(int timetableId) {
		this.timetableId = timetableId;
	}

	public Standard getStandard() {
		return standard;
	}

	public void setStandard(Standard standard) {
		this.standard = standard;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public UserType getUsertype() {
		return usertype;
	}

	public void setUsertype(UserType usertype) {
		this.usertype = usertype;
	}

	public String getTimetableFile() {
		return timetableFile;
	}

	public void setTimetableFile(String timetableFile) {
		this.timetableFile = timetableFile;
	}

	@Override
	public String toString() {
		return "TimeTable [timetableId=" + timetableId + ", standard=" + standard + ", teacher=" + teacher
				+ ", usertype=" + usertype + ", timetableFile=" + timetableFile + "]";
	}	
}
