package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.SchoolDetail;

public interface SchoolDetailService 
{
	public  SchoolDetail saveSchoolDetail(SchoolDetail schoolDetail);
	
	public List<SchoolDetail> getAllSchoolDetails();
	
	//public  SchoolDetail getSchoolDetailById(int id);
	
 	public  SchoolDetail updateSchoolDetail(int id, SchoolDetail schoolDetail);
 	
 	//public void deleteSchoolDetailById(int id);
 	
 	public void deleteAllSchoolDetails();
}
