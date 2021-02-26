package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.FeePayment;

public interface FeePaymentService 
{
	public  FeePayment saveFeePayment(FeePayment feePayment);
	
	public List<FeePayment> getAllFeePayments();
	
	public  FeePayment getFeePaymentById(int id);
	
 	public  FeePayment updateFeePayment(int id, FeePayment feePayment);
 	
 	public void deleteFeePaymentById(int id);
 	
 	public void deleteAllFeePayments();
}
