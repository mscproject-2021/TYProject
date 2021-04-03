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
public class ResultFile 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
	@GenericGenerator(name="native",strategy = "native")
	@Column(length = 5,updatable = false)
	private int resultId;
	
	@ManyToOne
	private Division division;
	
	@ManyToOne
	private Standard standard;
	
	@ManyToOne
	private ExamType examType;
	
	@NotNull 
	@Size(max = 100)
	@Column(length = 100, nullable = false)
	private String description;
	
	@NotNull
	@Size(max = 255)
	@Column(length = 255,nullable = false)
	private String resultFile;

	public ResultFile() 
	{
		super();
	}

	public ResultFile(int resultId, Division division, Standard standard, ExamType examType,
			@NotNull @Size(max = 100) String description, @NotNull @Size(max = 255) String resultFile) {
		super();
		this.resultId = resultId;
		this.division = division;
		this.standard = standard;
		this.examType = examType;
		this.description = description;
		this.resultFile = resultFile;
	}

	public int getResultId() {
		return resultId;
	}

	public void setResultId(int resultId) {
		this.resultId = resultId;
	}

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

	public Standard getStandard() {
		return standard;
	}

	public void setStandard(Standard standard) {
		this.standard = standard;
	}

	public ExamType getExamType() {
		return examType;
	}

	public void setExamType(ExamType examType) {
		this.examType = examType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResultFile() {
		return resultFile;
	}

	public void setResultFile(String resultFile) {
		this.resultFile = resultFile;
	}

	@Override
	public String toString() {
		return "ResultFile [resultId=" + resultId + ", division=" + division + ", standard=" + standard + ", examType="
				+ examType + ", description=" + description + ", resultFile=" + resultFile + "]";
	}
}
