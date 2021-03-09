package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.school.app.model.Teacher;

@Repository
public interface TeacherRepository extends PagingAndSortingRepository<Teacher, Integer>
{

}
