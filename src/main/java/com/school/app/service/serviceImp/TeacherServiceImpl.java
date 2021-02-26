package com.school.app.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.app.model.Teacher;
import com.school.app.repository.TeacherRepository;
import com.school.app.service.serviceClass.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService 
{

	@Autowired
	TeacherRepository teacherrepository;
	
	@Override
	public Teacher saveTeacher(Teacher teacher)
	{
		return teacherrepository.save(teacher);
	}

	@Override
	public List<Teacher> getAllTeachers() 
	{
		return (List<Teacher>)teacherrepository.findAll();
	}

	@Override
	public Teacher getTeacheById(int id) 
	{
		return teacherrepository.findById(id).get();
	}

	@Override
	public Teacher updateTeacher(int id,Teacher teacher) 
	{
		return teacherrepository.save(teacher);
	}

	@Override
	public void deleteTeacherById(int id)
	{
		 teacherrepository.deleteById(id);
	}

	@Override
	public void deleteAllTeachers() 
	{
		teacherrepository.deleteAll();
	}

}
