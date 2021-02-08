package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Attendance {

	@Id
	private int attendance_id;
	private int GR_NO;
	private int total_days;
	private int present_days;
	private int absent_days;
	private String Month;
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Attendance(int attendance_id, int gR_NO, int total_days, int present_days, int absent_days, String month) {
		super();
		this.attendance_id = attendance_id;
		GR_NO = gR_NO;
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
	public int getGR_NO() {
		return GR_NO;
	}
	public void setGR_NO(int gR_NO) {
		GR_NO = gR_NO;
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
		return "Attendance [attendance_id=" + attendance_id + ", GR_NO=" + GR_NO + ", total_days=" + total_days
				+ ", present_days=" + present_days + ", absent_days=" + absent_days + ", Month=" + Month + "]";
	}
	
	
}
