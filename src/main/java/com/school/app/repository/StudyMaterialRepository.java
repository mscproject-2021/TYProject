package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.school.app.model.StudyMaterial;

@Repository
public interface StudyMaterialRepository extends PagingAndSortingRepository<StudyMaterial, Integer>{

}
