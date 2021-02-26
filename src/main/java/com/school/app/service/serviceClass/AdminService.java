package com.school.app.service.serviceClass;

import java.util.List;

import com.school.app.model.Admin;

public interface AdminService 
{
	//create
	public Admin saveAdmin(Admin admin);
	
	//getall
	public List<Admin> getAllAdmins();
	
	//get by id
	public Admin getAdminById(int id);
	
	//update
	public Admin updateAdmin(int id,Admin admin);
	
	//delete
	public void deleteAdminById(int id);
	
	//deleteall
	public void deleteAllAdmins();
}
