package com.school.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;


//@Component
@Entity
public class Standard 
{
	@Id
	private int standardId;
	private int standardName;
	private int noOfStudents;
	private int noOfSubjects;
	
	//getters and setters
	public int getStandardId() 
	{
		return standardId;
	}

	public void setStandardId(int standardId)
	{
		this.standardId = standardId;
	}

	public int getStandardName() 
	{
		return standardName;
	}

	public void setStandardName(int standardName) 
	{
		this.standardName = standardName;
	}

	public int getNoOfStudents() 
	{
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) 
	{
		this.noOfStudents = noOfStudents;
	}

	public int getNoOfSubjects() 
	{
		return noOfSubjects;
	}

	public void setNoOfSubjects(int noOfSubjects)
	{
		this.noOfSubjects = noOfSubjects;
	}

	//parameterized constructor
	public Standard(int standardId, int standardName, int noOfStudents, int noOfSubjects)
	{
		super();
		this.standardId = standardId;
		this.standardName = standardName;
		this.noOfStudents = noOfStudents;
		this.noOfSubjects = noOfSubjects;
	}

	//default constructor
	public Standard() {
		super();
		// TODO Auto-generated constructor stub
	}

	//tostring method
	@Override
	public String toString() {
		return "Standard [standardId=" + standardId + ", standardName=" + standardName + ", noOfStudents="
				+ noOfStudents + ", noOfSubjects=" + noOfSubjects + "]";
	}
	
	
	
}

