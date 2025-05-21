package com.internship.daynine;

public class UndergraduateStudent extends Student{
	
  public UndergraduateStudent(String studentId, String name, String department,double gpa)throws
	InvalidGPAException {
		super(studentId, name, department,gpa);
	
	}
	public void calculateGrade() {
		
	}

public boolean isPassed() {

   return getGPA()>=2.0;
}
public void displayDetails() {
	System.out.println("Student:"+getName()+"|Type:Undergraduate|GPA:"+ getGPA()+
			"|Status:"+(isPassed()?"Passed":"Failed"));
    }
}

