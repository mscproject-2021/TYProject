package com.school.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Inquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false,length = 4)
	private int inquiryId;
	
	@NotNull
	@Column(length = 10,nullable = false)
	@Size(max = 10)
	private String contactNo;
	
	@NotNull
	@Column(length = 100,nullable = false)
	@Size(max = 100)
	private String inquiryMessage;
	
	@Column(length = 100)
	@Size(max = 100)
	private String inquiryResponse;
	
}
