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
public class Subject 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 2,updatable = false)
	private int subjectId;
	
	@ManyToMany
	private List<Standard> standard;
	
	@ManyToMany
	private List<Teacher> teacher;
	
	@Column(length = 15,nullable = false)
	@Size(min = 2,max = 15)
	@NotNull
	private String subjectName;

	//default Constructor
	public Subject()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized Constructor
	public Subject(int subjectId, List<Standard> standard, List<Teacher> teacher,
			@Size(min = 2, max = 15) @NotNull String subjectName)
	{
		super();
		this.subjectId = subjectId;
		this.standard = standard;
		this.teacher = teacher;
		this.subjectName = subjectName;
	}

	//getters and setters
	public int getSubjectId() 
	{
		return subjectId;
	}

	public void setSubjectId(int subjectId)
	{
		this.subjectId = subjectId;
	}

	public List<Standard> getStandard() 
	{
		return standard;
	}

	public void setStandard(List<Standard> standard)
	{
		this.standard = standard;
	}

	public List<Teacher> getTeacher() 
	{
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) 
	{
		this.teacher = teacher;
	}

	public String getSubjectName() 
	{
		return subjectName;
	}

	public void setSubjectName(String subjectName)
	{
		this.subjectName = subjectName;
	}

	@Override
	public String toString()
	{
		return "Subject [subjectId=" + subjectId + ", standard=" + standard + ", teacher=" + teacher + ", subjectName="
				+ subjectName + "]";
	}
}
