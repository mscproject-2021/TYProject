package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.Login;
import com.school.app.repository.LoginRepository;
import com.school.app.service.serviceClass.LoginService;

@Service
public class LoginServiceImpl implements LoginService
{
	@Autowired
	LoginRepository loginrepository;
	
	@Override
	public Login saveLogin(Login login)
	{
		return loginrepository.save(login);
	}
	
	@Override
	public List<Login> getAllLogins()
	{
		return (List<Login>)loginrepository.findAll();
	}
	
	@Override
	public Login getLoginById(int id)
	{
		return loginrepository.findById(id).get();
	}
	
	@Override
	public Login updateLogin(int id,Login login)
	{
		return loginrepository.save(login);
	}
	
	@Override
	public void deleteLoginById(int id)
	{
		loginrepository.deleteById(id);
	}
	
	@Override
	public void deleteAllLogins()
	{
		loginrepository.deleteAll();
	}
}