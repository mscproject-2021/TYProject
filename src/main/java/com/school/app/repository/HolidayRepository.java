package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.school.app.model.Holiday;

@Repository
public interface HolidayRepository extends PagingAndSortingRepository<Holiday, Integer>{

}
