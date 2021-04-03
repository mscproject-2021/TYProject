package com.school.app.service.classes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.school.app.exception.ResourceNotFoundException;
import com.school.app.model.Admin;
import com.school.app.model.SchoolDetail;
import com.school.app.repository.AdminRepository;
import com.school.app.repository.SchoolDetailRepository;
import com.school.app.service.interfaces.AdminService;

@Service
public class AdminServiceImpl implements AdminService
{
	@Autowired 
	private AdminRepository adminrepository;
	
	@Autowired
	private SchoolDetailRepository schooldetailrepository;
	

	@Override
	public ResponseEntity<Object> getAdminById(int id) 
	{
		Admin admin =  adminrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		return ResponseEntity.status(HttpStatus.OK).body(admin);
	}

	@Override
	public ResponseEntity<Object> updateAdmin(Admin admin, int id) {
		Admin adminById =  adminrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		try 
		{
			adminById.setAddress1(admin.getAddress1());
			adminById.setAddress2(admin.getAddress2());
			adminById.setGender(admin.getImage());
			adminById.setJoiningDate(admin.getJoiningDate());
			adminById.setPincode(admin.getPincode());
			adminById.setGender(admin.getGender());
			
			adminrepository.save(adminById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(adminById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}	
	}

	@Override
	public ResponseEntity<List<SchoolDetail>> getAllSchoolDetails()
	{
		List<SchoolDetail> schooldetail_list = (List<SchoolDetail>)schooldetailrepository.findAll();
		if(schooldetail_list.size() < 1)
		{
			throw new ResourceNotFoundException("Sorry! Not Found.");
		}
		return ResponseEntity.status(HttpStatus.OK).body(schooldetail_list);
	}
	
	@Override
	public ResponseEntity<Object> updateSchoolDetail(SchoolDetail schooldetail, int id) 
	{
		SchoolDetail schooldetailById =  schooldetailrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Sorry! Not found for :" + id));
		try 
		{
			schooldetailById.setEmailId(schooldetail.getEmailId());
			schooldetailById.setLandlineNo(schooldetail.getLandlineNo());
			schooldetailById.setLogo(schooldetail.getLogo());
			schooldetailById.setMobileNo(schooldetail.getMobileNo());
			schooldetailById.setOfficeCloseTime(schooldetail.getOfficeCloseTime());
			schooldetailById.setOfficeOpenTime(schooldetail.getOfficeOpenTime());
			schooldetailrepository.save(schooldetailById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(schooldetailById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry! Try Again.");
		}	
	}
}

	
