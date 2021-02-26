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
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
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

		//default Constructor
		public Holiday()
		{
			super();
		}

		//Parameterized Constructor
		public Holiday(int holidayId, @NotNull @Size(max = 20) String holiday_name, @NotNull Date holiday_startdate,
				@NotNull Date holiday_enddate, @Size(max = 100) String holiday_description)
		{
			super();
			this.holidayId = holidayId;
			this.holiday_name = holiday_name;
			this.holiday_startdate = holiday_startdate;
			this.holiday_enddate = holiday_enddate;
			this.holiday_description = holiday_description;
		}

		//getters and setters
		public int getHolidayId() 
		{
			return holidayId;
		}

		public void setHolidayId(int holidayId) 
		{
			this.holidayId = holidayId;
		}

		public String getHoliday_name()
		{
			return holiday_name;
		}

		public void setHoliday_name(String holiday_name)
		{
			this.holiday_name = holiday_name;
		}

		public Date getHoliday_startdate() 
		{
			return holiday_startdate;
		}

		public void setHoliday_startdate(Date holiday_startdate)
		{
			this.holiday_startdate = holiday_startdate;
		}

		public Date getHoliday_enddate() 
		{
			return holiday_enddate;
		}

		public void setHoliday_enddate(Date holiday_enddate)
		{
			this.holiday_enddate = holiday_enddate;
		}

		public String getHoliday_description()
		{
			return holiday_description;
		}

		public void setHoliday_description(String holiday_description)
		{
			this.holiday_description = holiday_description;
		}

		@Override
		public String toString()
		{
			return "Holiday [holidayId=" + holidayId + ", holiday_name=" + holiday_name + ", holiday_startdate="
					+ holiday_startdate + ", holiday_enddate=" + holiday_enddate + ", holiday_description="
					+ holiday_description + "]";
		}

}
