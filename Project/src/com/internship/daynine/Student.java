package com.internship.daynine;

public abstract class Student implements Evaluatable {
	private String studentsId;
	private String name;
	private String department;
	private double gpa; 
	public Student(String studentsId,String name,String department,double gpa)
throws InvalidGPAException {
		this.studentsId = studentsId;
		this.name = name;
		this.department = department;
		setGPA(gpa);
		
	}
	public String getStudentsId() {
		return studentsId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public double getGPA() {
		return gpa;
	}
	public void setGPA(double gpa) throws InvalidGPAException {
		if (gpa<0.0 || gpa>4.0) {
			throw new InvalidGPAException("GPA must be between 0.0 and 4.0");
			
		}
		
		this.gpa=gpa;
		
	}
	 public abstract void calculateGrade();
	 public abstract void displayDetails();

}
