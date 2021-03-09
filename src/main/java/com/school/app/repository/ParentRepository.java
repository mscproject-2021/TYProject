package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.school.app.model.Parent;

@Repository
public interface ParentRepository extends PagingAndSortingRepository<Parent, Integer>
{

}
