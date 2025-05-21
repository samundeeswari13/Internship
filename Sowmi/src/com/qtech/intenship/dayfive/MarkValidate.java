package com.qtech.intenship.dayfive;public class MarkValidate {
	
	static void validateMark(int mark) throws InvalidMarkException{
		if(mark < 100) {
			throw new InvalidTargetObjectTypeException("Mark must be 1 to 100 ");
			}else {
				System.out.println("You can Student");
			}
	}
	
	public static void main(String args[]) {
		
	try {
		validateMark(60);
	} catch (InvalidKeySpecException e) {
		
		e.printStackTrace();
	}
 {

	}

	}}
