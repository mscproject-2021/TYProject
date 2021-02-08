package com.example.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Result {
	
	@Id
	private int Result_id;
	private int GR_NO;
	private int division_id;
	private int examtype_id;
	private Date year;
	private String gujarati;
	private String english;
	private String environment;
	private String science;
	private String socialscience;
	private String maths;
	private String hindi;
	private String sanskrit;
	private String pt;
	private String drawing;
	private String pathmala;
	private int obtained_marks;
	private int passing_marks;
	private int total_marks;
	private String grade;
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Result(int result_id, int gR_NO, int division_id, int examtype_id, Date year, String gujarati,
			String english, String environment, String science, String socialscience, String maths, String hindi,
			String sanskrit, String pt, String drawing, String pathmala, int obtained_marks, int passing_marks,
			int total_marks, String grade) {
		super();
		Result_id = result_id;
		GR_NO = gR_NO;
		this.division_id = division_id;
		this.examtype_id = examtype_id;
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
		this.obtained_marks = obtained_marks;
		this.passing_marks = passing_marks;
		this.total_marks = total_marks;
		this.grade = grade;
	}
	public int getResult_id() {
		return Result_id;
	}
	public void setResult_id(int result_id) {
		Result_id = result_id;
	}
	public int getGR_NO() {
		return GR_NO;
	}
	public void setGR_NO(int gR_NO) {
		GR_NO = gR_NO;
	}
	public int getDivision_id() {
		return division_id;
	}
	public void setDivision_id(int division_id) {
		this.division_id = division_id;
	}
	public int getExamtype_id() {
		return examtype_id;
	}
	public void setExamtype_id(int examtype_id) {
		this.examtype_id = examtype_id;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	public String getGujarati() {
		return gujarati;
	}
	public void setGujarati(String gujarati) {
		this.gujarati = gujarati;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getScience() {
		return science;
	}
	public void setScience(String science) {
		this.science = science;
	}
	public String getSocialscience() {
		return socialscience;
	}
	public void setSocialscience(String socialscience) {
		this.socialscience = socialscience;
	}
	public String getMaths() {
		return maths;
	}
	public void setMaths(String maths) {
		this.maths = maths;
	}
	public String getHindi() {
		return hindi;
	}
	public void setHindi(String hindi) {
		this.hindi = hindi;
	}
	public String getSanskrit() {
		return sanskrit;
	}
	public void setSanskrit(String sanskrit) {
		this.sanskrit = sanskrit;
	}
	public String getPt() {
		return pt;
	}
	public void setPt(String pt) {
		this.pt = pt;
	}
	public String getDrawing() {
		return drawing;
	}
	public void setDrawing(String drawing) {
		this.drawing = drawing;
	}
	public String getPathmala() {
		return pathmala;
	}
	public void setPathmala(String pathmala) {
		this.pathmala = pathmala;
	}
	public int getObtained_marks() {
		return obtained_marks;
	}
	public void setObtained_marks(int obtained_marks) {
		this.obtained_marks = obtained_marks;
	}
	public int getPassing_marks() {
		return passing_marks;
	}
	public void setPassing_marks(int passing_marks) {
		this.passing_marks = passing_marks;
	}
	public int getTotal_marks() {
		return total_marks;
	}
	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Result [Result_id=" + Result_id + ", GR_NO=" + GR_NO + ", division_id=" + division_id + ", examtype_id="
				+ examtype_id + ", year=" + year + ", gujarati=" + gujarati + ", english=" + english + ", environment="
				+ environment + ", science=" + science + ", socialscience=" + socialscience + ", maths=" + maths
				+ ", hindi=" + hindi + ", sanskrit=" + sanskrit + ", pt=" + pt + ", drawing=" + drawing + ", pathmala="
				+ pathmala + ", obtained_marks=" + obtained_marks + ", passing_marks=" + passing_marks
				+ ", total_marks=" + total_marks + ", grade=" + grade + "]";
	}
	
	
}