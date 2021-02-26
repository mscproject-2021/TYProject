package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.Holiday;

public interface HolidayRepository extends PagingAndSortingRepository<Holiday, Integer>{

}
