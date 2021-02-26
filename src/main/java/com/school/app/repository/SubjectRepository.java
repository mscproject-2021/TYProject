package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.Subject;

public interface SubjectRepository extends PagingAndSortingRepository<Subject, Integer>
{

}
