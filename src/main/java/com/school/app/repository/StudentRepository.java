package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.school.app.model.Student;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Integer>
{

}