package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.school.app.model.Activity;

@Repository
public interface ActivityRepository extends PagingAndSortingRepository<Activity, Integer>
{

}
