package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.TimeTable;

public interface TimeTableRepository extends PagingAndSortingRepository<TimeTable, Integer>{

}
