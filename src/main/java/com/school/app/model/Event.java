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
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
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

		//default Constructor
		public Event() 
		{
			super();
		}

		//Parameterized Constructor
		public Event(int eventId, @NotNull @Size(max = 30) String eventName, @NotNull Date eventStartdate,
				@NotNull Date eventEnddate, @NotNull Date eventStarttime, @NotNull Date eventEndtime,
				@Size(max = 100) String eventDescription) 
		{
			super();
			this.eventId = eventId;
			this.eventName = eventName;
			this.eventStartdate = eventStartdate;
			this.eventEnddate = eventEnddate;
			this.eventStarttime = eventStarttime;
			this.eventEndtime = eventEndtime;
			this.eventDescription = eventDescription;
		}

		//getters and setters
		public int getEventId() 
		{
			return eventId;
		}

		public void setEventId(int eventId) 
		{
			this.eventId = eventId;
		}

		public String getEventName()
		{
			return eventName;
		}

		public void setEventName(String eventName) 
		{
			this.eventName = eventName;
		}

		public Date getEventStartdate()
		{
			return eventStartdate;
		}

		public void setEventStartdate(Date eventStartdate)
		{
			this.eventStartdate = eventStartdate;
		}

		public Date getEventEnddate() 
		{
			return eventEnddate;
		}

		public void setEventEnddate(Date eventEnddate) 
		{
			this.eventEnddate = eventEnddate;
		}

		public Date getEventStarttime()
		{
			return eventStarttime;
		}

		public void setEventStarttime(Date eventStarttime) 
		{
			this.eventStarttime = eventStarttime;
		}

		public Date getEventEndtime() 
		{
			return eventEndtime;
		}

		public void setEventEndtime(Date eventEndtime) 
		{
			this.eventEndtime = eventEndtime;
		}

		public String getEventDescription() 
		{
			return eventDescription;
		}

		public void setEventDescription(String eventDescription)
		{
			this.eventDescription = eventDescription;
		}

		@Override
		public String toString() 
		{
			return "Event [eventId=" + eventId + ", eventName=" + eventName + ", eventStartdate=" + eventStartdate
					+ ", eventEnddate=" + eventEnddate + ", eventStarttime=" + eventStarttime + ", eventEndtime="
					+ eventEndtime + ", eventDescription=" + eventDescription + "]";
		}
		
}
