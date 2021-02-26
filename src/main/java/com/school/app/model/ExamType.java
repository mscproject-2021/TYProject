package com.school.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class ExamType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(updatable = false,length = 1)
	private int examtypeId;
	
	@OneToMany(fetch = FetchType.LAZY)
	private Result result;
	
	@NotNull
	@Column(length = 15,nullable = false)
	@Size(max = 15)
	private String examtypeName;
	
	@Column(length = 100)
	@Size(max = 100)
	private String examtypeDescription;

	//default Constructor
	public ExamType() 
	{
		super();
	}

	//Parameterized Constructor
	public ExamType(int examtypeId, Result result, @NotNull @Size(max = 15) String examtypeName,
			@Size(max = 100) String examtypeDescription)
	{
		super();
		this.examtypeId = examtypeId;
		this.result = result;
		this.examtypeName = examtypeName;
		this.examtypeDescription = examtypeDescription;
	}

	//getters and setters
	public int getExamtypeId()
	{
		return examtypeId;
	}

	public void setExamtypeId(int examtypeId) 
	{
		this.examtypeId = examtypeId;
	}

	public Result getResult() 
	{
		return result;
	}

	public void setResult(Result result)
	{
		this.result = result;
	}

	public String getExamtypeName() 
	{
		return examtypeName;
	}

	public void setExamtypeName(String examtypeName) 
	{
		this.examtypeName = examtypeName;
	}

	public String getExamtypeDescription()
	{
		return examtypeDescription;
	}

	public void setExamtypeDescription(String examtypeDescription)
	{
		this.examtypeDescription = examtypeDescription;
	}

	@Override
	public String toString() 
	{
		return "ExamType [examtypeId=" + examtypeId + ", result=" + result + ", examtypeName=" + examtypeName
				+ ", examtypeDescription=" + examtypeDescription + "]";
	}
}
