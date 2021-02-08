package com.example.Entity;


import java.util.Arrays;
import java.util.Timer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SchoolDetail {

	@Id
	private int schoolDetail_id;
	private String email_id;
	private int contactno_1;
	private int contactno_2;
	private byte[] logo;
	private Timer office_timing;
	public SchoolDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SchoolDetail(int schoolDetail_id, String email_id, int contactno_1, int contactno_2, byte[] logo,
			Timer office_timing) {
		super();
		this.schoolDetail_id = schoolDetail_id;
		this.email_id = email_id;
		this.contactno_1 = contactno_1;
		this.contactno_2 = contactno_2;
		this.logo = logo;
		this.office_timing = office_timing;
	}
	public int getSchoolDetail_id() {
		return schoolDetail_id;
	}
	public void setSchoolDetail_id(int schoolDetail_id) {
		this.schoolDetail_id = schoolDetail_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public int getContactno_1() {
		return contactno_1;
	}
	public void setContactno_1(int contactno_1) {
		this.contactno_1 = contactno_1;
	}
	public int getContactno_2() {
		return contactno_2;
	}
	public void setContactno_2(int contactno_2) {
		this.contactno_2 = contactno_2;
	}
	public byte[] getLogo() {
		return logo;
	}
	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
	public Timer getOffice_timing() {
		return office_timing;
	}
	public void setOffice_timing(Timer office_timing) {
		this.office_timing = office_timing;
	}
	@Override
	public String toString() {
		return "SchoolDetail [schoolDetail_id=" + schoolDetail_id + ", email_id=" + email_id + ", contactno_1="
				+ contactno_1 + ", contactno_2=" + contactno_2 + ", logo=" + Arrays.toString(logo) + ", office_timing="
				+ office_timing + "]";
	}
	
	
}
