package com.school.app.model;

import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"userName"}))
public class Teacher 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 2,updatable = false)
	private int teacherId;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Standard> standard;
	
	@ManyToMany(mappedBy = "teacher",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Subject> subject;
	
	@OneToMany(mappedBy = "teacher",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<TimeTable> timeTable;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,nullable = false,unique = true)
	// i had defined unique constraint of this above in @Table notation.
	private String userName;
	
	@NotNull
	@Size(min = 8,max = 15)
	@Column(length = 15,nullable = false)
	private String password;
	
	@NotNull
	@Size(max = 50)
	@Column(length = 50,nullable = false)
	private String teacherName;
	
	@NotNull
	@Size(max = 6)
	@Column(length = 6,nullable = false)
	private String gender;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date joiningDate;
	
	@NotNull
	@Size(max = 40)
	@Column(length = 40,nullable = false)
	private String qualification;
	
	@NotNull
	@Size(max = 40)
	@Column(length = 40,nullable = false)
	private String emailId;
	
	@NotNull
	@Size(max = 10)
	@Column(length = 10,nullable = false)
	private String contactno;
	
	@NotNull
	@Size(max = 100)
	@Column(length = 100,nullable = false)
	private String address1;
	
	@NotNull
	@Size(max = 100)
	@Column(length = 100,nullable = false)
	private String address2;
	
	@NotNull
	@Size(max = 6)
	@Column(length = 6,nullable = false)
	private int pincode;
	
	@NotNull
	@Size(max = 255)
	@Column(length = 255,nullable = false)
	private String image;

	//default Constructor
	public Teacher() 
	{
		super();
	}

	//Parameterized Constructor
	public Teacher(int teacherId, List<Standard> standard, List<Subject> subject, List<TimeTable> timeTable,
			@NotNull @Size(max = 20) String userName, @NotNull @Size(min = 8, max = 15) String password,
			@NotNull @Size(max = 50) String teacherName, @NotNull @Size(max = 6) String gender,
			@NotNull Date joiningDate, @NotNull @Size(max = 40) String qualification,
			@NotNull @Size(max = 40) String emailId, @NotNull @Size(max = 10) String contactno,
			@NotNull @Size(max = 100) String address1, @NotNull @Size(max = 100) String address2,
			@NotNull @Size(max = 6) int pincode, @NotNull @Size(max = 255) String image) {
		super();
		this.teacherId = teacherId;
		this.standard = standard;
		this.subject = subject;
		this.timeTable = timeTable;
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
		this.image = image;
	}

	//getters and setters
	public int getTeacherId() 
	{
		return teacherId;
	}

	public void setTeacherId(int teacherId) 
	{
		this.teacherId = teacherId;
	}

	public List<Standard> getStandard()
	{
		return standard;
	}

	public void setStandard(List<Standard> standard) 
	{
		this.standard = standard;
	}

	public List<Subject> getSubject()
	{
		return subject;
	}

	public void setSubject(List<Subject> subject)
	{
		this.subject = subject;
	}

	public List<TimeTable> getTimeTable()
	{
		return timeTable;
	}

	public void setTimeTable(List<TimeTable> timeTable)
	{
		this.timeTable = timeTable;
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

	public String getImage()
	{
		return image;
	}

	public void setImage(String image) 
	{
		this.image = image;
	}

	@Override
	public String toString() 
	{
		return "Teacher [teacherId=" + teacherId + ", standard=" + standard + ", subject=" + subject + ", timeTable="
				+ timeTable + ", userName=" + userName + ", password=" + password + ", teacherName=" + teacherName
				+ ", gender=" + gender + ", joiningDate=" + joiningDate + ", qualification=" + qualification
				+ ", emailId=" + emailId + ", contactno=" + contactno + ", address1=" + address1 + ", address2="
				+ address2 + ", pincode=" + pincode + ", image=" + image + "]";
	}
	
}
