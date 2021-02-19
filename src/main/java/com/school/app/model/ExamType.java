package com.school.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class ExamType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false,length = 1)
	private int examtypeId;
	
	@NotNull
	@Column(length = 15,nullable = false)
	@Size(max = 15)
	private String examtypeName;
	
	@Column(length = 100)
	@Size(max = 100)
	private String examtypeDescription;
	
}
