package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.school.app.model.image;

@Repository
public interface ImageRepository extends PagingAndSortingRepository<image, Integer> {

}
