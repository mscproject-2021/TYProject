package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.Standard;

public interface StandardRepository extends PagingAndSortingRepository<Standard, Integer>
{

}