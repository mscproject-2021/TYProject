package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.UserType;

public interface UserTypeRepository extends PagingAndSortingRepository<UserType, Integer>
{

}
