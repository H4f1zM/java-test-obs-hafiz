package com.test.java.model;

import java.util.ArrayList;

public class Department {

    ArrayList<Student> Students ;	
    String DeptName  ;
    double PassPercentage;
    int totalStudent ;

	public void   Departement()  {

	   this.Students = new ArrayList<Student>() ;
	   this.DeptName  = "" ;
	   this.PassPercentage =  60 ; // assume as default value   
	   this.totalStudent = 0 ;
   
	}

	
	public void calculatePassPercentage(int thresholdPoint) {
		
		int numOfPassStudent= 0 ;

	    // check status for each student 
	    for( int x = 0 ; x  < this.totalStudent ; x++ ) {

	    	if (  ((Student) this.Students.get(x)).getMarks()  >=  thresholdPoint  )   {
	    		numOfPassStudent = numOfPassStudent + 1 ;
	    		
	    	}
	    }

	   // calculate Department Pass status 
		   this.PassPercentage =   ( (double) numOfPassStudent / totalStudent * 100)  ;
		   
		/*   System.out.println("numOfPassStudent = " + numOfPassStudent);
		   System.out.println("totalStudent = " + totalStudent);
		   System.out.println("PassPercentage = " + PassPercentage );
		   System.out.println("================ " ) ; */
	}
	
		
	
	
	public ArrayList<Student> getStudents() {
		return Students;
	}

	public void setStudents(ArrayList<Student> students) {
		Students = students;
	}

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}

	public int getTotalStudent() {
		return totalStudent;
	}

	public void setTotalStudent(int totalStudent) {
		this.totalStudent = totalStudent;
	}


	public double getPassPercentage() {
		return PassPercentage;
	}


	public void setPassPercentage(int passPercentage) {
		PassPercentage = passPercentage;
	}


	
}

	

