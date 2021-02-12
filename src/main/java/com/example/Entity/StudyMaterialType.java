package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class StudyMaterialType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="studymaterial_type_id",updatable = false,length = 1)
	private int studymaterial_type_id;
	@NonNull
	private String studymaterial_type;
	
	public StudyMaterialType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudyMaterialType(int studymaterial_type_id, String studymaterial_type) {
		super();
		this.studymaterial_type_id = studymaterial_type_id;
		this.studymaterial_type = studymaterial_type;
	}
	public int getStudymaterial_type_id() {
		return studymaterial_type_id;
	}
	public void setStudymaterial_type_id(int studymaterial_type_id) {
		this.studymaterial_type_id = studymaterial_type_id;
	}
	public String getStudymaterial_type() {
		return studymaterial_type;
	}
	public void setStudymaterial_type(String studymaterial_type) {
		this.studymaterial_type = studymaterial_type;
	}
	
	@Override
	public String toString() {
		return "StudyMaterialType [studymaterial_type_id=" + studymaterial_type_id + ", studymaterial_type="
				+ studymaterial_type + "]";
	}
	
}
