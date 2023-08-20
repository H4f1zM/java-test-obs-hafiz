package com.test.java.model;

public class Student {
	String studentID ;
	String studentName;
	int  marks ;
	


	public  Student(String studentIDParam, String studentNameParam, int marksParam) {
		this.studentID = studentIDParam;
		this.studentName = studentNameParam ;
		this.marks = marksParam ;
		
	}

	
	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	
	
	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
