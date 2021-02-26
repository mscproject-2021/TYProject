package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.Result;

public interface ResultRepository extends PagingAndSortingRepository<Result, Integer>
{

}
