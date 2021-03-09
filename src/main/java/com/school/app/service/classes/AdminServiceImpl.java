package com.school.app.service.classes;

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
	public ResponseEntity<Object> saveAdmin(Admin admin) 
	{
		try
		{
			Admin add_admin = adminrepository.save(admin);
			return ResponseEntity.status(HttpStatus.CREATED).body(add_admin);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}
	}

	@Override
	public ResponseEntity<Object> getAdminById(int id) 
	{
		Admin admin =  adminrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("admin not found for id" + id));
		return ResponseEntity.status(HttpStatus.OK).body(admin);
	}

	@Override
	public ResponseEntity<Object> updateAdmin(Admin admin, int id) {
		Admin adminById =  adminrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("admin not found for id" + id));
		try 
		{
			adminById.setAddress1(admin.getAddress1());
			adminById.setAddress2(admin.getAddress2());
			adminById.setAdminName(admin.getAdminName());
			adminById.setContactNo(admin.getContactNo());
			adminById.setEmailId(admin.getEmailId());
			adminById.setGender(admin.getImage());
			adminById.setJoiningDate(admin.getJoiningDate());
			adminById.setPassword(admin.getPassword());
			adminById.setPincode(admin.getPincode());
			adminById.setUsername(admin.getUsername());
			adminById.setGender(admin.getGender());
			
			adminrepository.save(adminById);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(adminById);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}	
	}

	@Override
	public ResponseEntity<Object> getSchoolDetailById(int id)
	{
		SchoolDetail schooldetail =  schooldetailrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("schooldetail not found for id" + id));
		return ResponseEntity.status(HttpStatus.OK).body(schooldetail);
	}
	
	@Override
	public ResponseEntity<Object> updateSchoolDetail(SchoolDetail schooldetail, int id) 
	{
		SchoolDetail schooldetailById =  schooldetailrepository.findById(id).orElseThrow(()->new ResourceNotFoundException("schooldetail not found for id" + id));
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
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
		}	
	}
}

	
