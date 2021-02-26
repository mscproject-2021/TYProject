package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.Teacher;

public interface TeacherRepository extends PagingAndSortingRepository<Teacher, Integer>
{

}
