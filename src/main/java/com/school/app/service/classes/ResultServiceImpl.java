package com.school.app.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.Result;
import com.school.app.model.ResultFile;
import com.school.app.repository.ResultFileRepository;
import com.school.app.repository.ResultRepository;
import com.school.app.service.interfaces.ResultService;

@Service
public class ResultServiceImpl implements ResultService
{
	@Autowired
	private ResultRepository resultRepository;
	
	@Autowired
	private ResultFileRepository resultFileRepository;

	@Override
	public ResponseEntity<Object> saveResult(Result result)
	{
		try
		{
			Result add_result = resultRepository.save(result);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

	@Override
	public ResponseEntity<Object> getResultById(int id)
	{
		Result result =  resultRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("result not found for id" + id));
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}

	@Override
	public ResponseEntity<Object> updateResult(Result result, int id)
	{
		Result resultById =  resultRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("result not found for id" + id));
		try
		{
			resultById.setDrawing(result.getDrawing());
			resultById.setEnglish(result.getEnglish());
			resultById.setEnvironment(result.getEnvironment());
			resultById.setGujarati(result.getGujarati());
			resultById.setHindi(result.getHindi());
			resultById.setMaths(result.getMaths());
			resultById.setPathmala(result.getPathmala());
			resultById.setPt(result.getPt());
			resultById.setSanskrit(result.getSanskrit());
			resultById.setScience(result.getScience());
			resultById.setSocialscience(result.getSocialscience());
			resultById.setTotalMarks(result.getTotalMarks());
			resultById.setYear(result.getYear());
			resultById.setObtainedMarks(result.getObtainedMarks());
			resultById.setPassingmMarks(result.getPassingmMarks());
			resultById.setGrade(result.getGrade());
			
			resultRepository.save(resultById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(resultById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

	@Override
	public ResponseEntity<Object> delteResultById(int id)
	{
		resultRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("result not found for id" + id));
		resultRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("result record successfully deleted");
	}

	
	@Override
	public ResponseEntity<Object> saveResultFile(ResultFile resultfile)
	{
		try
		{
			ResultFile add_resultfile = resultFileRepository.save(resultfile);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_resultfile);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

	@Override
	public ResponseEntity<Object> updateResultFile(ResultFile resultfile, int id)
	{
		ResultFile resultFileById =  resultFileRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User not found for id" + id));
		try
		{
			resultFileById.setResultFile(resultfile.getResultFile());
			
			resultFileRepository.save(resultFileById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(resultFileById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

	@Override
	public ResponseEntity<List<ResultFile>> getAllResultFile() 
	{
		List<ResultFile> resultfile_list = (List<ResultFile>)resultFileRepository.findAll();
		if(resultfile_list.size() < 1)
		{
			throw new ResourceNotFoundException("ResultFile list not found");
		}
		return ResponseEntity.status(HttpStatus.OK).body(resultfile_list);
	}

	@Override
	public ResponseEntity<Object> deleteById(int id)
	{
		resultFileRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("resultfile not found for id" + id));
		resultFileRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("resultfile record successfully deleted");
	}
}
