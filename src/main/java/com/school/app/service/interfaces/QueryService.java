package com.school.app.service.interfaces;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.school.app.model.Inquiry;
import com.school.app.model.Query;

public interface QueryService 
{
		//inquiry
		public  ResponseEntity<Object> saveInquiry(Inquiry inquiry);
		
		public  ResponseEntity<Object> getInquiryById(int id);
		
		public ResponseEntity<List<Inquiry>> getAllInquiries();

	 	public  ResponseEntity<Object> updateInquiry(Inquiry inquiry,int id);
	 	
	 	public ResponseEntity<Object> deleteInquiryById(int id);
	 	
	 	//query
	 	public  ResponseEntity<Object> saveQuery(Query query);
		
		public  ResponseEntity<Object> getQueryById(int id);
		
		public ResponseEntity<List<Query>> getAllQuiries();

	 	public  ResponseEntity<Object> updateQuery(Query query,int id);
	 	
	 	public ResponseEntity<Object> deleteQueryById(int id);
}
