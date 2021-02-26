package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.Activity;

public interface ActivityRepository extends PagingAndSortingRepository<Activity, Integer>
{

}
