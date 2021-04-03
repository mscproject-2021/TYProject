package com.school.app.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.ExamType;
import com.school.app.model.Result;
import com.school.app.model.ResultFile;
import com.school.app.repository.ExamTypeRepository;
import com.school.app.repository.ResultFileRepository;
import com.school.app.repository.ResultRepository;
import com.school.app.service.interfaces.ResultService;

@Service
public class ResultServiceImpl implements ResultService
{
	@Autowired
	private ResultRepository resultrepository;
	
	@Autowired
	private ResultFileRepository resultfilerepository;
	
	@Autowired
	private ExamTypeRepository examtyperepository;

	@Override
	public ResponseEntity<Object> saveResult(Result result)
	{
		try
		{
			Result add_result = resultrepository.save(result);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
	}
	
	@Override
	public ResponseEntity<List<Result>> getAllResults() {
		List<Result> result_list = (List<Result>)resultrepository.findAll();
		if(result_list.size() < 1)
		{
			throw new ResourceNotFoundException("Sorry! Not Found.");
		}
		return ResponseEntity.status(HttpStatus.OK).body(result_list);
	}

	@Override
	public ResponseEntity<Object> getResultById(int id)
	{
		Result result =  resultrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}

	@Override
	public ResponseEntity<Object> updateResult(Result result, int id)
	{
		Result resultById =  resultrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
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
			
			resultrepository.save(resultById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(resultById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
	}

	@Override
	public ResponseEntity<Object> delteResultById(int id)
	{
		resultrepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Sorry! Not found for :" + id));
		resultrepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("result successfully deleted");
	}

	
	@Override
	public ResponseEntity<Object> saveResultFile(ResultFile resultfile)
	{
		try
		{
			ResultFile add_resultfile = resultfilerepository.save(resultfile);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_resultfile);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
	}

	@Override
	public ResponseEntity<Object> updateResultFile(ResultFile resultfile, int id)
	{
		ResultFile resultFileById =  resultfilerepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		try
		{
			resultFileById.setResultFile(resultfile.getResultFile());
			resultFileById.setDescription(resultfile.getDescription());
			
			resultfilerepository.save(resultFileById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(resultFileById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}
	}

	@Override
	public ResponseEntity<List<ResultFile>> getAllResultFile() 
	{
		List<ResultFile> resultfile_list = (List<ResultFile>)resultfilerepository.findAll();
		if(resultfile_list.size() < 1)
		{
			throw new ResourceNotFoundException("Sorry! Not Found.");
		}
		return ResponseEntity.status(HttpStatus.OK).body(resultfile_list);
	}

	@Override
	public ResponseEntity<Object> deleteResultFileById(int id) {
		resultfilerepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Sorry! Not found for :" + id));
		resultfilerepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Resultfile successfully deleted");
	}
	
	@Override
	public ResponseEntity<Object> getResultFileById(int id) 
	{
		ResultFile resultfile =  resultfilerepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		return ResponseEntity.status(HttpStatus.OK).body(resultfile);
	}

	
	@Override
	public ResponseEntity<List<ExamType>> getAllExamTypes()
	{
		List<ExamType> examtype_list = (List<ExamType>)examtyperepository.findAll();
		if(examtype_list.size() < 1)
		{
			throw new ResourceNotFoundException("Sorry! Not Found.");
		}
		return ResponseEntity.status(HttpStatus.OK).body(examtype_list);
	}
}
