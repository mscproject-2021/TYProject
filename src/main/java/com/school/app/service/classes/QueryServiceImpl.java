package com.school.app.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.Inquiry;
import com.school.app.model.Query;
import com.school.app.repository.InquiryRepository;
import com.school.app.repository.QueryRepository;
import com.school.app.service.interfaces.QueryService;

@Service
public class QueryServiceImpl implements QueryService
{
	@Autowired
	private QueryRepository queryrepository;
	
	@Autowired
	InquiryRepository inquiryrepository;
	
	@Override
	public ResponseEntity<Object> saveQuery(Query query) 
	{
		try
		{
			Query add_query = queryrepository.save(query);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
	}
	
	@Override
	public ResponseEntity<Object> getQueryById(int id) 
	{
		Query query =  queryrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		return ResponseEntity.status(HttpStatus.OK).body(query);
	}

	@Override
	public ResponseEntity<List<Query>> getAllQuiries() 
	{
		List<Query> query_list = (List<Query>)queryrepository.findAll();
		if(query_list.size() < 1)
		{
			throw new ResourceNotFoundException("Sorry! Not Found.");
		}
		return ResponseEntity.status(HttpStatus.OK).body(query_list);
	}

	@Override
	public ResponseEntity<Object> updateQuery(Query query, int id)
	{
		Query queryById =  queryrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		try 
		{
				queryById.setResponseMessage(query.getResponseMessage());
				queryrepository.save(queryById);
				return ResponseEntity.status(HttpStatus.ACCEPTED).body(queryById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
	}

	@Override
	public ResponseEntity<Object> deleteQueryById(int id)
	{
		queryrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		queryrepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Query successfully deleted");
	}

	
	@Override
	public ResponseEntity<Object> saveInquiry(Inquiry inquiry) 
	{
		try
		{
			Inquiry add_inquiry = inquiryrepository.save(inquiry);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_inquiry);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
	}

	@Override
	public ResponseEntity<Object> getInquiryById(int id) 
	{
		Inquiry inquiry =  inquiryrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		return ResponseEntity.status(HttpStatus.OK).body(inquiry);
	}

	@Override
	public ResponseEntity<List<Inquiry>> getAllInquiries() 
	{
		List<Inquiry> inquiry_list = (List<Inquiry>)inquiryrepository.findAll();
		if(inquiry_list.size() < 1)
		{
			throw new ResourceNotFoundException("Sorry! Not Found.");
		}
		return ResponseEntity.status(HttpStatus.OK).body(inquiry_list);
	}

	@Override
	public ResponseEntity<Object> updateInquiry(Inquiry inquiry,int id) 
	{
		Inquiry inquiryById =  inquiryrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		try 
		{
				inquiryById.setInquiryResponse(inquiry.getInquiryResponse());
				inquiryrepository.save(inquiryById);
				return ResponseEntity.status(HttpStatus.ACCEPTED).body(inquiryById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
	}

	@Override
	public ResponseEntity<Object> deleteInquiryById(int id) 
	{
		inquiryrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		inquiryrepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Inquiry successfully deleted");
	}

}
