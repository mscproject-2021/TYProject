package com.school.app.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.FeePayment;
import com.school.app.repository.FeePaymentRepository;
import com.school.app.service.interfaces.FeePaymentService;

@Service
public class FeePaymentServiceImpl implements FeePaymentService
{
	@Autowired
	FeePaymentRepository feepaymentrepository;
	
	@Override
	public ResponseEntity<Object> saveFeePayment(FeePayment feePayment) 
	{
		try
		{
			FeePayment add_feepayment = feepaymentrepository.save(feePayment);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_feepayment);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

	@Override
	public ResponseEntity<Object> getFeePaymentById(int id) 
	{
		FeePayment feePayment =  feepaymentrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("feepayment not found for id" + id));
		return ResponseEntity.status(HttpStatus.OK).body(feePayment);
		
	}

	@Override
	public ResponseEntity<Object> updateFeePayment(FeePayment feePayment,int id) 
	{
		FeePayment feePaymentById =  feepaymentrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("query not found for id" + id));
		try 
		{
			feePaymentById.setFeesAmount(feePayment.getFeesAmount());
			feePaymentById.setFeeStatus(feePayment.getFeeStatus());
			feePaymentById.setInstallmentNo(feePayment.getInstallmentNo());
			feePaymentById.setLatefeesAmount(feePayment.getLatefeesAmount());
			feePaymentById.setPaymentDate(feePayment.getPaymentDate());
			feePaymentById.setPaymentMode(feePayment.getPaymentMode());
			feePaymentById.setTotalfeesAmount(feePayment.getTotalfeesAmount());
			
			feepaymentrepository.save(feePaymentById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(feePaymentById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

	@Override
	public ResponseEntity<Object> deleteFeePaymentById(int id) 
	{
		feepaymentrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("feepayment not found for id" + id));
		feepaymentrepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("successfully deleted");
	}

	@Override
	public ResponseEntity<List<FeePayment>> getAllFeePayments() 
	{
		List<FeePayment> feePayment_list = (List<FeePayment>)feepaymentrepository.findAll();
		if(feePayment_list.size() < 1)
		{
			throw new ResourceNotFoundException("feepayment list not found");
		}
		return ResponseEntity.status(HttpStatus.OK).body(feePayment_list);
	}

}
