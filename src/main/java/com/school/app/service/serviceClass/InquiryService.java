package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.Inquiry;

public interface InquiryService 
{
	public  Inquiry saveInquiry(Inquiry inquiry);
	
	//public  Inquiry saveInquiryResponse(Inquiry inquiryresponse);
	
	public List<Inquiry> getAllInquiries();
	
	//public List<Inquiry> getAllInquiryResponses();
	
	public  Inquiry getInquiryById(int id);
	
 	//public  Inquiry updateInquiries(int id, Inquiry inquiry);
 	
 	public void deleteInquiryById(int id);
 	
 	public void deleteAllInquiries();
 	
 	//public void deleteAllResponses();
}
