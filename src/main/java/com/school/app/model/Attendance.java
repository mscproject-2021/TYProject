package com.school.app.model;

import java.time.Year;

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
public class Attendance {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(updatable = false,length = 5)
	private int attendanceId;
	
	// one Student has many attendance
	@ManyToOne(fetch = FetchType.LAZY)
	private Student student;
	
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

	//default Constructor
	public Attendance()
	{
		super();
	}

	//Parameterized Constructor
	public Attendance(int attendanceId, Student student, @NotNull @Size(max = 2) int totalDays,
			@NotNull @Size(min = 1, max = 2) int presentDays, @NotNull @Size(min = 1, max = 2) int absentDays,
			@NotNull @Size(max = 10) String month, @NotNull @Size(max = 4) Year year) 
	{
		super();
		this.attendanceId = attendanceId;
		this.student = student;
		this.totalDays = totalDays;
		this.presentDays = presentDays;
		this.absentDays = absentDays;
		Month = month;
		this.year = year;
	}

	//getters and setters
	public int getAttendanceId() 
	{
		return attendanceId;
	}

	public void setAttendanceId(int attendanceId)
	{
		this.attendanceId = attendanceId;
	}

	public Student getStudent() 
	{
		return student;
	}

	public void setStudent(Student student) 
	{
		this.student = student;
	}

	public int getTotalDays() 
	{
		return totalDays;
	}

	public void setTotalDays(int totalDays) 
	{
		this.totalDays = totalDays;
	}

	public int getPresentDays()
	{
		return presentDays;
	}

	public void setPresentDays(int presentDays)
	{
		this.presentDays = presentDays;
	}

	public int getAbsentDays() 
	{
		return absentDays;
	}

	public void setAbsentDays(int absentDays) 
	{
		this.absentDays = absentDays;
	}

	public String getMonth() 
	{
		return Month;
	}

	public void setMonth(String month)
	{
		Month = month;
	}

	public Year getYear() 
	{
		return year;
	}

	public void setYear(Year year)
	{
		this.year = year;
	}

	@Override
	public String toString() 
	{
		return "Attendance [attendanceId=" + attendanceId + ", student=" + student + ", totalDays=" + totalDays
				+ ", presentDays=" + presentDays + ", absentDays=" + absentDays + ", Month=" + Month + ", year=" + year
				+ "]";
	}
	
}