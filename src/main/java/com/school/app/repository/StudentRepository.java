package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student, Integer>
{

}