package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.Inquiry;
import com.school.app.repository.InquiryRepository;
import com.school.app.service.serviceClass.InquiryService;

@Service
public class InquiryServiceImpl implements InquiryService
{

	@Autowired
	InquiryRepository inquiryrepository;
	
	@Override
	public Inquiry saveInquiry(Inquiry inquiry)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Inquiry> getAllInquiries()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inquiry getInquiryById(int id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInquiryById(int id) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInquiries() 
	{
		// TODO Auto-generated method stub
		
	}

}
