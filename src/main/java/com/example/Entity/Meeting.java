package com.example.Entity;

import java.util.Date;
import java.util.Timer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Meeting {

	@Id
	private int meeting_id;
	private int usertype_id;
	private String meeting_name;
	private Date meeting_date;
	private Timer meeting_starttime;
	private Timer meeting_endtime;
	private String meeting_description;
	public Meeting() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Meeting(int meeting_id, int usertype_id, String meeting_name, Date meeting_date, Timer meeting_starttime,
			Timer meeting_endtime, String meeting_description) {
		super();
		this.meeting_id = meeting_id;
		this.usertype_id = usertype_id;
		this.meeting_name = meeting_name;
		this.meeting_date = meeting_date;
		this.meeting_starttime = meeting_starttime;
		this.meeting_endtime = meeting_endtime;
		this.meeting_description = meeting_description;
	}
	public int getMeeting_id() {
		return meeting_id;
	}
	public void setMeeting_id(int meeting_id) {
		this.meeting_id = meeting_id;
	}
	public int getUsertype_id() {
		return usertype_id;
	}
	public void setUsertype_id(int usertype_id) {
		this.usertype_id = usertype_id;
	}
	public String getMeeting_name() {
		return meeting_name;
	}
	public void setMeeting_name(String meeting_name) {
		this.meeting_name = meeting_name;
	}
	public Date getMeeting_date() {
		return meeting_date;
	}
	public void setMeeting_date(Date meeting_date) {
		this.meeting_date = meeting_date;
	}
	public Timer getMeeting_starttime() {
		return meeting_starttime;
	}
	public void setMeeting_starttime(Timer meeting_starttime) {
		this.meeting_starttime = meeting_starttime;
	}
	public Timer getMeeting_endtime() {
		return meeting_endtime;
	}
	public void setMeeting_endtime(Timer meeting_endtime) {
		this.meeting_endtime = meeting_endtime;
	}
	public String getMeeting_description() {
		return meeting_description;
	}
	public void setMeeting_description(String meeting_description) {
		this.meeting_description = meeting_description;
	}
	@Override
	public String toString() {
		return "Meeting [meeting_id=" + meeting_id + ", usertype_id=" + usertype_id + ", meeting_name=" + meeting_name
				+ ", meeting_date=" + meeting_date + ", meeting_starttime=" + meeting_starttime + ", meeting_endtime="
				+ meeting_endtime + ", meeting_description=" + meeting_description + "]";
	}
	
	
}
