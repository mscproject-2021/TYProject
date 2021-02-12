package com.example.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@Entity
public class Meeting {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="meeting_id",updatable = false,length = 4)
	private int meeting_id;
	//meeting should be either of teacher or student
	@OneToMany
	@JoinColumn(name="usertypeId")
	private UserType usertype;
	private String meeting_name;
	@NonNull
	@Temporal(TemporalType.DATE)
	private Date meeting_date;
	@NonNull
	@Temporal(TemporalType.TIME)
	private Date meeting_starttime;
	@NonNull
	@Temporal(TemporalType.TIME)
	private Date meeting_endtime;
	@Nullable
	private String meeting_description;
	public Meeting() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Meeting(int meeting_id, UserType usertype, String meeting_name, Date meeting_date,
			Date meeting_starttime, Date meeting_endtime, String meeting_description) {
		super();
		this.meeting_id = meeting_id;
		this.usertype = usertype;
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
	public UserType getUsertype() {
		return usertype;
	}
	public void setUsertype(UserType usertype) {
		this.usertype = usertype;
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
	public Date getMeeting_starttime() {
		return meeting_starttime;
	}
	public void setMeeting_starttime(Date meeting_starttime) {
		this.meeting_starttime = meeting_starttime;
	}
	public Date getMeeting_endtime() {
		return meeting_endtime;
	}
	public void setMeeting_endtime(Date meeting_endtime) {
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
		return "Meeting [meeting_id=" + meeting_id + ", usertype=" + usertype + ", meeting_name=" + meeting_name
				+ ", meeting_date=" + meeting_date + ", meeting_starttime=" + meeting_starttime + ", meeting_endtime="
				+ meeting_endtime + ", meeting_description=" + meeting_description + "]";
	}
}
