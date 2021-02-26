package com.school.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	
	//add remaining Constraint 
	@ManyToMany(mappedBy = "division" ,fetch = FetchType.LAZY)
	private List<Standard> standard;
	
	@OneToMany(mappedBy = "division" ,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Result> result;
	
	@NotNull
	@Size(max = 10)
	@Column(length = 10,nullable = false)
	private String divisionName;
	
	@NotNull
	@Size(max = 255)
	@Column(length = 255,nullable = false)
	private String resultFile;

	//default Constructor
	public Division() 
	{
		super();
	}
	
	//Parameterized Constructor
	public Division(int divisionId, List<Standard> standard, List<Result> result,
			@NotNull @Size(max = 10) String divisionName, @NotNull @Size(max = 255) String resultFile) 
	{
		super();
		this.divisionId = divisionId;
		this.standard = standard;
		this.result = result;
		this.divisionName = divisionName;
		this.resultFile = resultFile;
	}

	//getters and setters
	public int getDivisionId() 
	{
		return divisionId;
	}

	public void setDivisionId(int divisionId) 
	{
		this.divisionId = divisionId;
	}

	public List<Standard> getStandard()
	{
		return standard;
	}

	public void setStandard(List<Standard> standard)
	{
		this.standard = standard;
	}

	public List<Result> getResult() 
	{
		return result;
	}

	public void setResult(List<Result> result) 
	{
		this.result = result;
	}

	public String getDivisionName() 
	{
		return divisionName;
	}

	public void setDivisionName(String divisionName) 
	{
		this.divisionName = divisionName;
	}

	public String getResultFile()
	{
		return resultFile;
	}

	public void setResultFile(String resultFile)
	{
		this.resultFile = resultFile;
	}
	
	
	@Override
	public String toString() 
	{
		return "Division [divisionId=" + divisionId + ", standard=" + standard + ", result=" + result
				+ ", divisionName=" + divisionName + ", resultFile=" + resultFile + "]";
	}

}
