package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.school.app.model.Login;

@Repository
public interface LoginRepository extends PagingAndSortingRepository<Login, Integer>
{

}