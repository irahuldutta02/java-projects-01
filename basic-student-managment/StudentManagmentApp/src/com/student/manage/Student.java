package com.student.manage;

public class Student {
	private int studentId;
	private String studentName;
	private String studentPhone;
	private String studentcity;

	public Student(int studentId, String studentName, String studentPhone, String studentcity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentcity = studentcity;
	}

	public Student(String studentName, String studentPhone, String studentcity) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentcity = studentcity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentcity() {
		return studentcity;
	}

	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentcity=" + studentcity + "]";
	}

}
