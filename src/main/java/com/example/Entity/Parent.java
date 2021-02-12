package com.example.Entity;

import javax.persistence.Entity;

//@Component
@Entity
public class Parent 
{
	private int parentId;
	
	//Define relationship with generalize class parent_student
	//
	
	private int noOfChild;
	private String userName;
	private String password;
	private String parentName;
	private String emailId;
	private String contactNo1;
	private String contactNo2;
	private String qualification;
	private String occupation;
	
	//getters and setters
	public int getParentId()
	{
		return parentId;
	}
	
	public void setParentId(int parentId)
	{
		this.parentId = parentId;
	}
	
	public int getNoOfChild() 
	{
		return noOfChild;
	}
	
	public void setNoOfChild(int noOfChild) 
	{
		this.noOfChild = noOfChild;
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
	
	public String getParentName()
	{
		return parentName;
	}
	
	public void setParentName(String parentName)
	{
		this.parentName = parentName;
	}
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) 
	{
		this.emailId = emailId;
	}
	
	public String getContactNo1() 
	{
		return contactNo1;
	}
	
	public void setContactNo1(String contactNo1) 
	{
		this.contactNo1 = contactNo1;
	}
	
	public String getContactNo2() 
	{
		return contactNo2;
	}
	
	public void setContactNo2(String contactNo2)
	{
		this.contactNo2 = contactNo2;
	}
	
	public String getQualification() 
	{
		return qualification;
	}
	
	public void setQualification(String qualification)
	{
		this.qualification = qualification;
	}
	
	public String getOccupation() 
	{
		return occupation;
	}
	
	public void setOccupation(String occupation) 
	{
		this.occupation = occupation;
	}
	
	//parameterized constructor
	public Parent(int parentId, int noOfChild, String userName, String password, String parentName, String emailId,
			String contactNo1, String contactNo2, String qualification, String occupation) {
		super();
		this.parentId = parentId;
		this.noOfChild = noOfChild;
		this.userName = userName;
		this.password = password;
		this.parentName = parentName;
		this.emailId = emailId;
		this.contactNo1 = contactNo1;
		this.contactNo2 = contactNo2;
		this.qualification = qualification;
		this.occupation = occupation;
	}
	
	//default Constructor
	public Parent() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//toString Method
	@Override
	public String toString() 
	{
		return "Parent [parentId=" + parentId + ", noOfChild=" + noOfChild + ", userName=" + userName + ", password="
				+ password + ", parentName=" + parentName + ", emailId=" + emailId + ", contactNo1=" + contactNo1
				+ ", contactNo2=" + contactNo2 + ", qualification=" + qualification + ", occupation=" + occupation
				+ "]";
	}
	
	
}
