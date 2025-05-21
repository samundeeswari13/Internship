package com.qtech.intenship.daytwo;

public class ParentClass {

	int add(int a, int b) {
		System.out.println("Parent Class");
		return a+b;
	}
	int add(int a, int b, int c) {
		System.out.println("Parent Class");
		return a+b+c;
	}
	float add(float a, float b) {
		System.out.println("parent Class");
		return a+b;
	}
	float add(int a, float b) {
		System.out.println("Parent Class");
		return a+b;
	}
	float add(float a, int b) {
		System.out.println("Parent Class");
		return a+b;
		}
	
}