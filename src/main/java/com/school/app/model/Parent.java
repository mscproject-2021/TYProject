package com.school.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"userName"}))
public class Parent 
{
	@Id
	@Column(length = 4 , updatable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int parentId;
	
	@OneToOne
	private Student student;
	
	@OneToMany(mappedBy = "parent",cascade = CascadeType.ALL)
	private List<Query> query;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,nullable = false,unique = true)
	private String userName;
	
	@NotNull
	@Size(min = 8,max = 15)
	@Column(length = 15,nullable = false)
	private String password;
	
	@NotNull
	@Size(max = 50)
	@Column(length = 50,nullable = false)
	private String parentName;
	
	@Size(max = 40)
	@Column(length = 40)
	private String emailId;
	
	@NotNull
	@Size(max = 10)
	@Column(length = 10,nullable = false)
	private String contactNo1;
	
	@Size(max = 10)
	@Column(length = 10)
	private String contactNo2;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,nullable = false)
	private String qualification;
	
	@NotNull
	@Size(max = 15)
	@Column(length = 15,nullable = false)
	private String occupation;
	
	//default Constructor
	public Parent() 
	{
		super();
	}

	//Parameterized Constructor
	public Parent(int parentId, Student student, List<Query> query,
			@NotNull @Size(max = 20) String userName, @NotNull @Size(min = 8, max = 15) String password,
			@NotNull @Size(max = 50) String parentName, @Size(max = 40) String emailId,
			@NotNull @Size(max = 10) String contactNo1, @Size(max = 10) String contactNo2,
			@NotNull @Size(max = 20) String qualification, @NotNull @Size(max = 15) String occupation) {
		super();
		this.parentId = parentId;
		this.student = student;
		this.query = query;
		this.userName = userName;
		this.password = password;
		this.parentName = parentName;
		this.emailId = emailId;
		this.contactNo1 = contactNo1;
		this.contactNo2 = contactNo2;
		this.qualification = qualification;
		this.occupation = occupation;
	}

	//getters and setters
	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

//	public List<Query> getQuery() {
//		return query;
//	}
//
//	public void setQuery(List<Query> query) {
//		this.query = query;
//	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNo1() {
		return contactNo1;
	}

	public void setContactNo1(String contactNo1) {
		this.contactNo1 = contactNo1;
	}

	public String getContactNo2() {
		return contactNo2;
	}

	public void setContactNo2(String contactNo2) {
		this.contactNo2 = contactNo2;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Override
	public String toString() {
		return "Parent [parentId=" + parentId + ", student=" + student + ", query=" + query +
				", userName=" + userName + ", password=" + password + ", parentName=" + parentName + ", emailId="
				+ emailId + ", contactNo1=" + contactNo1 + ", contactNo2=" + contactNo2 + ", qualification="
				+ qualification + ", occupation=" + occupation + "]";
	}
}
