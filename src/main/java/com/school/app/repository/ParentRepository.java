package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.Parent;

public interface ParentRepository extends PagingAndSortingRepository<Parent, Integer>
{

}
