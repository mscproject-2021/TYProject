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
public class Query {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false,length = 4)
	private int queryId;
	
	//many Quries are belong to one parent
	@ManyToOne
	private Parent parent;
	
	@NotNull
	@Column(length = 100,nullable = false)
	@Size(max = 100)
	private String queryMessage;
	
	@Column(length = 100)
	@Size(max = 100)
	private String responseMessage;
	
}