package com.qtech.dayfive;

public class MainClass {
    public static void main(String[] args) {
    	BankAccount account=new BankAccount();
    	try {
    		account.deposit(500);    	
    	}catch(InvalidAmountException e) {
    		System.out.println("Transaction error:"+e.getMessage());
    	}
        account.displayBalancce();
    }
 
}
