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
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
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

	//default Constructor
	public Inquiry() 
	{
		super();
	}

	//Parameterized Constructor
	public Inquiry(int inquiryId, @NotNull @Size(max = 10) String contactNo,
			@NotNull @Size(max = 100) String inquiryMessage, @Size(max = 100) String inquiryResponse)
	{
		super();
		this.inquiryId = inquiryId;
		this.contactNo = contactNo;
		this.inquiryMessage = inquiryMessage;
		this.inquiryResponse = inquiryResponse;
	}

	//getters and setters
	public int getInquiryId() 
	{
		return inquiryId;
	}

	public void setInquiryId(int inquiryId)
	{
		this.inquiryId = inquiryId;
	}

	public String getContactNo()
	{
		return contactNo;
	}

	public void setContactNo(String contactNo)
	{
		this.contactNo = contactNo;
	}

	public String getInquiryMessage() 
	{
		return inquiryMessage;
	}

	public void setInquiryMessage(String inquiryMessage)
	{
		this.inquiryMessage = inquiryMessage;
	}

	public String getInquiryResponse() 
	{
		return inquiryResponse;
	}

	public void setInquiryResponse(String inquiryResponse) 
	{
		this.inquiryResponse = inquiryResponse;
	}

	@Override
	public String toString()
	{
		return "Inquiry [inquiryId=" + inquiryId + ", contactNo=" + contactNo + ", inquiryMessage=" + inquiryMessage
				+ ", inquiryResponse=" + inquiryResponse + "]";
	}
	
	
}
