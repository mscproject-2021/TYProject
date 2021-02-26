package com.school.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
//use for making unique column named username
@Table(uniqueConstraints= @UniqueConstraint(columnNames = { "username" }))
public class Login 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 4,updatable = false)
	private int loginId;
	
	
	@OneToMany(mappedBy = "login",fetch = FetchType.LAZY)
	private List<UserType> usertype;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,unique = true,nullable = false)
	//unique constraint is above in @Table annotation
	private String username;
	
	
	@NotNull
	@Size(min = 8,max = 15)
	@Column(length = 15,nullable = false)
	private String password;

	//default Constructor
	public Login() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized Constructor
	public Login(int loginId, List<UserType> usertype, @NotNull @Size(max = 20) String username,
			@NotNull @Size(min = 8, max = 15) String password) 
	{
		super();
		this.loginId = loginId;
		this.usertype = usertype;
		this.username = username;
		this.password = password;
	}

	//getters and setters
	public int getLoginId() 
	{
		return loginId;
	}

	public void setLoginId(int loginId) 
	{
		this.loginId = loginId;
	}

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) {
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

	public List<UserType> getUsertype() {
		return usertype;
	}

	public void setUsertype(List<UserType> usertype) {
		this.usertype = usertype;
	}

	//toString method
	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", usertype=" + usertype + ", username=" + username + ", password="
				+ password + "]";
	}

	
}
