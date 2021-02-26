package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.Login;

public interface LoginRepository extends PagingAndSortingRepository<Login, Integer>
{

}