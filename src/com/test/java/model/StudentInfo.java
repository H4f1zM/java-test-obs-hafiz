package com.test.java.model;

import java.util.ArrayList;

public class StudentInfo {

	ArrayList<Department> deptList ;
	int  thresholdPass ;
	
	public StudentInfo() {
		this.deptList = new ArrayList<Department>() ;
		this.thresholdPass = 40 ; 
		this.createData();
	}
	
	public void createData() {
		
		// department 1
		Department deptObj1 = new Department();
		ArrayList<Student> StudentList1 = new ArrayList<Student>() ;
		StudentList1.add( new Student("s1","studentOne",35) ) ;
		StudentList1.add( new Student("s2","studentTwo",70) ) ;
		StudentList1.add( new Student("s3","studentThree",60) ) ;
		StudentList1.add( new Student("s4", "studentFour",90) ) ;
		deptObj1.setDeptName("Dep 1");
		deptObj1.setStudents(StudentList1);
		deptObj1.setTotalStudent(4);
		deptObj1.calculatePassPercentage(thresholdPass);
		
		deptList.add(deptObj1) ;
		
		
		// department 2
		Department deptObj2 = new Department();
		ArrayList<Student> StudentList2 = new ArrayList<Student>() ;
		StudentList2.add( new Student("s5","studentFive", 30) ) ;
		deptObj2.setDeptName("Dep 2");
		deptObj2.setStudents(StudentList2);
		deptObj2.setTotalStudent(1);
		deptObj2.calculatePassPercentage(thresholdPass);
		deptList.add(deptObj2) ;
		
		
		// department 3
		Department deptObj3 = new Department();
		ArrayList<Student> StudentList3 = new ArrayList<Student>() ;
		StudentList3.add( new Student("s6","studentSix",32) ) ;
		StudentList3.add( new Student("s7","studentSeven",70) ) ;
		StudentList3.add( new Student("s8","studentEight",20) ) ;
		deptObj3.setDeptName("Dep 3");
		deptObj3.setStudents(StudentList3);
		deptObj3.setTotalStudent(3);
		deptObj3.calculatePassPercentage(thresholdPass);
		deptList.add(deptObj3) ;
		

		
	}

	public ArrayList<Department> getDeptList() {
		return deptList;
	}

	public void setDeptList(ArrayList<Department> deptList) {
		this.deptList = deptList;
	}

	public int getThresholdPass() {
		return thresholdPass;
	}

	public void setThresholdPass(int thresholdPass) {
		this.thresholdPass = thresholdPass;
	}
	
	
	
}
