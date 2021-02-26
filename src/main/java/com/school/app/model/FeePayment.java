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
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
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

	//default Constructor
	public FeePayment() 
	{
		super();
	}

	//Parameterized Constructor
	public FeePayment(long paymentId, Student student, @NotNull @Size(max = 5) String paymentMode,
			@NotNull @Size(max = 4) int feesAmount, @Size(max = 3) int latefeesAmount,
			@NotNull @Size(max = 4) int totalfeesAmount, @NotNull @Size(max = 6) String feeStatus,
			@NotNull Date paymentDate, @NotNull @Size(max = 1) int installmentNo)
	{
		super();
		this.paymentId = paymentId;
		this.student = student;
		this.paymentMode = paymentMode;
		this.feesAmount = feesAmount;
		this.latefeesAmount = latefeesAmount;
		this.totalfeesAmount = totalfeesAmount;
		this.feeStatus = feeStatus;
		this.paymentDate = paymentDate;
		InstallmentNo = installmentNo;
	}

	//getters and setters
	public long getPaymentId() 
	{
		return paymentId;
	}

	public void setPaymentId(long paymentId) 
	{
		this.paymentId = paymentId;
	}

	public Student getStudent()
	{
		return student;
	}

	public void setStudent(Student student) 
	{
		this.student = student;
	}

	public String getPaymentMode()
	{
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode)
	{
		this.paymentMode = paymentMode;
	}

	public int getFeesAmount() 
	{
		return feesAmount;
	}

	public void setFeesAmount(int feesAmount) 
	{
		this.feesAmount = feesAmount;
	}

	public int getLatefeesAmount()
	{
		return latefeesAmount;
	}

	public void setLatefeesAmount(int latefeesAmount) 
	{
		this.latefeesAmount = latefeesAmount;
	}

	public int getTotalfeesAmount()
	{
		return totalfeesAmount;
	}

	public void setTotalfeesAmount(int totalfeesAmount) 
	{
		this.totalfeesAmount = totalfeesAmount;
	}

	public String getFeeStatus() 
	{
		return feeStatus;
	}

	public void setFeeStatus(String feeStatus)
	{
		this.feeStatus = feeStatus;
	}

	public Date getPaymentDate()
	{
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) 
	{
		this.paymentDate = paymentDate;
	}

	public int getInstallmentNo() 
	{
		return InstallmentNo;
	}

	public void setInstallmentNo(int installmentNo) 
	{
		InstallmentNo = installmentNo;
	}

	@Override
	public String toString() 
	{
		return "FeePayment [paymentId=" + paymentId + ", student=" + student + ", paymentMode=" + paymentMode
				+ ", feesAmount=" + feesAmount + ", latefeesAmount=" + latefeesAmount + ", totalfeesAmount="
				+ totalfeesAmount + ", feeStatus=" + feeStatus + ", paymentDate=" + paymentDate + ", InstallmentNo="
				+ InstallmentNo + "]";
	}
	
}
