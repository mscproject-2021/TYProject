package com.school.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class UserType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 1, columnDefinition = "TinyInt")
	private int usertypeId;
	
	@OneToMany(mappedBy = "usertype")
	private List<Login> login;
	
	@OneToMany(mappedBy = "usertype")
	private List<Meeting> meeting;
	

	@Column(length = 7 ,nullable = false)
	@Size(max = 7)
	@NotNull
	private String userType;
	
	//default Constructor
	public UserType() 
	{
		super();
	}

	//Parameterized Constructor
	public UserType(int usertypeId, List<Login> login, List<Meeting> meeting, @Size(max = 7) @NotNull String userType) {
		super();
		this.usertypeId = usertypeId;
		this.login = login;
		this.meeting = meeting;
		this.userType = userType;
	}

	//getters and setters
	public int getUsertypeId() {
		return usertypeId;
	}

	

	public void setUsertypeId(int usertypeId) {
		this.usertypeId = usertypeId;
	}
	
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	/*public List<Login> getLogin() {
		return login;
	}

	public void setLogin(List<Login> login) {
		this.login = login;
	}

	public List<Meeting> getMeeting() {
		return meeting;
	}

	public void setMeeting(List<Meeting> meeting) {
		this.meeting = meeting;
	}*/

	@Override
	public String toString() {
		return "UserType [usertypeId=" + usertypeId + ", login=" + login + ", meeting=" + meeting  + ", userType=" + userType + "]";
	}


}