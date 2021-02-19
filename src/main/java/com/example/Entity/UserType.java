package com.school.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.sun.istack.NotNull;

//@Component
@Entity
public class UserType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 1)
	private int usertypeId;
	
	@NotNull
	@Column(length = 7)
	private String userType;
	
	//default Constructor
	public UserType() 
	{
		super();
	}

	//Parameterized Constructor
	public UserType(int usertypeId, String userType) 
	{
		super();
		this.usertypeId = usertypeId;
		this.userType = userType;
	}
	
	//getters and setters
	public int getUsertypeId() 
	{
		return usertypeId;
	}
	
	public void setUsertypeId(int usertypeId) 
	{
		this.usertypeId = usertypeId;
	}
	
	public String getUserType() 
	{
		return userType;
	}
	
	public void setUserType(String userType) 
	{
		this.userType = userType;
	}
	
	//tostring
	@Override
	public String toString() 
	{
		return "UserType [usertypeId=" + usertypeId + ", userType=" + userType + "]";
	}
	
}

