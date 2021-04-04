package com.school.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.school.app.model.FeePayment;
import com.school.app.model.FeeStructure;
import com.school.app.service.interfaces.FeePaymentService;

@RestController
@RequestMapping("/sms")
@CrossOrigin(origins = "http://localhost:4200")

public class FeePaymentController
{
	@Autowired
	private FeePaymentService feepaymentservice;
	
	@GetMapping("/feedetails")
	public ResponseEntity<List<FeePayment>> getFeeDetailList()
	{
		return feepaymentservice.getAllFeePayments();
	}
	
	@GetMapping("/feedetail/{id}")
	public ResponseEntity<Object> getFeePayment(@PathVariable int id)
	{
		return feepaymentservice.getFeePaymentById(id);
	}
	
	@PostMapping("/add-fee")
	public ResponseEntity<Object> addFeePayment(@RequestBody FeePayment feepayment)
	{
		return feepaymentservice.saveFeePayment(feepayment);
	}
	
	@PostMapping("/pay-fee")
	public ResponseEntity<Object> payFeePayment(@RequestBody FeePayment feepayment)
	{
		return feepaymentservice.saveFeePayment(feepayment);
	}
		
	@PutMapping("/feedetail/{id}")
	public ResponseEntity<Object> updateFeePayment(@RequestBody FeePayment feepayment,@PathVariable int id)
	{
		return feepaymentservice.updateFeePayment(feepayment, id);
	}
	
	@DeleteMapping("/feedetail/{id}")
	public ResponseEntity<Object> deleteFeePayment(@PathVariable int id)
	{
		return feepaymentservice.deleteFeePaymentById(id);
	}
	
	@GetMapping("/fee-structures")
	public ResponseEntity<List<FeeStructure>> getFeeStructureList()
	{
		return feepaymentservice.getAllFeeStructures();
	}
	
	@GetMapping("/fee-structure/{id}")
	public ResponseEntity<Object> getFeeStructure(@PathVariable int id)
	{
		return feepaymentservice.getFeeStructureById(id);
	}
	
	@PostMapping("/fee-structure")
	public ResponseEntity<Object> addFeeStructure(@RequestBody FeeStructure feeStructure)
	{
		return feepaymentservice.saveFeeStructure(feeStructure);
	}
		
	@PutMapping("/fee-structure/{id}")
	public ResponseEntity<Object> updateFeeStructure(@RequestBody FeeStructure feeStructure,@PathVariable int id)
	{
		return feepaymentservice.updateFeeStructure(feeStructure, id);
	}
	
	@DeleteMapping("/fee-structure/{id}")
	public ResponseEntity<Object> deleteFeeStructure(@PathVariable int id)
	{
		return feepaymentservice.deleteFeeStructureById(id);
	}

}
