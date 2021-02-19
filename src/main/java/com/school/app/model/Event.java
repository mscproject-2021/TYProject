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
public class Event {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(updatable = false,length = 4)
		private int eventId;
		
		@NotNull
		@Column(length = 30,nullable = false)
		@Size(max = 30)
		private String eventName;
		
		@NotNull
		@Column(nullable = false)
		@Temporal(TemporalType.DATE)
		private Date eventStartdate;
		
		@NotNull
		@Column(nullable = false)
		@Temporal(TemporalType.DATE)
		private Date eventEnddate;
		
		@NotNull
		@Column(nullable = false)
		@Temporal(TemporalType.TIME)
		private Date eventStarttime;
		
		@NotNull
		@Column(nullable = false)
		@Temporal(TemporalType.TIME)
		private Date eventEndtime;
		
		@Column(length = 100)
		@Size(max = 100)
		private String eventDescription;
		
}
