package com.school.app.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class FeePayment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
	@GenericGenerator(name="native",strategy = "native")
	@Column(updatable = false,length = 7)
	private int paymentId;
	
	@ManyToOne
	private Student student;
	
	@NotNull
	@Column(length = 7,nullable = false)
	@Size(max = 7)
	private String paymentMode;
	
	@NotNull
	@Column(length = 4,nullable = false)
	private int feesAmount;
	
	@Column(length = 3)
	private Integer latefeesAmount;
	
	@NotNull
	@Column(length = 4,nullable = false)
	private int totalfeesAmount;
	
	@NotNull
	@Column(length = 6,nullable = false)
	@Size(max = 6)
	private String feeStatus;
	
	@NotNull
	@Column(nullable = false,columnDefinition = "DATE")
	@CreatedDate
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Calendar paymentDate;
	
	@NotNull
	@Column(length = 1,nullable = false)
	private Integer InstallmentNo;

	//default Constructor
	public FeePayment() 
	{
		super();
	}

	//Parameterized Constructor
	public FeePayment(int paymentId, Student student, @NotNull @Size(max = 7) String paymentMode,
			@NotNull int feesAmount, Integer latefeesAmount, @NotNull int totalfeesAmount,
			@NotNull @Size(max = 6) String feeStatus, @NotNull Calendar paymentDate, @NotNull Integer installmentNo) {
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
	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public int getFeesAmount() {
		return feesAmount;
	}

	public void setFeesAmount(int feesAmount) {
		this.feesAmount = feesAmount;
	}

	public Integer getLatefeesAmount() {
		return latefeesAmount;
	}

	public void setLatefeesAmount(Integer latefeesAmount) {
		this.latefeesAmount = latefeesAmount;
	}

	public int getTotalfeesAmount() {
		return totalfeesAmount;
	}

	public void setTotalfeesAmount(int totalfeesAmount) {
		this.totalfeesAmount = totalfeesAmount;
	}

	public String getFeeStatus() {
		return feeStatus;
	}

	public void setFeeStatus(String feeStatus) {
		this.feeStatus = feeStatus;
	}

	public Calendar getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Calendar paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Integer getInstallmentNo() {
		return InstallmentNo;
	}

	public void setInstallmentNo(Integer installmentNo) {
		InstallmentNo = installmentNo;
	}

	@Override
	public String toString() {
		return "FeePayment [paymentId=" + paymentId + ", student=" + student + ", paymentMode=" + paymentMode
				+ ", feesAmount=" + feesAmount + ", latefeesAmount=" + latefeesAmount + ", totalfeesAmount="
				+ totalfeesAmount + ", feeStatus=" + feeStatus + ", paymentDate=" + paymentDate + ", InstallmentNo="
				+ InstallmentNo + "]";
	}

	
	
}
