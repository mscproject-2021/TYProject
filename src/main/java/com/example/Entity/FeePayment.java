package com.school.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class FeePayment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false,length = 10)
	private long paymentId;
	
	// one student has done many fee payment
	@ManyToOne
	private Student student;
	
	@NotNull
	@Column(length = 5,nullable = false)
	@Size(max = 5)
	private String paymentMode;
	
	@NotNull
	@Column(length = 4,nullable = false)
	@Size(max = 4)
	private int feesAmount;
	

	@Column(length = 3)
	@Size(max = 3)
	private int latefeesAmount;
	
	@NotNull
	@Column(length = 4,nullable = false)
	@Size(max = 4)
	private int totalfeesAmount;
	
	@NotNull
	@Column(length = 6,nullable = false)
	@Size(max = 6)
	private String feeStatus;
	
	@NotNull
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date paymentDate;
	
	@NotNull
	@Column(length = 1,nullable = false)
	@Size(max = 1)
	private int InstallmentNo;
	
}
