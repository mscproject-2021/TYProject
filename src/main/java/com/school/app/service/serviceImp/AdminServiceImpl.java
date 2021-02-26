package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.Admin;
import com.school.app.repository.AdminRepository;
import com.school.app.service.serviceClass.AdminService;


@Service
public class AdminServiceImpl implements AdminService 
{

	@Autowired
	AdminRepository adminrepository;
	
	@Override
	public Admin saveAdmin(Admin admin) 
	{
		return adminrepository.save(admin);
	}

	@Override
	public List<Admin> getAllAdmins() 
	{
		return (List<Admin>)adminrepository.findAll();
	}

	@Override
	public Admin getAdminById(int id) 
	{
		return adminrepository.findById(id).get();
	}

	@Override
	public Admin updateAdmin(int id,Admin admin) 
	{
		return adminrepository.save(admin);
	}

	@Override
	public void deleteAdminById(int id) 
	{
		adminrepository.deleteById(id);
	}

	@Override
	public void deleteAllAdmins() 
	{
		adminrepository.deleteAll();
	}

}
