package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.Admin;

public interface AdminRepository extends PagingAndSortingRepository<Admin, Integer>
{

}