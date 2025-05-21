package com.qtech.intenship.daytwo;

public class InterfaceClass implements InterfaceOne, InterfaceTwo {
	@Override
	public void display() {
		System.out.println("Display method");
	}
	
	@Override
	public void print() {
		System.out.println("Print method");
		}
	
	public static void main(String[] args) {
		
		InterfaceClass i = new InterfaceClass();
		i.display();
		i.print();
	}
	
}
