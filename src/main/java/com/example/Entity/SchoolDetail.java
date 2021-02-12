package com.example.Entity;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.NonNull;

@Entity
public class SchoolDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="schoolDetail_id",updatable = false,length = 1)
	private int schoolDetail_id;
	@NonNull
	private String email_id;
	@NonNull
	private String contactno_1;
	@NonNull
	private String contactno_2;
	@Lob
    @Column(name = "logo", columnDefinition="BLOB")
	private byte[] logo;
	@NonNull
	@Temporal(TemporalType.TIME)
	private Date office_timing;
	public SchoolDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SchoolDetail(int schoolDetail_id, String email_id, String contactno_1, String contactno_2, byte[] logo,
			Date office_timing) {
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
	public String getContactno_1() {
		return contactno_1;
	}
	public void setContactno_1(String contactno_1) {
		this.contactno_1 = contactno_1;
	}
	public String getContactno_2() {
		return contactno_2;
	}
	public void setContactno_2(String contactno_2) {
		this.contactno_2 = contactno_2;
	}
	public byte[] getLogo() {
		return logo;
	}
	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
	public Date getOffice_timing() {
		return office_timing;
	}
	public void setOffice_timing(Date office_timing) {
		this.office_timing = office_timing;
	}
	@Override
	public String toString() {
		return "SchoolDetail [schoolDetail_id=" + schoolDetail_id + ", email_id=" + email_id + ", contactno_1="
				+ contactno_1 + ", contactno_2=" + contactno_2 + ", logo=" + Arrays.toString(logo) + ", office_timing="
				+ office_timing + "]";
	}
	
	
}
