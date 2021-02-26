package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.Attendance;

public interface AttendanceRepository extends PagingAndSortingRepository<Attendance, Integer>
{

}
