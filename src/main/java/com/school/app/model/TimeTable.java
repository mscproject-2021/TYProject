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
	
	//one standard has many timetable
	@ManyToOne
	private Standard standard;
	
	//one teacher has many timetable
	@ManyToOne
	private Teacher teacher;
	
	//many users are belong to one timetable
	@ManyToOne
	private UserType userType;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "file",length = 255 ,nullable = false)
	private String timetableFile;
}
