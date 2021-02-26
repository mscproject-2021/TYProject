package com.school.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Component
@Entity
public class Standard 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 2,updatable = false)
	private int standardId;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Division> division;
	
	//Add Constraint below
	@OneToMany(mappedBy = "standard",fetch = FetchType.LAZY)
	private List<Student> grNo; 
	
	//add
	@ManyToMany(mappedBy = "standard" ,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Subject> subject;
	
	@OneToMany(mappedBy = "standard",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Standard> timetable;
	
	@ManyToMany(mappedBy = "standard",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Teacher> teacher;
	
	@ManyToMany(mappedBy = "standard",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<StudyMaterial> studyMaterial;
	
	@OneToMany(mappedBy = "standard",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Result> result;
	
	@NotNull
	@Size(max = 2)
	@Column(length = 2,nullable = false)
	private int standardName;
	
	@NotNull
	@Size(max = 3)
	@Column(length = 3,nullable = false)
	private int noOfStudents;
	
	@NotNull
	@Size(max = 2)
	@Column(length = 2,nullable = false)
	private int noOfSubjects;

	//default Constructor
	public Standard() 
	{
		super();
	}

	//Parameterized Constructor
	public Standard(int standardId, List<Division> division, List<Student> grNo, List<Subject> subject,
			List<Standard> timetable, List<Teacher> teacher, List<StudyMaterial> studyMaterial, List<Result> result,
			@NotNull @Size(max = 2) int standardName, @NotNull @Size(max = 3) int noOfStudents,
			@NotNull @Size(max = 2) int noOfSubjects)
	{
		super();
		this.standardId = standardId;
		this.division = division;
		this.grNo = grNo;
		this.subject = subject;
		this.timetable = timetable;
		this.teacher = teacher;
		this.studyMaterial = studyMaterial;
		this.result = result;
		this.standardName = standardName;
		this.noOfStudents = noOfStudents;
		this.noOfSubjects = noOfSubjects;
	}

	//getters and setters
	public int getStandardId() 
	{
		return standardId;
	}

	public void setStandardId(int standardId) 
	{
		this.standardId = standardId;
	}

	public List<Division> getDivision()
	{
		return division;
	}

	public void setDivision(List<Division> division)
	{
		this.division = division;
	}

	public List<Student> getGrNo() 
	{
		return grNo;
	}

	public void setGrNo(List<Student> grNo)
	{
		this.grNo = grNo;
	}

	public List<Subject> getSubject()
	{
		return subject;
	}

	public void setSubject(List<Subject> subject)
	{
		this.subject = subject;
	}

	public List<Standard> getTimetable() 
	{
		return timetable;
	}

	public void setTimetable(List<Standard> timetable)
	{
		this.timetable = timetable;
	}

	public List<Teacher> getTeacher()
	{
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) 
	{
		this.teacher = teacher;
	}

	public List<StudyMaterial> getStudyMaterial() 
	{
		return studyMaterial;
	}

	public void setStudyMaterial(List<StudyMaterial> studyMaterial) 
	{
		this.studyMaterial = studyMaterial;
	}

	public List<Result> getResult()
	{
		return result;
	}

	public void setResult(List<Result> result) 
	{
		this.result = result;
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

	@Override
	public String toString() 
	{
		return "Standard [standardId=" + standardId + ", division=" + division + ", grNo=" + grNo + ", subject="
				+ subject + ", timetable=" + timetable + ", teacher=" + teacher + ", studyMaterial=" + studyMaterial
				+ ", result=" + result + ", standardName=" + standardName + ", noOfStudents=" + noOfStudents
				+ ", noOfSubjects=" + noOfSubjects + "]";
	}	
}
