package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.FeePayment;

public interface FeePaymentRepository extends PagingAndSortingRepository<FeePayment, Integer>{

}
