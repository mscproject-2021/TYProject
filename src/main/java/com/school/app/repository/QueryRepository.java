package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.school.app.model.Query;

@Repository
public interface QueryRepository extends PagingAndSortingRepository<Query, Integer>{

}
