package com.school.app.model;

import java.util.Date;

import javax.persistence.Entity;


//@Component
@Entity
public class Student 
{
	private int grNo;
	//foreign key of table standard
	private String firstName;
	private String middleName;
	private String lastName;
	private String motherName;
	private String fatherName;
	private int rollNo;
	private String division;
	private Date admissionDate;
	private String stream;
	private String medium;
	private String religion;
	private String subCaste;
	private String category;
	private String gender;
	private Date dateOfBirth;
	private String bloodGroup;
	private String address1;
	private String address2;
	private int pincode;
	private String previousSchoolName;
	//add one column of photo of student
	
	//getters and setters
	public int getGrNo() 
	{
		return grNo;
	}
	
	public void setGrNo(int grNo) 
	{
		this.grNo = grNo;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getMiddleName() 
	{
		return middleName;
	}
	
	public void setMiddleName(String middleName) 
	{
		this.middleName = middleName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public String getMotherName() 
	{
		return motherName;
	}
	
	public void setMotherName(String motherName) 
	{
		this.motherName = motherName;
	}
	
	public String getFatherName() 
	{
		return fatherName;
	}
	
	public void setFatherName(String fatherName) 
	{
		this.fatherName = fatherName;
	}
	
	public int getRollNo() 
	{
		return rollNo;
	}
	
	public void setRollNo(int rollNo) 
	{
		this.rollNo = rollNo;
	}
	
	public String getDivision() 
	{
		return division;
	}
	
	public void setDivision(String division) 
	{
		this.division = division;
	}
	
	public Date getAdmissionDate() 
	{
		return admissionDate;
	}
	
	public void setAdmissionDate(Date admissionDate) 
	{
		this.admissionDate = admissionDate;
	}
	
	public String getStream() 
	{
		return stream;
	}
	
	public void setStream(String stream) 
	{
		this.stream = stream;
	}
	
	public String getMedium() 
	{
		return medium;
	}
	
	public void setMedium(String medium) 
	{
		this.medium = medium;
	}
	
	public String getReligion() 
	{
		return religion;
	}
	
	public void setReligion(String religion) 
	{
		this.religion = religion;
	}
	
	public String getSubCaste() 
	{
		return subCaste;
	}
	
	public void setSubCaste(String subCaste) 
	{
		this.subCaste = subCaste;
	}
	
	public String getCategory() 
	{
		return category;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public Date getDateOfBirth() 
	{
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) 
	{
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getBloodGroup()
	{
		return bloodGroup;
	}
	
	public void setBloodGroup(String bloodGroup)
	{
		this.bloodGroup = bloodGroup;
	}
	
	public String getAddress1() 
	{
		return address1;
	}
	
	public void setAddress1(String address1) 
	{
		this.address1 = address1;
	}
	
	public String getAddress2() 
	{
		return address2;
	}
	
	public void setAddress2(String address2) 
	{
		this.address2 = address2;
	}
	
	public int getPincode() 
	{
		return pincode;
	}
	
	public void setPincode(int pincode) 
	{
		this.pincode = pincode;
	}
	
	public String getPreviousSchoolName() 
	{
		return previousSchoolName;
	}
	
	public void setPreviousSchoolName(String previousSchoolName) 
	{
		this.previousSchoolName = previousSchoolName;
	}
	
	//parameterized constructor
	public Student(int grNo, String firstName, String middleName, String lastName, String motherName, String fatherName,
			int rollNo, String division, Date admissionDate, String stream, String medium, String religion,
			String subCaste, String category, String gender, Date dateOfBirth, String bloodGroup, String address1,
			String address2, int pincode, String previousSchoolName) 
	{
		super();
		this.grNo = grNo;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.rollNo = rollNo;
		this.division = division;
		this.admissionDate = admissionDate;
		this.stream = stream;
		this.medium = medium;
		this.religion = religion;
		this.subCaste = subCaste;
		this.category = category;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.bloodGroup = bloodGroup;
		this.address1 = address1;
		this.address2 = address2;
		this.pincode = pincode;
		this.previousSchoolName = previousSchoolName;
	}
	
	//default constructor
	public Student() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//toString 
	@Override
	public String toString() 
	{
		return "Student [grNo=" + grNo + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", motherName=" + motherName + ", fatherName=" + fatherName + ", rollNo=" + rollNo
				+ ", division=" + division + ", admissionDate=" + admissionDate + ", stream=" + stream + ", medium="
				+ medium + ", religion=" + religion + ", subCaste=" + subCaste + ", category=" + category + ", gender="
				+ gender + ", dateOfBirth=" + dateOfBirth + ", bloodGroup=" + bloodGroup + ", address1=" + address1
				+ ", address2=" + address2 + ", pincode=" + pincode + ", previousSchoolName=" + previousSchoolName
				+ "]";
	}
	
	
}


