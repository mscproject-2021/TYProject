package com.school.app.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;




@Entity
public class Meeting {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false,length = 4)
	private int meetingId;
	
	//meeting should be either of teacher or student
	@OneToMany
	private List<UserType> usertype;
	
	@NotNull
	@Column(length = 20,nullable = false)
	@Size(max = 20)
	private String meetingName;
	
	@NotNull
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date meetingDate;
	
	@NotNull()
	@Column(nullable = false)
	@Temporal(TemporalType.TIME)
	private Date meetingStarttime;
	
	@NotNull
	@Column(nullable = false)
	@Temporal(TemporalType.TIME)
	private Date meetingEndtime;
	
	@Column(length = 100)
	@Size(max = 100)
	private String meetingDescription;
	
}
