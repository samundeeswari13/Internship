package com.qtech.dayfive;

public class BankAccount {
    private int accno;
    private double balance;
    public BankAccount(int accno, double initialBalance) {
    	this.accno=accno;
    	this.balance=initialBalance;
    }
    public void deposit(double amount)throws InvalidAmountException {
		if accNo;
	}
	public void setAccNo(int accNo) {
    	this.accNo = accNo;
    }
    public double getBalance() {
    	return balance;
    }
    public void setBalance(double balance) {
    	this.balance = balance;
    }
    public BankAccount() {
    	super();
    	
    }
	public BankAccount(int accNo, double balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", balance=" + balance + "]";
	}
	void deposit(int amount) throws InsufficentAmountException {
		if(amount > DepositLimit) {
			throw new InvalidAmountException
			
		}
		balance = balance + amount;
	}
	
	void withdraw(int amount) throws InsufficientFundException {
		if(balance < amount) {
			throw new ("Insufficient balance");
		}
		balance = balance - amount;
	}
	
	void displayBalance() {
		System.out.println("My current balance is:" +balance);
		}
	
}
