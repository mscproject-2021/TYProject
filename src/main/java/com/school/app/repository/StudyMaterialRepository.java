package com.school.app.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.school.app.model.StudyMaterial;

public interface StudyMaterialRepository extends PagingAndSortingRepository<StudyMaterial, Integer>{

}
