package com.school.app.model;

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
public class UserType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 1,updatable = false)
	private int usertypeId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Login login;
	
	@Size(max = 7)
	@Column(length = 7 ,nullable = false)
	@NotNull
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
	
	//toString
	@Override
	public String toString() 
	{
		return "UserType [usertypeId=" + usertypeId + ", userType=" + userType + "]";
	}
	
}