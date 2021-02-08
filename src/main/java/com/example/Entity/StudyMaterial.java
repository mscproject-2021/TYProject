package com.example.Entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudyMaterial {

	@Id
	private int studymaterial_id;
	private int standard_id;
	private int studymaterial_type_id;
	private String description;
	private byte[] studymaterial_file;
	public StudyMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudyMaterial(int studymaterial_id, int standard_id, int studymaterial_type_id, String description,
			byte[] studymaterial_file) {
		super();
		this.studymaterial_id = studymaterial_id;
		this.standard_id = standard_id;
		this.studymaterial_type_id = studymaterial_type_id;
		this.description = description;
		this.studymaterial_file = studymaterial_file;
	}
	public int getStudymaterial_id() {
		return studymaterial_id;
	}
	public void setStudymaterial_id(int studymaterial_id) {
		this.studymaterial_id = studymaterial_id;
	}
	public int getStandard_id() {
		return standard_id;
	}
	public void setStandard_id(int standard_id) {
		this.standard_id = standard_id;
	}
	public int getStudymaterial_type_id() {
		return studymaterial_type_id;
	}
	public void setStudymaterial_type_id(int studymaterial_type_id) {
		this.studymaterial_type_id = studymaterial_type_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte[] getStudymaterial_file() {
		return studymaterial_file;
	}
	public void setStudymaterial_file(byte[] studymaterial_file) {
		this.studymaterial_file = studymaterial_file;
	}
	@Override
	public String toString() {
		return "StudyMaterial [studymaterial_id=" + studymaterial_id + ", standard_id=" + standard_id
				+ ", studymaterial_type_id=" + studymaterial_type_id + ", description=" + description
				+ ", studymaterial_file=" + Arrays.toString(studymaterial_file) + "]";
	}
	
	
}
