package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.SchoolDetail;
import com.school.app.repository.SchoolDetailRepository;
import com.school.app.service.serviceClass.SchoolDetailService;

@Service
public class SchoolDetailServiceImpl implements SchoolDetailService
{

	@Autowired
	SchoolDetailRepository schoolDetailrepository;
	
	@Override
	public SchoolDetail saveSchoolDetail(SchoolDetail schoolDetail) 
	{
		// TODO Auto-generated method stub
		return schoolDetailrepository.save(schoolDetail);
	}

	@Override
	public List<SchoolDetail> getAllSchoolDetails()
	{
		return (List<SchoolDetail>)schoolDetailrepository.findAll();
	}

	@Override
	public SchoolDetail updateSchoolDetail(int id, SchoolDetail schoolDetail) 
	{
		return schoolDetailrepository.save(schoolDetail);
	}

	@Override
	public void deleteAllSchoolDetails() 
	{
		// TODO Auto-generated method stub
		schoolDetailrepository.deleteAll();
	}
	
}
