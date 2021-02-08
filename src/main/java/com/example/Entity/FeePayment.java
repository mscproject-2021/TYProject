package com.example.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FeePayment {

	@Id
	private int payment_id;
	private int GR_NO;
	private String payment_mode;
	private int fees_amount;
	private int latefees_amount;
	private int totalfees_amount;
	private String fee_status;
	private Date payment_date;
	private int Installment_no;
	public FeePayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FeePayment(int payment_id, int gR_NO, String payment_mode, int fees_amount, int latefees_amount,
			int totalfees_amount, String fee_status, Date payment_date, int installment_no) {
		super();
		this.payment_id = payment_id;
		GR_NO = gR_NO;
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
	public int getGR_NO() {
		return GR_NO;
	}
	public void setGR_NO(int gR_NO) {
		GR_NO = gR_NO;
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
		return "FeePayment [payment_id=" + payment_id + ", GR_NO=" + GR_NO + ", payment_mode=" + payment_mode
				+ ", fees_amount=" + fees_amount + ", latefees_amount=" + latefees_amount + ", totalfees_amount="
				+ totalfees_amount + ", fee_status=" + fee_status + ", Installment_no=" + Installment_no + "]";
	}
	
	
}
