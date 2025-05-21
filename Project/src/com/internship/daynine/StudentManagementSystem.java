package com.internship.daynine;

public class StudentManagementSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Student[] students = new Student[5];
           int passedCount = 0;
           int TotalStudents =0;
           
           try {
        	   students[0] = new UndergraduateStudent("UG001","John Doe","Computer Science",3.5);
        	   
        	   TotalStudents++;
        	   
        	 }catch (InvalidGPAException e) {
        		 
        		 System.out.println("Error occured while setting GPA for student ID:UG001");
        		 
        		 System.out.println(e.getMessage());
        	 }
           
           try {
        	   students[1]=new PostgraduateStudent("PG001","Alice Smith","Business",2.3);
        	   TotalStudents++;
           } catch (InvalidGPAException e) {
        	   System.out.println("Error occured while setting GPA for student ID:PG001");
        	   System.out.println(e.getMessage());
           }
           
           try {
        	   students[2]=new PHDStudent("PHD001","Dr.Cari Sagan","Physics",3.9);
        	   TotalStudents++;
           } catch(InvalidGPAException e) {
        	   System.out.println("Error occured while setting GPA for student ID:PHD001");
        	   
        	   System.out.println(e.getMessage());
           }
           
           try {
        	   students[3]=new UndergraduateStudent("UG004","Jane Roe","Engineering",5.0);
        	   
        	   TotalStudents++;
           } catch (InvalidGPAException e) {
      	   System.out.println("Error occured while setting GPA for student ID:PG001");
      	   System.out.println("InvalidGPAException:"+e.getMessage());
      	   
           }
           
           try {
        	   students[4]=new PHDStudent("PHD002","Dr.Grace Hopper","Computer Science",3.2);
        	   
        	   TotalStudents++;
           } catch (InvalidGPAException e) {
        	   System.out.println("Error occured while setting GPA for student ID:PHD002");
        	   System.out.println(e.getMessage());
            }
           
            for (Student student:students) {
            	if(student !=null) {
            		student.calculateGrade();
            		student.displayDetails();
            		if(student.isPassed()) {
            			passedCount++;
            		}
            	}
            }
            System.out.println("Total Students:"+TotalStudents);
            
            
            System.out.println("Student Passed:"+ passedCount);
            		}
            	}
            


