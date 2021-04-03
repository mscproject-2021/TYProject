package com.school.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
//use for making unique column named user name
@Table(uniqueConstraints= @UniqueConstraint(columnNames = { "username" }))
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 10,updatable = false)
	private int userId;
	
	
	@ManyToOne
	private Parent parent;
	
	@ManyToOne
	private Admin admin;
	
	@ManyToOne
	private Teacher teacher;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,unique = true,nullable = false)
	private String username;
	
	@NotNull
	@Size(min = 8,max = 15)
	@Column(length = 15,nullable = false)
	private String password;
	
	@NotNull
	@Size(max = 50)
	@Column(length = 50,nullable = false)
	private String name;
	
	@NotNull
	@Size(max = 10)
	@Column(length = 10,nullable = false)
	private String contactNo1;
	
	@NotNull
	@Column(length = 40,nullable = false)
	@Size(max = 40)
	private String emailId;

	//default Constructor
	public User() 
	{
		super();
	}

	public User(int userId, Parent parent, Admin admin, Teacher teacher, @NotNull @Size(max = 20) String username,
			@NotNull @Size(min = 8, max = 15) String password, @NotNull @Size(max = 50) String name,
			@NotNull @Size(max = 10) String contactNo1, @NotNull @Size(max = 40) String emailId) {
		super();
		this.userId = userId;
		this.parent = parent;
		this.admin = admin;
		this.teacher = teacher;
		this.username = username;
		this.password = password;
		this.name = name;
		this.contactNo1 = contactNo1;
		this.emailId = emailId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo1() {
		return contactNo1;
	}

	public void setContactNo1(String contactNo1) {
		this.contactNo1 = contactNo1;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", parent=" + parent + ", admin=" + admin + ", teacher=" + teacher
				+ ", username=" + username + ", password=" + password + ", name=" + name + ", contactNo1=" + contactNo1
				+ ", emailId=" + emailId + "]";
	}

	
}
