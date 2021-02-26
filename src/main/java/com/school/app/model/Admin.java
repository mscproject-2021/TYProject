package com.school.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



//@Component
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"username"}))
@Entity
public class Admin 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 1,updatable = false)
	private int adminId;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,nullable = false,unique = true)
	private String username;
	
	@NotNull
	@Size(min = 8,max = 15)
	@Column(length = 15,nullable = false)
	private String password;
	
	@NotNull
	@Size(max = 50)
	@Column(length = 50,nullable = false)
	private String adminName;
	
	@NotNull
	@Size(max = 10)
	@Column(length = 10,nullable = false)
	private String contactNo;
	
	@Column(length = 40,nullable = false)
	@NotNull
	@Size(max = 40)
	private String emailId;
	
	@NotNull
	@Size(max = 6)
	@Column(length = 6,nullable = false)
	private String gender;
	
	@NotNull
	@Size(max = 100)
	@Column(length = 100,nullable = false)
	private String address1;
	
	@NotNull
	@Size(max=100)
	@Column(length = 100,nullable = false)
	private String address2;
	
	@NotNull
	@Size(max = 6)
	@Column(length = 6,nullable = false)
	private int pincode;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date joiningDate;
	
	//i have change constraint of below field
	@NotNull
	@Size(max = 255)
	@Column(length = 255,nullable = false)
	private String image;
	
	//default Constructor
	public Admin() 
	{
		super();
	}
	
	//parameterized constructor
	public Admin(int adminId, String username, String password, String adminName, String contactNo, String emailId,
			String gender, String address1, String address2, int pincode, Date joiningDate)
	{
		super();
		this.adminId = adminId;
		this.username = username;
		this.password = password;
		this.adminName = adminName;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.gender = gender;
		this.address1 = address1;
		this.address2 = address2;
		this.pincode = pincode;
		this.joiningDate = joiningDate;
	
	}
	
	//getters and setters
	public int getAdminId() 
	{
		return adminId;
	}
	
	public void setAdminId(int adminId)
	{
		this.adminId = adminId;
	}
	
	public String getUsername() 
	{
		return username;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public String getAdminName() 
	{
		return adminName;
	}
	
	public void setAdminName(String adminName)
	{
		this.adminName = adminName;
	}
	
	public String getContactNo() 
	{
		return contactNo;
	}
	
	public void setContactNo(String contactNo) 
	{
		this.contactNo = contactNo;
	}
	
	public String getEmailId() 
	{
		return emailId;
	}
	
	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}
	
	public String getGender() 
	{
		return gender;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
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
	
	public Date getJoiningDate()
	{
		return joiningDate;
	}
	
	public void setJoiningDate(Date joiningDate)
	{
		this.joiningDate = joiningDate;
	}
	
	//toString method
	@Override
	public String toString() 
	{
		return "Admin [adminId=" + adminId + ", username=" + username + ", password=" + password + ", adminName="
				+ adminName + ", contactNo=" + contactNo + ", emailId=" + emailId + ", gender=" + gender + ", address1="
				+ address1 + ", address2=" + address2 + ", pincode=" + pincode + ", joiningDate=" + joiningDate
				;
	}
	
	
}
