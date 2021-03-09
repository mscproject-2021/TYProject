package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.school.app.model.Admin;

@Repository
public interface AdminRepository extends PagingAndSortingRepository<Admin, Integer>
{

}