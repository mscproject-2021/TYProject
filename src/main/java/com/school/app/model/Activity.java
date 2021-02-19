package com.school.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false,length = 5)
	private int activityId;
	
	// many activites are participated by one student.
	@OneToMany
	private List<Student> student;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,nullable = false)
	private String activityName;
	
	@NotNull
	@Size(max=20)
	@Column(length = 20,nullable = false)
	private String achievementName;
	
	@Size(max=100)
	@Column(length = 100)
	private String achievementDescription;
}