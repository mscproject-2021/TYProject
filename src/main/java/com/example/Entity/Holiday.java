package com.example.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@Entity
public class Holiday {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="holiday_id",updatable = false,length = 3)
		private int holiday_id;
		@NonNull
		private String holiday_name;
		@NonNull
		@Temporal(TemporalType.DATE)
		private Date holiday_startdate;
		@NonNull
		@Temporal(TemporalType.DATE)
		private Date holiday_enddate;
		@Nullable
		private String holiday_description;
		public Holiday() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Holiday(int holiday_id, String holiday_name, Date holiday_startdate, Date holiday_enddate,
				String holiday_description) {
			super();
			this.holiday_id = holiday_id;
			this.holiday_name = holiday_name;
			this.holiday_startdate = holiday_startdate;
			this.holiday_enddate = holiday_enddate;
			this.holiday_description = holiday_description;
		}
		public int getHoliday_id() {
			return holiday_id;
		}
		public void setHoliday_id(int holiday_id) {
			this.holiday_id = holiday_id;
		}
		public String getHoliday_name() {
			return holiday_name;
		}
		public void setHoliday_name(String holiday_name) {
			this.holiday_name = holiday_name;
		}
		public Date getHoliday_startdate() {
			return holiday_startdate;
		}
		public void setHoliday_startdate(Date holiday_startdate) {
			this.holiday_startdate = holiday_startdate;
		}
		public Date getHoliday_enddate() {
			return holiday_enddate;
		}
		public void setHoliday_enddate(Date holiday_enddate) {
			this.holiday_enddate = holiday_enddate;
		}
		public String getHoliday_description() {
			return holiday_description;
		}
		public void setHoliday_description(String holiday_description) {
			this.holiday_description = holiday_description;
		}
		@Override
		public String toString() {
			return "Holiday [holiday_id=" + holiday_id + ", holiday_name=" + holiday_name + ", holiday_startdate="
					+ holiday_startdate + ", holiday_enddate=" + holiday_enddate + ", holiday_description="
					+ holiday_description + "]";
		}
		
		
}
