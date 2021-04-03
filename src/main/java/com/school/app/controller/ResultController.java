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

import com.school.app.model.ExamType;
import com.school.app.model.Result;
import com.school.app.model.ResultFile;
import com.school.app.service.interfaces.ResultService;

@RestController
@RequestMapping("/sms")
@CrossOrigin(origins = "http://localhost:4200")

public class ResultController 
{
	@Autowired
	private ResultService resultservice;
	
	@GetMapping("/results")
	public ResponseEntity<List<Result>> getResultList()
	{
		return resultservice.getAllResults();
	}
	
	@GetMapping("/result/{id}")
	public ResponseEntity<Object> getResult(@PathVariable int  id)
	{
		return resultservice.getResultById(id);
	}
	
	@PutMapping("/result/{id}")
	public ResponseEntity<Object> updateResult(@RequestBody Result result,@PathVariable int id)
	{
		return resultservice.updateResult(result, id);
	}

	@PostMapping("/result")
	public ResponseEntity<Object> addResult(@RequestBody Result result)
	{
		return resultservice.saveResult(result);
	}
	
	@DeleteMapping("/result/{id}")
	public ResponseEntity<Object> deleteResult(@PathVariable int id)
	{
		return resultservice.delteResultById(id);
	}
	
	@GetMapping("/resultfiles")
	public ResponseEntity<List<ResultFile>> getResultFilesList()
	{
		return resultservice.getAllResultFile();
	}
	
	@GetMapping("/resultfile/{id}")
	public ResponseEntity<Object> getResultFile(@PathVariable int id)
	{
		return resultservice.getResultFileById(id);
	}
	
	@PutMapping("/resultfile/{id}")
	public ResponseEntity<Object> updateResultFile(@RequestBody ResultFile resultFile,@PathVariable int id)
	{
		return resultservice.updateResultFile(resultFile, id);
	}

	@PostMapping("/resultfile")
	public ResponseEntity<Object> addResultFile(@RequestBody ResultFile resultFile)
	{
		return resultservice.saveResultFile(resultFile);
	}
	
	@DeleteMapping("/resultfile/{id}")
	public ResponseEntity<Object> deleteResultFile(@PathVariable int id)
	{
		return resultservice.deleteResultFileById(id);
	}
	
	@GetMapping("/examtypes")
	public ResponseEntity<List<ExamType>> getExamTypeList()
	{
		return resultservice.getAllExamTypes();
	}
}
