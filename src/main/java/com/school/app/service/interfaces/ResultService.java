package com.school.app.service.interfaces;

import java.util.List;
import org.springframework.http.ResponseEntity;
//import com.school.app.model.ExamType;
import com.school.app.model.Result;
import com.school.app.model.ResultFile;

public interface ResultService
{		
	public ResponseEntity<Object> saveResult(Result result);
		
	//some filter method
	//public List<Result> getAllResults();
			
	public ResponseEntity<Object> getResultById(int id);
				
	public ResponseEntity<Object> updateResult(Result result,int id);		
		
	public ResponseEntity<Object> delteResultById(int id);
	
	//public void deleteAllResults();	
	
	public ResponseEntity<Object> saveResultFile(ResultFile resultfile);
	
	public ResponseEntity<Object> updateResultFile(ResultFile resultfile,int id);
	
	public ResponseEntity<List<ResultFile>> getAllResultFile();
	
	public ResponseEntity<Object> deleteById(int id);
	
	//update doubt
	
}
