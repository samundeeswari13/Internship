package com.internship.daynine;

public class PostgraduateStudent extends Student {
	
	public PostgraduateStudent(String studentId, String name, String department,double gpa)
throws InvalidGPAException {
		
		super(studentId,name,department,gpa);
		
	}
	
	
	public void calculateGrade() {
}
	
	public boolean isPassed() {
   return getGPA()>=2.5;
}


public void displayDetails() {
	
	System.out.println("Student:"+ getName()+"|Type:postgraduate|GPA:"+ getGPA()+
			"|Status:"+(isPassed()?"Passed":"Failed"));
    }

}

