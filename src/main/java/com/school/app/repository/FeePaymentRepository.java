package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.school.app.model.FeePayment;

@Repository
public interface FeePaymentRepository extends PagingAndSortingRepository<FeePayment, Integer>{

}
