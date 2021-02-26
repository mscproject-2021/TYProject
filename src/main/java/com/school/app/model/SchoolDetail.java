package com.school.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class SchoolDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(updatable = false,length = 1)
	private int schoolDetailId;
	
	@NotNull
	@Column(length = 40,nullable = false)
	@Size(max = 40)
	private String emailId;
	
	@NotNull
	@Column(length = 10,nullable = false)
	@Size(max = 10)
	private String landlineNo;
	
	@NotNull
	@Column(length = 10,nullable = false)
	@Size(max = 10)
	private String MobileNo;
	
	@NotNull
	@Column(length = 255,nullable = false)
	@Size(max = 255)
	private String logo;
	
	@NotNull
	@Column(nullable = false)
	@Temporal(TemporalType.TIME)
	private Date officeOpenTime;
	
	@NotNull
	@Column(nullable = false)
	@Temporal(TemporalType.TIME)
	private Date officeCloseTime;

	//default Constructor
	public SchoolDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized Constructor
	public SchoolDetail(int schoolDetailId, @NotNull @Size(max = 40) String emailId,
			@NotNull @Size(max = 10) String landlineNo, @NotNull @Size(max = 10) String mobileNo,
			@NotNull @Size(max = 255) String logo, @NotNull Date officeOpenTime, @NotNull Date officeCloseTime) {
		super();
		this.schoolDetailId = schoolDetailId;
		this.emailId = emailId;
		this.landlineNo = landlineNo;
		MobileNo = mobileNo;
		this.logo = logo;
		this.officeOpenTime = officeOpenTime;
		this.officeCloseTime = officeCloseTime;
	}

	//getters and setters
	public int getSchoolDetailId() {
		return schoolDetailId;
	}

	public void setSchoolDetailId(int schoolDetailId) {
		this.schoolDetailId = schoolDetailId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getLandlineNo() {
		return landlineNo;
	}

	public void setLandlineNo(String landlineNo) {
		this.landlineNo = landlineNo;
	}

	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Date getOfficeOpenTime() {
		return officeOpenTime;
	}

	public void setOfficeOpenTime(Date officeOpenTime) {
		this.officeOpenTime = officeOpenTime;
	}

	public Date getOfficeCloseTime() {
		return officeCloseTime;
	}

	public void setOfficeCloseTime(Date officeCloseTime) {
		this.officeCloseTime = officeCloseTime;
	}

	@Override
	public String toString() {
		return "SchoolDetail [schoolDetailId=" + schoolDetailId + ", emailId=" + emailId + ", landlineNo=" + landlineNo
				+ ", MobileNo=" + MobileNo + ", logo=" + logo + ", officeOpenTime=" + officeOpenTime
				+ ", officeCloseTime=" + officeCloseTime + "]";
	}
	
}
