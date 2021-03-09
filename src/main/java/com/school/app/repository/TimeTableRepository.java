package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.school.app.model.TimeTable;

@Repository
public interface TimeTableRepository extends PagingAndSortingRepository<TimeTable, Integer>{

}
