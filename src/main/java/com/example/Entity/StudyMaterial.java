package com.example.Entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@Entity
public class StudyMaterial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="studymaterial_id",updatable = false,length=5)
	private int studymaterial_id;
	// many standard has many study material
	@ManyToMany
	@JoinColumn(name="standardId")
	private Standard standard;
	@OneToOne
	@JoinColumn(name="studymaterial_type_id")
	private StudyMaterialType studyMaterialType;
	@Nullable
	private String description;
	@NonNull
	@Lob
	@Column(name = "file", columnDefinition="BLOB")
	private byte[] studymaterial_file;
	public StudyMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudyMaterial(int studymaterial_id, Standard standard, StudyMaterialType studyMaterialType,
			String description, byte[] studymaterial_file) {
		super();
		this.studymaterial_id = studymaterial_id;
		this.standard = standard;
		this.studyMaterialType = studyMaterialType;
		this.description = description;
		this.studymaterial_file = studymaterial_file;
	}
	public int getStudymaterial_id() {
		return studymaterial_id;
	}
	public void setStudymaterial_id(int studymaterial_id) {
		this.studymaterial_id = studymaterial_id;
	}
	public Standard getStandard() {
		return standard;
	}
	public void setStandard(Standard standard) {
		this.standard = standard;
	}
	public StudyMaterialType getStudyMaterialType() {
		return studyMaterialType;
	}
	public void setStudyMaterialType(StudyMaterialType studyMaterialType) {
		this.studyMaterialType = studyMaterialType;
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
		return "StudyMaterial [studymaterial_id=" + studymaterial_id + ", standard=" + standard + ", studyMaterialType="
				+ studyMaterialType + ", description=" + description + ", studymaterial_file="
				+ Arrays.toString(studymaterial_file) + "]";
	}
}
