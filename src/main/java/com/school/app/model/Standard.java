package com.school.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Standard 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
	@GenericGenerator(name="native",strategy = "native")
	@Column(length = 2,updatable = false)
	private int standardId;
	
	@ManyToMany
	private List<Division> division;
	
	@OneToMany(mappedBy = "standard")
	private List<Student> student; 
	
	@ManyToMany(mappedBy = "standard")
	private List<Subject> subject;
	
	@OneToMany(mappedBy = "standard")
	private List<TimeTable> timetable;
	
	@ManyToMany(mappedBy = "standard")
	private List<Teacher> teacher;
	
	@OneToMany(mappedBy = "standard")
	private List<StudyMaterial> studyMaterial;
	
	@OneToMany(mappedBy = "standard")
	private List<Result> result;
	
	@OneToMany(mappedBy = "standard")
	private List<ResultFile> resultFile;
	
	@OneToMany(mappedBy = "standard")
	private List<Meeting> meeting;
	
	@NotNull
	@Column(length = 2,nullable = false)
	private int standardName;
	
	@NotNull
	@Column(length = 3,nullable = false)
	private int noOfStudents;
	
	@NotNull
	@Column(length = 2,nullable = false)
	private int noOfSubjects;

	//default Constructor
	public Standard() 
	{
		super();
	}

	public Standard(int standardId, List<Division> division, List<Student> student, List<Subject> subject,
			List<TimeTable> timetable, List<Teacher> teacher, List<StudyMaterial> studyMaterial, List<Result> result,
			List<ResultFile> resultFile, List<Meeting> meeting, @NotNull int standardName, @NotNull int noOfStudents,
			@NotNull int noOfSubjects) {
		super();
		this.standardId = standardId;
		this.division = division;
		this.student = student;
		this.subject = subject;
		this.timetable = timetable;
		this.teacher = teacher;
		this.studyMaterial = studyMaterial;
		this.result = result;
		this.resultFile = resultFile;
		this.meeting = meeting;
		this.standardName = standardName;
		this.noOfStudents = noOfStudents;
		this.noOfSubjects = noOfSubjects;
	}

	public int getStandardId() {
		return standardId;
	}

	public void setStandardId(int standardId) {
		this.standardId = standardId;
	}

	public List<Division> getDivision() {
		return division;
	}

	public void setDivision(List<Division> division) {
		this.division = division;
	}

	/*public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	public List<TimeTable> getTimetable() {
		return timetable;
	}

	public void setTimetable(List<TimeTable> timetable) {
		this.timetable = timetable;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	public List<StudyMaterial> getStudyMaterial() {
		return studyMaterial;
	}

	public void setStudyMaterial(List<StudyMaterial> studyMaterial) {
		this.studyMaterial = studyMaterial;
	}

	public List<Result> getResult() {
		return result;
	}

	public void setResult(List<Result> result) {
		this.result = result;
	}

	public List<ResultFile> getResultFile() {
		return resultFile;
	}

	public void setResultFile(List<ResultFile> resultFile) {
		this.resultFile = resultFile;
	}

	public List<Meeting> getMeeting() {
		return meeting;
	}

	public void setMeeting(List<Meeting> meeting) {
		this.meeting = meeting;
	}*/

	public int getStandardName() {
		return standardName;
	}

	public void setStandardName(int standardName) {
		this.standardName = standardName;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public int getNoOfSubjects() {
		return noOfSubjects;
	}

	public void setNoOfSubjects(int noOfSubjects) {
		this.noOfSubjects = noOfSubjects;
	}

	@Override
	public String toString() {
		return "Standard [standardId=" + standardId + ", division=" + division + ", student=" + student + ", subject="
				+ subject + ", timetable=" + timetable + ", teacher=" + teacher + ", studyMaterial=" + studyMaterial
				+ ", result=" + result + ", resultFile=" + resultFile + ", meeting=" + meeting + ", standardName="
				+ standardName + ", noOfStudents=" + noOfStudents + ", noOfSubjects=" + noOfSubjects + "]";
	}
}
