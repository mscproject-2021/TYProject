package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.school.app.model.Meeting;

@Repository
public interface MeetingRepository extends PagingAndSortingRepository<Meeting, Integer>{

}
