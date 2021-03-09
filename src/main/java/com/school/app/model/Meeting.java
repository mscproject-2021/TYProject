package com.school.app.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.CreatedDate;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Meeting {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false,length = 4)
	private int meetingId;
	
	@ManyToOne
	private UserType usertype;
	
	@NotNull
	@Column(length = 20,nullable = false)
	@Size(max = 20)
	private String meetingName;
	
	@NotNull
	@Column(nullable = false,columnDefinition = "DATE")
	@CreatedDate
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Calendar meetingDate;
	
	@NotNull()
	@Column(nullable = false,columnDefinition = "TIME")
	@JsonFormat(pattern = "HH-mm-ss")
	private Calendar meetingStartTime;
	
	@NotNull
	@Column(nullable = false,columnDefinition = "TIME")
	@JsonFormat(pattern = "HH-mm-ss")
	private Calendar meetingEndTime;
	
	@Column(length = 100)
	@Size(max = 100)
	private String meetingDescription;

	//default Constructor
	public Meeting() 
	{
		super();
	}

	//Parameterized Constructor
	public Meeting(int meetingId, UserType usertype, @NotNull @Size(max = 20) String meetingName,
			@NotNull Calendar meetingDate, @NotNull Calendar meetingStartTime, @NotNull Calendar meetingEndTime,
			@Size(max = 100) String meetingDescription) {
		super();
		this.meetingId = meetingId;
		this.usertype = usertype;
		this.meetingName = meetingName;
		this.meetingDate = meetingDate;
		this.meetingStartTime = meetingStartTime;
		this.meetingEndTime = meetingEndTime;
		this.meetingDescription = meetingDescription;
	}

	//getters and setters
	public int getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}

	public UserType getUsertype() {
		return usertype;
	}

	public void setUsertype(UserType usertype) {
		this.usertype = usertype;
	}

	public String getMeetingName() {
		return meetingName;
	}

	public void setMeetingName(String meetingName) {
		this.meetingName = meetingName;
	}

	public Calendar getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(Calendar meetingDate) {
		this.meetingDate = meetingDate;
	}

	public Calendar getMeetingStartTime() {
		return meetingStartTime;
	}

	public void setMeetingStartTime(Calendar meetingStartTime) {
		this.meetingStartTime = meetingStartTime;
	}

	public Calendar getMeetingEndTime() {
		return meetingEndTime;
	}

	public void setMeetingEndTime(Calendar meetingEndTime) {
		this.meetingEndTime = meetingEndTime;
	}

	public String getMeetingDescription() {
		return meetingDescription;
	}

	public void setMeetingDescription(String meetingDescription) {
		this.meetingDescription = meetingDescription;
	}

	@Override
	public String toString() {
		return "Meeting [meetingId=" + meetingId + ", usertype=" + usertype + ", meetingName=" + meetingName
				+ ", meetingDate=" + meetingDate + ", meetingStartTime=" + meetingStartTime + ", meetingEndTime="
				+ meetingEndTime + ", meetingDescription=" + meetingDescription + "]";
	}	
}
