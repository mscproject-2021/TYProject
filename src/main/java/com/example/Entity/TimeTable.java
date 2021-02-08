package com.example.Entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TimeTable {

	@Id
	private int timetable_id;
	private int standard_id;
	private int teacher_id;
	private int usertype_id;
	private byte[] timetable_file;
	public TimeTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TimeTable(int timetable_id, int standard_id, int teacher_id, int usertype_id, byte[] timetable_file) {
		super();
		this.timetable_id = timetable_id;
		this.standard_id = standard_id;
		this.teacher_id = teacher_id;
		this.usertype_id = usertype_id;
		this.timetable_file = timetable_file;
	}
	public int getTimetable_id() {
		return timetable_id;
	}
	public void setTimetable_id(int timetable_id) {
		this.timetable_id = timetable_id;
	}
	public int getStandard_id() {
		return standard_id;
	}
	public void setStandard_id(int standard_id) {
		this.standard_id = standard_id;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public int getUsertype_id() {
		return usertype_id;
	}
	public void setUsertype_id(int usertype_id) {
		this.usertype_id = usertype_id;
	}
	public byte[] getTimetable_file() {
		return timetable_file;
	}
	public void setTimetable_file(byte[] timetable_file) {
		this.timetable_file = timetable_file;
	}
	@Override
	public String toString() {
		return "TimeTable [timetable_id=" + timetable_id + ", standard_id=" + standard_id + ", teacher_id=" + teacher_id
				+ ", usertype_id=" + usertype_id + ", timetable_file=" + Arrays.toString(timetable_file) + "]";
	}
	
	
}
