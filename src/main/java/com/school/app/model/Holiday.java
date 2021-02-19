package com.school.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Holiday {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(updatable = false,length = 3)
		private int holidayId;
		
		@NotNull
		@Column(length = 20,nullable = false)
		@Size(max = 20)
		private String holiday_name;
		
		@NotNull
		@Column(nullable = false)
		@Temporal(TemporalType.DATE)
		private Date holiday_startdate;
		
		@NotNull
		@Column(nullable = false)
		@Temporal(TemporalType.DATE)
		private Date holiday_enddate;
		
		@Column(length = 100)
		@Size(max = 100)
		private String holiday_description;
		
}
