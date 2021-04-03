package com.school.app.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.CreatedDate;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 7,updatable = false)
	private int grNo;
	
	@ManyToOne
	private Standard standard;
	
	@OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
	private Parent parent;
	
	@ManyToMany
	private List<Activity> activity;

	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
	private List<Attendance> attendance;
	
	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
	private List<FeePayment> feePayment;
	
	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
	private List<Result> result;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,nullable = false)
	private String firstName;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,nullable = false)
	private String middleName;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,nullable = false)
	private String lastName;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,nullable = false)
	private String motherName;
	
	@NotNull
	@Size(max = 20)
	@Column(length = 20,nullable = false)
	private String fatherName;
	
	@NotNull
	@Max(100)@Min(1)
	@Column(length = 2,nullable = false)
	private int rollNo;
	
	@NotNull
	@Size(max = 10)
	@Column(length = 10,nullable = false)
	private String division;
	
	@NotNull
	@Column(nullable = false,columnDefinition = "DATE")
	@CreatedDate
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Calendar admissionDate;
	
	@NotNull
	@Size(max = 7)
	@Column(length = 7,nullable = false)
	private String stream;
	
	@NotNull
	@Size(max = 8)
	@Column(length = 8,nullable = false)
	private String medium;
	
	@NotNull
	@Size(max = 10)
	@Column(length = 10,nullable = false)
	private String religion;
	
	@NotNull
	@Size(max = 10)
	@Column(length = 10,nullable = false)
	private String subCaste;
	
	@NotNull
	@Size(max = 5)
	@Column(length = 5,nullable = false)
	private String category;
	
	@NotNull
	@Size(max = 6)
	@Column(length = 6,nullable = false)
	private String gender;
	
	@NotNull
	@Column(nullable = false,columnDefinition = "DATE")
	@CreatedDate
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Calendar dateOfBirth;
	
	@Size(max = 3)
	@Column(length = 3)
	private String bloodGroup;
	
	@NotNull
	@Size(max = 100)
	@Column(length = 100,nullable = false)
	private String address1;
	
	@NotNull
	@Size(max = 100)
	@Column(length = 100,nullable = false)
	private String address2;
	
	@NotNull
	@Column(length = 6,nullable = false)
	private int pincode;
	
	@Size(max = 50)
	@Column(length = 50)
	private String previousSchoolName;
	
	@Size(max = 255)
	@Column(length = 255)
	private String image;

	//default Constructor
	public Student()
	{
		super();
	}
	
	//Parameterized Constructor
	public Student(int grNo, Standard standard, Parent parent, List<Activity> activity, List<Attendance> attendance,
			List<FeePayment> feePayment, List<Result> result, @NotNull @Size(max = 20) String firstName,
			@NotNull @Size(max = 20) String middleName, @NotNull @Size(max = 20) String lastName,
			@NotNull @Size(max = 20) String motherName, @NotNull @Size(max = 20) String fatherName,
			@NotNull @Size(max = 2) int rollNo, @NotNull @Size(max = 10) String division, @NotNull Calendar admissionDate,
			@NotNull @Size(max = 7) String stream, @NotNull @Size(max = 8) String medium,
			@NotNull @Size(max = 10) String religion, @NotNull @Size(max = 10) String subCaste,
			@NotNull @Size(max = 5) String category, @NotNull @Size(max = 6) String gender, @NotNull Calendar dateOfBirth,
			@Size(max = 3) String bloodGroup, @NotNull @Size(max = 100) String address1,
			@NotNull @Size(max = 100) String address2, @NotNull @Size(max = 6) int pincode,
			@Size(max = 50) String previousSchoolName, @Size(max = 255) String image) {
		super();
		this.grNo = grNo;
		this.standard = standard;
		this.parent = parent;
		this.activity = activity;
		this.attendance = attendance;
		this.feePayment = feePayment;
		this.result = result;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.rollNo = rollNo;
		this.division = division;
		this.admissionDate = admissionDate;
		this.stream = stream;
		this.medium = medium;
		this.religion = religion;
		this.subCaste = subCaste;
		this.category = category;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.bloodGroup = bloodGroup;
		this.address1 = address1;
		this.address2 = address2;
		this.pincode = pincode;
		this.previousSchoolName = previousSchoolName;
		this.image = image;
	}

	//getters and setters
	public int getGrNo() {
		return grNo;
	}

	public void setGrNo(int grNo) {
		this.grNo = grNo;
	}

	public Standard getStandard() {
		return standard;
	}

	public void setStandard(Standard standard) {
		this.standard = standard;
	}

	public List<Activity> getActivity() {
		return activity;
	}

	public void setActivity(List<Activity> activity) {
		this.activity = activity;
	}

	/*public Parent getParent() {
	return parent;
	}
	
	public void setParent(Parent parent) {
		this.parent = parent;
	}*/
	
	/*public List<Attendance> getAttendance() {
		return attendance;
	}

	public void setAttendance(List<Attendance> attendance) {
		this.attendance = attendance;
	}

	public List<FeePayment> getFeePayment() {
		return feePayment;
	}

	public void setFeePayment(List<FeePayment> feePayment) {
		this.feePayment = feePayment;
	}

	public List<Result> getResult() {
		return result;
	}

	public void setResult(List<Result> result) {
		this.result = result;
	}*/

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public Calendar getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Calendar admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getSubCaste() {
		return subCaste;
	}

	public void setSubCaste(String subCaste) {
		this.subCaste = subCaste;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getPreviousSchoolName() {
		return previousSchoolName;
	}

	public void setPreviousSchoolName(String previousSchoolName) {
		this.previousSchoolName = previousSchoolName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Student [grNo=" + grNo + ", standard=" + standard + ", parent=" + parent + ", activity=" + activity
				+ ", attendance=" + attendance + ", feePayment=" + feePayment + ", result=" + result + ", firstName="
				+ firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", motherName=" + motherName
				+ ", fatherName=" + fatherName + ", rollNo=" + rollNo + ", division=" + division + ", admissionDate="
				+ admissionDate + ", stream=" + stream + ", medium=" + medium + ", religion=" + religion + ", subCaste="
				+ subCaste + ", category=" + category + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ ", bloodGroup=" + bloodGroup + ", address1=" + address1 + ", address2=" + address2 + ", pincode="
				+ pincode + ", previousSchoolName=" + previousSchoolName + ", image=" + image + "]";
	}
}