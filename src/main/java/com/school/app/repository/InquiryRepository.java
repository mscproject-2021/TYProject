package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.Inquiry;

public interface InquiryRepository extends PagingAndSortingRepository<Inquiry, Integer>{

}
