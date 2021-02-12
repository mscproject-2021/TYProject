package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@Entity
public class ExamType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="examtype_id",updatable = false,length = 1)
	private int examtype_id;
	@NonNull
	private String examtype_name;
	@Nullable
	private String examtype_description;
	public ExamType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExamType(int examtype_id, String examtype_name, String examtype_description) {
		super();
		this.examtype_id = examtype_id;
		this.examtype_name = examtype_name;
		this.examtype_description = examtype_description;
	}
	public int getExamtype_id() {
		return examtype_id;
	}
	public void setExamtype_id(int examtype_id) {
		this.examtype_id = examtype_id;
	}
	public String getExamtype_name() {
		return examtype_name;
	}
	public void setExamtype_name(String examtype_name) {
		this.examtype_name = examtype_name;
	}
	public String getExamtype_description() {
		return examtype_description;
	}
	public void setExamtype_description(String examtype_description) {
		this.examtype_description = examtype_description;
	}
	@Override
	public String toString() {
		return "ExamType [examtype_id=" + examtype_id + ", examtype_name=" + examtype_name + ", examtype_description="
				+ examtype_description + "]";
	}
	
	
}
