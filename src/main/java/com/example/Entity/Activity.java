package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@Entity
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="activity_id",updatable = false,length = 5)
	private int activity_id;
	// many activites are participated by one student.
	@ManyToOne
	@JoinColumn(name = "grNo")
	private Student student;
	@NonNull
	private String activity_name;
	@Nullable
	private String achievement_name;
	@Nullable
	private String achievement_description;
	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Activity(int activity_id, Student student, String activity_name, String achievement_name,
			String achievement_description) {
		super();
		this.activity_id = activity_id;
		this.student = student;
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
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
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
		return "Activity [activity_id=" + activity_id + ", student=" + student + ", activity_name=" + activity_name
				+ ", achievement_name=" + achievement_name + ", achievement_description=" + achievement_description
				+ "]";
	}
}
