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
	private List<User> user;
	
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
	public UserType(int usertypeId, List<User> user, List<Meeting> meeting, @Size(max = 7) @NotNull String userType) {
		super();
		this.usertypeId = usertypeId;
		this.user = user;
		this.meeting = meeting;
		this.userType = userType;
	}

	public int getUsertypeId() {
		return usertypeId;
	}

	public void setUsertypeId(int usertypeId) {
		this.usertypeId = usertypeId;
	}

	/*public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public List<Meeting> getMeeting() {
		return meeting;
	}

	public void setMeeting(List<Meeting> meeting) {
		this.meeting = meeting;
	}*/

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}