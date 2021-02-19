package com.school.app.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class StudyMaterial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false,length=5)
	private int studymaterialId;
	
	// one standard belongs to many study material
	@ManyToOne
	private Standard standard;
	
	// many study materials are belong to one type
	@ManyToOne()
	private StudyMaterialType studyMaterialType;
	
	@Column(length = 50)
	@Size(max = 50)
	private String description;
	
	@NotNull
	@Column(name = "file", length = 255)
	@Size(max = 255)
	private String studymaterialFile;

}
