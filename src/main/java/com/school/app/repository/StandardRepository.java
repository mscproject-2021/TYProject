package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.school.app.model.Standard;

@Repository
public interface StandardRepository extends PagingAndSortingRepository<Standard, Integer>
{

}