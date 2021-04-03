package com.school.app.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class TimeTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
	@GenericGenerator(name="native",strategy = "native")
	@Column(updatable = false,length = 3)
	private int timetableId; 
	
	@ManyToOne
	private Standard standard;
	
	/*@ManyToOne
	private Teacher teacher;
	
	@ManyToOne
	private UserType usertype;*/
	
	@ManyToOne
	private Division division;
	
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
	public TimeTable(int timetableId, Standard standard, Division division,
			@NotNull @Size(max = 255) String timetableFile) {
		super();
		this.timetableId = timetableId;
		this.standard = standard;
		this.division = division;
		this.timetableFile = timetableFile;
	}

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

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

	public String getTimetableFile() {
		return timetableFile;
	}

	public void setTimetableFile(String timetableFile) {
		this.timetableFile = timetableFile;
	}

	@Override
	public String toString() {
		return "TimeTable [timetableId=" + timetableId + ", standard=" + standard + ", division=" + division
				+ ", timetableFile=" + timetableFile + "]";
	}

	//getters and setters
	
}
