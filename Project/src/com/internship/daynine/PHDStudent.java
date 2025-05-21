package com.internship.daynine;

public class PHDStudent extends Student {
	public PHDStudent(String studentId, String name, String department,double gpa)throws
	InvalidGPAException {
		super(studentId,name,department,gpa);
		}
	public void calculateGrade() {
 }
public boolean isPassed() {
   return getGPA()>=3.0;
}

public void displayDetails() {
	System.out.println("Student:"+getName()+"|Type:PHD|GPA:"+ getGPA()+
			"|Status:"+(isPassed()?"Passed":"Failed"));
    }	

}
