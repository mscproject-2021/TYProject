package com.school.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class StudyMaterial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
	@GenericGenerator(name="native",strategy = "native")
	@Column(updatable = false,length=5)
	private int studymaterialId;
	
	@ManyToOne
	private Standard standard;
	
	@ManyToOne
	private StudyMaterialType studyMaterialType;
	
	@Column(length = 50)
	@Size(max = 50)
	private String description;
	
	@NotNull
	@Column(name = "file", length = 255)
	@Size(max = 255)
	private String studymaterialFile;

	//default Constructor
	public StudyMaterial()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized Constructor
	public StudyMaterial(int studymaterialId, Standard standard, StudyMaterialType studyMaterialType,
			@Size(max = 50) String description, @NotNull @Size(max = 255) String studymaterialFile)
	{
		super();
		this.studymaterialId = studymaterialId;
		this.standard = standard;
		this.studyMaterialType = studyMaterialType;
		this.description = description;
		this.studymaterialFile = studymaterialFile;
	}

	//getters and setters
	public int getStudymaterialId()
	{
		return studymaterialId;
	}

	public void setStudymaterialId(int studymaterialId)
	{
		this.studymaterialId = studymaterialId;
	}

	public Standard getStandard() 
	{
		return standard;
	}

	public void setStandard(Standard standard)
	{
		this.standard = standard;
	}

	public StudyMaterialType getStudyMaterialType() 
	{
		return studyMaterialType;
	}

	public void setStudyMaterialType(StudyMaterialType studyMaterialType)
	{
		this.studyMaterialType = studyMaterialType;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public String getStudymaterialFile() 
	{
		return studymaterialFile;
	}

	public void setStudymaterialFile(String studymaterialFile)
	{
		this.studymaterialFile = studymaterialFile;
	}

	@Override
	public String toString() 
	{
		return "StudyMaterial [studymaterialId=" + studymaterialId + ", standard=" + standard + ", studyMaterialType="
				+ studyMaterialType + ", description=" + description + ", studymaterialFile=" + studymaterialFile + "]";
	}
	
	

}
