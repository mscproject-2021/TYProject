package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.school.app.model.Result;

@Repository
public interface ResultRepository extends PagingAndSortingRepository<Result, Integer>
{

}
