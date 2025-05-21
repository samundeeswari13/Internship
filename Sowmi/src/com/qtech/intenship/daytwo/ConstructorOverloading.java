package com.qtech.intenship.daytwo;


public class ConstructorOverloading {
	//Default constructor
	public ConstructorOverloading() {
		System.out.println("default constructor");
	}
	int ConstructorOverloading(int a, int b) {
		return a+b;
	}
    int ConstructorOverloading(int a) {
    	return a;
    }
    
    public static void main(String[] args) {
    	ConstructorOverloading c= new ConstructorOverloading();
    	c.ConstructorOverloading(67);
    	c.ConstructorOverloading(45,78);
    	
}
    
}
