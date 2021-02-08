package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Activity {

	@Id
	private int activity_id;
	private int GR_NO;
	private String activity_name;
	private String achievement_name;
	private String achievement_description;
	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Activity(int activity_id, int gR_NO, String activity_name, String achievement_name,
			String achievement_description) {
		super();
		this.activity_id = activity_id;
		GR_NO = gR_NO;
		this.activity_name = activity_name;
		this.achievement_name = achievement_name;
		this.achievement_description = achievement_description;
	}
	public int getActivity_id() {
		return activity_id;
	}
	public void setActivity_id(int activity_id) {
		this.activity_id = activity_id;
	}
	public int getGR_NO() {
		return GR_NO;
	}
	public void setGR_NO(int gR_NO) {
		GR_NO = gR_NO;
	}
	public String getActivity_name() {
		return activity_name;
	}
	public void setActivity_name(String activity_name) {
		this.activity_name = activity_name;
	}
	public String getAchievement_name() {
		return achievement_name;
	}
	public void setAchievement_name(String achievement_name) {
		this.achievement_name = achievement_name;
	}
	public String getAchievement_description() {
		return achievement_description;
	}
	public void setAchievement_description(String achievement_description) {
		this.achievement_description = achievement_description;
	}
	@Override
	public String toString() {
		return "Activity [activity_id=" + activity_id + ", GR_NO=" + GR_NO + ", activity_name=" + activity_name
				+ ", achievement_name=" + achievement_name + ", achievement_description=" + achievement_description
				+ "]";
	}
	
	
}
