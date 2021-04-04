package com.school.app.service.interfaces;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.school.app.model.FeePayment;
import com.school.app.model.FeeStructure;


public interface FeePaymentService
{
	public  ResponseEntity<Object> saveFeePayment(FeePayment feePayment);
	
	// some filters
	public ResponseEntity<List<FeePayment>> getAllFeePayments();
	
	public  ResponseEntity<Object> getFeePaymentById(int id);
	
 	public  ResponseEntity<Object> updateFeePayment(FeePayment feePayment,int id);
 	
 	public ResponseEntity<Object> deleteFeePaymentById(int id);
 	
 	//fee structure
 	
 	public ResponseEntity<Object> saveFeeStructure(FeeStructure feeStructure);
 	
 	public ResponseEntity<Object> updateFeeStructure(FeeStructure feeStructure, int id);
 	
 	public ResponseEntity<Object> getFeeStructureById(int id);
 	
 	public ResponseEntity<Object> deleteFeeStructureById(int id);
 	
 	public ResponseEntity<List<FeeStructure>> getAllFeeStructures();
}
