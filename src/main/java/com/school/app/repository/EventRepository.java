package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.Event;

public interface EventRepository extends PagingAndSortingRepository<Event, Integer>
{

}
