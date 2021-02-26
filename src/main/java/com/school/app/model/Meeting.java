package com.school.app.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Meeting {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(updatable = false,length = 4)
	private int meetingId;
	
	//meeting should be either of teacher or student
	@ManyToOne(fetch = FetchType.LAZY)
	private List<UserType> usertype;
	
	@NotNull
	@Column(length = 20,nullable = false)
	@Size(max = 20)
	private String meetingName;
	
	@NotNull
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date meetingDate;
	
	@NotNull()
	@Column(nullable = false)
	@Temporal(TemporalType.TIME)
	private Date meetingStarttime;
	
	@NotNull
	@Column(nullable = false)
	@Temporal(TemporalType.TIME)
	private Date meetingEndtime;
	
	@Column(length = 100)
	@Size(max = 100)
	private String meetingDescription;

	//default Constructor
	public Meeting() 
	{
		super();
	}

	//Parameterized Constructor
	public Meeting(int meetingId, List<UserType> usertype, @NotNull @Size(max = 20) String meetingName,
			@NotNull Date meetingDate, @NotNull Date meetingStarttime, @NotNull Date meetingEndtime,
			@Size(max = 100) String meetingDescription) 
	{
		super();
		this.meetingId = meetingId;
		this.usertype = usertype;
		this.meetingName = meetingName;
		this.meetingDate = meetingDate;
		this.meetingStarttime = meetingStarttime;
		this.meetingEndtime = meetingEndtime;
		this.meetingDescription = meetingDescription;
	}

	//getters and setters
	public int getMeetingId() 
	{
		return meetingId;
	}

	public void setMeetingId(int meetingId) 
	{
		this.meetingId = meetingId;
	}

	public List<UserType> getUsertype()
	{
		return usertype;
	}

	public void setUsertype(List<UserType> usertype)
	{
		this.usertype = usertype;
	}

	public String getMeetingName()
	{
		return meetingName;
	}

	public void setMeetingName(String meetingName)
	{
		this.meetingName = meetingName;
	}

	public Date getMeetingDate() 
	{
		return meetingDate;
	}

	public void setMeetingDate(Date meetingDate) 
	{
		this.meetingDate = meetingDate;
	}

	public Date getMeetingStarttime() 
	{
		return meetingStarttime;
	}

	public void setMeetingStarttime(Date meetingStarttime)
	{
		this.meetingStarttime = meetingStarttime;
	}

	public Date getMeetingEndtime() 
	{
		return meetingEndtime;
	}

	public void setMeetingEndtime(Date meetingEndtime) 
	{
		this.meetingEndtime = meetingEndtime;
	}

	public String getMeetingDescription()
	{
		return meetingDescription;
	}

	public void setMeetingDescription(String meetingDescription)
	{
		this.meetingDescription = meetingDescription;
	}

	@Override
	public String toString() 
	{
		return "Meeting [meetingId=" + meetingId + ", usertype=" + usertype + ", meetingName=" + meetingName
				+ ", meetingDate=" + meetingDate + ", meetingStarttime=" + meetingStarttime + ", meetingEndtime="
				+ meetingEndtime + ", meetingDescription=" + meetingDescription + "]";
	}

}
