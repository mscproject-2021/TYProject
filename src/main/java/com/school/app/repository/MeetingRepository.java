package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.Meeting;

public interface MeetingRepository extends PagingAndSortingRepository<Meeting, Integer>{

}
