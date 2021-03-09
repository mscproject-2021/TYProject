package com.school.app.service.interfaces;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.school.app.model.FeePayment;


public interface FeePaymentService
{
	public  ResponseEntity<Object> saveFeePayment(FeePayment feePayment);
	
	public ResponseEntity<List<FeePayment>> getAllFeePayments();
	
	public  ResponseEntity<Object> getFeePaymentById(int id);
	
 	public  ResponseEntity<Object> updateFeePayment(FeePayment feePayment,int id);
 	
 	public ResponseEntity<Object> deleteFeePaymentById(int id);
}
