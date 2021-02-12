package com.example.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Component
@Entity
public class Teacher 
{
	@Id
	private int teacherId;
	
	//column is remaining of foreign key
	//of normalized table teacher subject.
	
	//column is remaining of foreign key
	//of normalized table teacher standard.
	
	private String userName;
	private String password;
	private String teacherName;
	private String gender;
	private Date joiningDate;
	private String qualification;
	private String emailId;
	private String contactno;
	private String address1;
	private String address2;
	private int pincode;
	
	//create column of storing path of image 
	
	
	//getters and setters
	public int getTeacherId() 
	{
		return teacherId;
	}
	
	public void setTeacherId(int teacherId) 
	{
		this.teacherId = teacherId;
	}
	
	public String getUserName() 
	{
		return userName;
	}
	
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public String getTeacherName() 
	{
		return teacherName;
	}
	
	public void setTeacherName(String teacherName)
	{
		this.teacherName = teacherName;
	}
	
	public String getGender() 
	{
		return gender;
	}
	
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	
	public Date getJoiningDate() 
	{
		return joiningDate;
	}
	
	public void setJoiningDate(Date joiningDate) 
	{
		this.joiningDate = joiningDate;
	}
	
	public String getQualification()
	{
		return qualification;
	}
	
	public void setQualification(String qualification) 
	{
		this.qualification = qualification;
	}
	
	public String getEmailId() 
	{
		return emailId;
	}
	
	public void setEmailId(String emailId) 
	{
		this.emailId = emailId;
	}
	
	public String getContactno()
	{
		return contactno;
	}
	
	public void setContactno(String contactno)
	{
		this.contactno = contactno;
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
	
	//parameterized constructor
	public Teacher(int teacherId, String userName, String password, String teacherName, String gender, Date joiningDate,
			String qualification, String emailId, String contactno, String address1, String address2, int pincode) 
	{
		super();
		this.teacherId = teacherId;
		this.userName = userName;
		this.password = password;
		this.teacherName = teacherName;
		this.gender = gender;
		this.joiningDate = joiningDate;
		this.qualification = qualification;
		this.emailId = emailId;
		this.contactno = contactno;
		this.address1 = address1;
		this.address2 = address2;
		this.pincode = pincode;
	}
	
	//default constructor
	public Teacher()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//tostring 
	@Override
	public String toString()
	{
		return "Teacher [teacherId=" + teacherId + ", userName=" + userName + ", password=" + password
				+ ", teacherName=" + teacherName + ", gender=" + gender + ", joiningDate=" + joiningDate
				+ ", qualification=" + qualification + ", emailId=" + emailId + ", contactno=" + contactno
				+ ", address1=" + address1 + ", address2=" + address2 + ", pincode=" + pincode + "]";
	}
		
}

