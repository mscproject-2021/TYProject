package com.example.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@Entity
public class FeePayment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="payment_id",updatable = false,length = 10)
	private int payment_id;
	// one student has many fee payment
	@ManyToOne
	@JoinColumn(name="grNo")
	private Student student;
	@NonNull
	private String payment_mode;
	@NonNull
	private int fees_amount;
	@Nullable
	private int latefees_amount;
	@NonNull
	private int totalfees_amount;
	@NonNull
	private String fee_status;
	@NonNull
	@Temporal(TemporalType.DATE)
	private Date payment_date;
	@NonNull
	private int Installment_no;
	public FeePayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FeePayment(int payment_id, Student student, String payment_mode, int fees_amount, int latefees_amount,
			int totalfees_amount, String fee_status, Date payment_date, int installment_no) {
		super();
		this.payment_id = payment_id;
		this.student = student;
		this.payment_mode = payment_mode;
		this.fees_amount = fees_amount;
		this.latefees_amount = latefees_amount;
		this.totalfees_amount = totalfees_amount;
		this.fee_status = fee_status;
		this.payment_date = payment_date;
		Installment_no = installment_no;
	}
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getPayment_mode() {
		return payment_mode;
	}
	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}
	public int getFees_amount() {
		return fees_amount;
	}
	public void setFees_amount(int fees_amount) {
		this.fees_amount = fees_amount;
	}
	public int getLatefees_amount() {
		return latefees_amount;
	}
	public void setLatefees_amount(int latefees_amount) {
		this.latefees_amount = latefees_amount;
	}
	public int getTotalfees_amount() {
		return totalfees_amount;
	}
	public void setTotalfees_amount(int totalfees_amount) {
		this.totalfees_amount = totalfees_amount;
	}
	public String getFee_status() {
		return fee_status;
	}
	public void setFee_status(String fee_status) {
		this.fee_status = fee_status;
	}
	public Date getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}
	public int getInstallment_no() {
		return Installment_no;
	}
	public void setInstallment_no(int installment_no) {
		Installment_no = installment_no;
	}
	@Override
	public String toString() {
		return "FeePayment [payment_id=" + payment_id + ", student=" + student + ", payment_mode=" + payment_mode
				+ ", fees_amount=" + fees_amount + ", latefees_amount=" + latefees_amount + ", totalfees_amount="
				+ totalfees_amount + ", fee_status=" + fee_status + ", payment_date=" + payment_date
				+ ", Installment_no=" + Installment_no + "]";
	}
}
