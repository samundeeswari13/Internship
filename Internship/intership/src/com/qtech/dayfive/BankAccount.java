 package com.qtech.dayfive;

public class BankAccount {
    private int accno;
    private double balance;
    public BankAccount(int accno, double initialBalance) {
    	this.accno=accno;
    	this.balance=initialBalance;
    }
    public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	public void deposit(double amount)throws InvalidAmountException {
		if(amount<=0) {
			throw new InvalidAmountException("Deposit amount must be positive:");
		}
		else {
			balance=balance+amount;
			System.out.println("Deposited:"+amount);
		}
		}
        public void withdraw(double amount)throws InvalidAmountException {
		    if(amount<=0) {
			throw new InvalidAmountException("Withdraw amount must be lessthan amount:");
		}
		    else {
		    	balance=balance-amount;
		    	System.out.println("Withdraw:"+amount);
		    }
            }
            public void displayBalancce() {
    	    System.out.println("current balance:"+balance);
    }
    public static void main(String[] args) {
    	BankAccount account = new BankAccount();
    	try {
    		account.deposit(500);
    		account.withdraw(300);
    		account.withdraw(2000);
    	}catch(InvalidAmountException e) {
    		System.out.println("Transaction error:"+e.getMessage());
    	}
    
    }
	public void displayBalance() {
		// TODO Auto-generated method stub
		
	}
}
    
    