package com.school.app.model;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.CreatedDate;
import com.fasterxml.jackson.annotation.JsonFormat;



//@Component
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"username"}))
@Entity
public class Admin 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 1,updatable = false , columnDefinition = "TinyInt")
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
	
	@NotNull
	@Column(length = 40,nullable = false)
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
	@Column(length = 6,nullable = false)
	private int pincode;
	
	@NotNull
	@Column(nullable = false,columnDefinition = "DATE")
	@CreatedDate
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Calendar joiningDate;
	
	//i have change constraint of below field
	@Size(max = 255)
	@Column(length = 255)
	private String image;
	
	//default Constructor
	public Admin() 
	{
		super();
	}
	
	//parameterized constructor
	public Admin(int adminId, @NotNull @Size(max = 20) String username,
			@NotNull @Size(min = 8, max = 15) String password, @NotNull @Size(max = 50) String adminName,
			@NotNull @Size(max = 10) String contactNo, @NotNull @Size(max = 40) String emailId,
			@NotNull @Size(max = 6) String gender, @NotNull @Size(max = 100) String address1,
			@NotNull @Size(max = 100) String address2, @NotNull @Size(max = 6) int pincode, @NotNull Calendar joiningDate,
			@Size(max = 255) String image) {
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
		this.image = image;
	}

	//getters and setters
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Calendar getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Calendar joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", username=" + username + ", password=" + password + ", adminName="
				+ adminName + ", contactNo=" + contactNo + ", emailId=" + emailId + ", gender=" + gender + ", address1="
				+ address1 + ", address2=" + address2 + ", pincode=" + pincode + ", joiningDate=" + joiningDate
				+ ", image=" + image + "]";
	}
	

}
