package com.school.app.model;

import java.time.Year;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Attendance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false,length = 5)
	private int attendanceId;
	
	// one Student has many attendance
	@OneToMany
	private List<Student> student;
	
	@NotNull
	@Column(length = 2,nullable = false)
	@Size(max = 2)
	private int totalDays;
	
	@NotNull
	@Column(length = 2,nullable = false)
	@Size(min = 1, max = 2)
	private int presentDays;
	
	@NotNull
	@Column(length = 2,nullable = false)
	@Size(min = 1, max = 2)
	private int absentDays;
	
	@NotNull
	@Column(length = 10,nullable = false)
	@Size(max = 10)
	private String Month;
	
	// i add year here
	@NotNull
	@Column(length = 4,nullable = false)
	@Size(max = 4)
	private Year year;
}