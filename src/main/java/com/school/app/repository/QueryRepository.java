package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.Query;

public interface QueryRepository extends PagingAndSortingRepository<Query, Integer>{

}
