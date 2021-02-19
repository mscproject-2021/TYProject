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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false,length = 1)
	private int schoolDetailId;
	
	@NotNull
	@Column(length = 40,nullable = false)
	@Size(max = 40)
	private String emailId;
	
	@NotNull
	@Column(length = 10,nullable = false)
	@Size(max = 10)
	private String contactNo1;
	
	@NotNull
	@Column(length = 10,nullable = false)
	@Size(max = 10)
	private String contactNo2;
	
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
	
}
