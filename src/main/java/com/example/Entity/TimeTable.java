package com.example.Entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.lang.NonNull;

@Entity
public class TimeTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="timetable_id",updatable = false,length = 3)
	private int timetable_id;
	//one standard has many timetable
	@ManyToOne
	@JoinColumn(name="standardId")
	private Standard standard;
	//one teacher has one timetable
	@OneToOne
	@JoinColumn(name="teacherId")
	private Teacher teacher;
	//many users are belong to one timetable
	@ManyToOne
	@JoinColumn(name="usertypeId")
	private UserType userType;
	@NonNull
	@Lob
	@Column(name = "file", columnDefinition="BLOB")
	private byte[] timetable_file;
	public TimeTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TimeTable(int timetable_id, Standard standard, Teacher teacher, UserType userType, byte[] timetable_file) {
		super();
		this.timetable_id = timetable_id;
		this.standard = standard;
		this.teacher = teacher;
		this.userType = userType;
		this.timetable_file = timetable_file;
	}
	public int getTimetable_id() {
		return timetable_id;
	}
	public void setTimetable_id(int timetable_id) {
		this.timetable_id = timetable_id;
	}
	public Standard getStandard() {
		return standard;
	}
	public void setStandard(Standard standard) {
		this.standard = standard;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public byte[] getTimetable_file() {
		return timetable_file;
	}
	public void setTimetable_file(byte[] timetable_file) {
		this.timetable_file = timetable_file;
	}
	@Override
	public String toString() {
		return "TimeTable [timetable_id=" + timetable_id + ", standard=" + standard + ", teacher=" + teacher
				+ ", userType=" + userType + ", timetable_file=" + Arrays.toString(timetable_file) + "]";
	}
}
