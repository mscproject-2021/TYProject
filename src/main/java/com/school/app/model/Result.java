package com.school.app.model;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Result 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 5,updatable = false)
	private int resultId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Student student;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Division division;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Standard standard;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private ExamType examtype;
	
	@NotNull
	@Column(nullable = false,columnDefinition = "DATE")
	@JsonFormat(pattern = "yyyy")
	private Calendar year;

	@Range(min = 1,max = 3)
	@Column(length = 3)
	private int gujarati;
	
	@Range(min = 1,max = 3)
	@Column(length = 3)
	private int english;
	
	@Range(min = 1,max = 3)
	@Column(length = 3)
	private int environment;
	
	@Range(min = 1,max = 3)
	@Column(length = 3)
	private int science;
	
	@Range(min = 1,max = 3)
	@Column(length = 3)
	private int socialscience;
	
	@Range(min = 1,max = 3)
	@Column(length = 3)
	private int maths;
	
	@Range(min = 1,max = 3)
	@Column(length = 3)
	private int hindi;
	
	@Range(min = 1,max = 3)
	@Column(length = 3)
	private int sanskrit;
	
	@Range(min = 1,max = 3)
	@Column(length = 3)
	private int pt;
	
	@Range(min = 1,max = 3)
	@Column(length = 3)
	private int drawing;
	
	@Range(min = 1,max = 3)
	@Column(length = 3)
	private int pathmala;
	
	@NotNull
	@Range(min = 1,max = 3)
	@Column(length = 3,nullable = false)
	private int obtainedMarks;
	
	@NotNull
	@Range(max = 2)
	@Column(length = 2,nullable = false)
	private int passingmMarks;
	
	@NotNull
	@Range(max = 3)
	@Column(length = 3,nullable = false)
	private int totalMarks;
	
	@NotNull
	@Size(max = 2)
	@Column(length = 2,nullable = false)
	private String grade;

	//default Constructor
	public Result() 
	{
		super();
	}

	//Parameterized Constructor
	public Result(int resultId, Student student, Division division, Standard standard, ExamType examtype,
			@NotNull Calendar year, @Range(min = 1, max = 3) int gujarati, @Range(min = 1, max = 3) int english,
			@Range(min = 1, max = 3) int environment, @Range(min = 1, max = 3) int science,
			@Range(min = 1, max = 3) int socialscience, @Range(min = 1, max = 3) int maths,
			@Range(min = 1, max = 3) int hindi, @Range(min = 1, max = 3) int sanskrit, @Range(min = 1, max = 3) int pt,
			@Range(min = 1, max = 3) int drawing, @Range(min = 1, max = 3) int pathmala,
			@NotNull @Range(min = 1, max = 3) int obtainedMarks, @NotNull @Range(max = 2) int passingmMarks,
			@NotNull @Range(max = 3) int totalMarks, @NotNull @Size(max = 2) String grade) {
		super();
		this.resultId = resultId;
		this.student = student;
		this.division = division;
		this.standard = standard;
		this.examtype = examtype;
		this.year = year;
		this.gujarati = gujarati;
		this.english = english;
		this.environment = environment;
		this.science = science;
		this.socialscience = socialscience;
		this.maths = maths;
		this.hindi = hindi;
		this.sanskrit = sanskrit;
		this.pt = pt;
		this.drawing = drawing;
		this.pathmala = pathmala;
		this.obtainedMarks = obtainedMarks;
		this.passingmMarks = passingmMarks;
		this.totalMarks = totalMarks;
		this.grade = grade;
	}


	//getters and setters
	public int getResultId() {
		return resultId;
	}

	public void setResultId(int resultId) {
		this.resultId = resultId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
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

	public ExamType getExamtype() {
		return examtype;
	}

	public void setExamtype(ExamType examtype) {
		this.examtype = examtype;
	}

	public Calendar getYear() {
		return year;
	}

	public void setYear(Calendar year) {
		this.year = year;
	}

	public int getGujarati() {
		return gujarati;
	}

	public void setGujarati(int gujarati) {
		this.gujarati = gujarati;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getEnvironment() {
		return environment;
	}

	public void setEnvironment(int environment) {
		this.environment = environment;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getSocialscience() {
		return socialscience;
	}

	public void setSocialscience(int socialscience) {
		this.socialscience = socialscience;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public int getSanskrit() {
		return sanskrit;
	}

	public void setSanskrit(int sanskrit) {
		this.sanskrit = sanskrit;
	}

	public int getPt() {
		return pt;
	}

	public void setPt(int pt) {
		this.pt = pt;
	}

	public int getDrawing() {
		return drawing;
	}

	public void setDrawing(int drawing) {
		this.drawing = drawing;
	}

	public int getPathmala() {
		return pathmala;
	}

	public void setPathmala(int pathmala) {
		this.pathmala = pathmala;
	}

	public int getObtainedMarks() {
		return obtainedMarks;
	}

	public void setObtainedMarks(int obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}

	public int getPassingmMarks() {
		return passingmMarks;
	}

	public void setPassingmMarks(int passingmMarks) {
		this.passingmMarks = passingmMarks;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Result [resultId=" + resultId + ", student=" + student + ", division=" + division + ", standard="
				+ standard + ", examtype=" + examtype + ", year=" + year + ", gujarati=" + gujarati + ", english="
				+ english + ", environment=" + environment + ", science=" + science + ", socialscience=" + socialscience
				+ ", maths=" + maths + ", hindi=" + hindi + ", sanskrit=" + sanskrit + ", pt=" + pt + ", drawing="
				+ drawing + ", pathmala=" + pathmala + ", obtainedMarks=" + obtainedMarks + ", passingmMarks="
				+ passingmMarks + ", totalMarks=" + totalMarks + ", grade=" + grade + "]";
	}

	
	
	
}