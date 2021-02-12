package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.lang.NonNull;

@Entity
public class Attendance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="attendance_id",updatable = false,length=5)
	private int attendance_id;
	// one Student has many attendance
	@OneToMany
	@JoinColumn(name="grNo")
	private Student student;
	@NonNull
	private int total_days;
	@NonNull
	private int present_days;
	@NonNull
	private int absent_days;
	@NonNull
	private String Month;
	
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Attendance(int attendance_id, Student student, int total_days, int present_days, int absent_days,
			String month) {
		super();
		this.attendance_id = attendance_id;
		this.student = student;
		this.total_days = total_days;
		this.present_days = present_days;
		this.absent_days = absent_days;
		Month = month;
	}

	public int getAttendance_id() {
		return attendance_id;
	}

	public void setAttendance_id(int attendance_id) {
		this.attendance_id = attendance_id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getTotal_days() {
		return total_days;
	}

	public void setTotal_days(int total_days) {
		this.total_days = total_days;
	}

	public int getPresent_days() {
		return present_days;
	}

	public void setPresent_days(int present_days) {
		this.present_days = present_days;
	}

	public int getAbsent_days() {
		return absent_days;
	}

	public void setAbsent_days(int absent_days) {
		this.absent_days = absent_days;
	}

	public String getMonth() {
		return Month;
	}

	public void setMonth(String month) {
		Month = month;
	}

	@Override
	public String toString() {
		return "Attendance [attendance_id=" + attendance_id + ", student=" + student + ", total_days=" + total_days
				+ ", present_days=" + present_days + ", absent_days=" + absent_days + ", Month=" + Month + "]";
	}
}