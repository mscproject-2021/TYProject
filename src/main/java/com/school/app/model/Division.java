package com.school.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;


@Component
@Entity
public class Division 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 2,updatable = false)
	private int divisionId;
	
	@ManyToMany(mappedBy = "division")
	private List<Standard> standard;
	
	@OneToMany(mappedBy = "division",cascade = CascadeType.ALL)
	private List<Result> result;
	
	@OneToMany(mappedBy = "division")
	private List<ResultFile> resultFile;
	
	@NotNull
	@Size(max = 10)
	@Column(length = 10,nullable = false)
	private String divisionName;
	

	//default Constructor
	public Division() 
	{
		super();
	}
	
	//Parameterized Constructor
	public Division(int divisionId, List<Standard> standard, List<Result> result,
			@NotNull @Size(max = 10) String divisionName, List<ResultFile> resultFile) {
		super();
		this.divisionId = divisionId;
		this.standard = standard;
		this.result = result;
		this.divisionName = divisionName;
		this.resultFile = resultFile;
	}

	//getters and setters
	public int getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(int divisionId) {
		this.divisionId = divisionId;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}
	
	public List<Standard> getStandard() {
		return standard;
	}

	public void setStandard(List<Standard> standard) {
		this.standard = standard;
	}

	/*public List<Result> getResult() {
		return result;
	}

	public void setResult(List<Result> result) {
		this.result = result;
	}

	/*public List<ResultFile> getResultFile() {
		return resultFile;
	}

	public void setResultFile(List<ResultFile> resultFile) {
		this.resultFile = resultFile;
	}*/

	@Override
	public String toString() {
		return "Division [divisionId=" + divisionId + ", standard=" + standard + ", result=" + result
				+ ", divisionName=" + divisionName + ", resultFile=" + resultFile + "]";
	}
}
