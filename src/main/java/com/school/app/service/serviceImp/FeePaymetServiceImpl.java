package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.FeePayment;
import com.school.app.repository.FeePaymentRepository;
import com.school.app.service.serviceClass.FeePaymentService;

@Service
public class FeePaymetServiceImpl implements FeePaymentService
{

	@Autowired
	FeePaymentRepository feepaymentrepository;
	
	@Override
	public FeePayment saveFeePayment(FeePayment feePayment) 
	{
		return feepaymentrepository.save(feePayment);
	}

	@Override
	public List<FeePayment> getAllFeePayments() 
	{
		return (List<FeePayment>)feepaymentrepository.findAll();
	}

	@Override
	public FeePayment getFeePaymentById(int id)
	{
		return feepaymentrepository.findById(id).get();
	}

	@Override
	public FeePayment updateFeePayment(int id, FeePayment feePayment) 
	{
		return feepaymentrepository.save(feePayment);
	}

	@Override
	public void deleteFeePaymentById(int id) 
	{
		feepaymentrepository.deleteById(id);
	}

	@Override
	public void deleteAllFeePayments() 
	{
		feepaymentrepository.deleteAll();
	}

}
