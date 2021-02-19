package com.school.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class StudyMaterialType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false,length = 1)
	private int studymaterialTypeId;
	
	@NotNull
	@Column(length = 15,nullable = false)
	@Size(max = 15)
	private String studymaterialType;
	
	
	@OneToMany(mappedBy = "studymaterialType",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<StudyMaterial> studyMaterial;
	
	
}
