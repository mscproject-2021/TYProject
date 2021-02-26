package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.Division;

public interface DivisionRepository extends PagingAndSortingRepository<Division, Integer>
{

}