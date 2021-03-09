package com.school.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class ResultFile 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 5,updatable = false)
	private int resultId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Division division;
	
	@NotNull
	@Size(max = 255)
	@Column(length = 255,nullable = false)
	private String resultFile;

	public ResultFile() 
	{
		super();
	}

	public ResultFile(int resultId, Division division, @NotNull @Size(max = 255) String resultFile) {
		super();
		this.resultId = resultId;
		this.division = division;
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

	public String getResultFile() {
		return resultFile;
	}

	public void setResultFile(String resultFile) {
		this.resultFile = resultFile;
	}

	@Override
	public String toString() {
		return "ResultFile [resultId=" + resultId + ", division=" + division + ", resultFile=" + resultFile + "]";
	}
}
