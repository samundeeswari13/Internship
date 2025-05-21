package com.qtech.internship.dayfour;

import java.util.Scanner;

public class Exception{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no 1 :");
		int n1 = scanner.nextInt();
		System.out.println("Enter no 2 :");
		int n2 = scanner.nextInt(); 
		try {
			divide(n1,n2);
		} catch (ArithmeticException exception) {
			System.out.println("Invalid denominator...");
		}
	}
	public static void divide(int n1, int n2) {
			System.out.println(n1/n2);
		
		}
	}


