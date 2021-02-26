package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.ExamType;

public interface ExamTypeRepository extends PagingAndSortingRepository<ExamType, Integer>{

}
