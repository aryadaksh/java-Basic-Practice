package com.week.one;

import java.util.Scanner;

public class FundTranfer {
	
	//Encapultion
	private String fromAccount;
	private String toAccount;
	private double amount;
	
	
	
	//Permetersized constructor
	FundTranfer(String _fromAccount, String _toAccount, double _amount) {
		this.fromAccount = _fromAccount;
		this.toAccount = _toAccount;
		this.amount = _amount;

	}
	// default constructor 
	FundTranfer() {
		this("45656", "3456", 100);
		System.out.println("This is Defaut COnstructor.");
		System.out.println("-----------------------------------------------------------------");
	}

	
	
	
	boolean tranferFund(String fromAccount, String toAccount, double amount) {
		if (amount == 0 || amount <= 0) {
			System.err.println("Transfer failed: Amount must be greater than zero.");
            return false;
		}
		
		if (fromAccount == null || toAccount == null || fromAccount == null || toAccount == null) {
            System.err.println("Transfer failed: Account details cannot be empty.");
            return false;
        }
		
		else {
			System.out.println("SUCCESS: Transferred $" + amount + " from " + fromAccount + " to " + toAccount);
			return true;
		}

	}
	
	//getter Setter 
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

	public static void main(String[] args) {
		

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Amount :");
		//double amount = scanner.nextDouble();
		
		//scanner.nextLine();
		System.out.println("From Account :");
		//String fromAccount = scanner.nextLine();
		System.out.println("To Account :");
		//String toAccount = scanner.nextLine();
		
		FundTranfer ft = new FundTranfer();
		//FundTranfer ft1 = new FundTranfer(fromAccount, toAccount, amount);
		
	//	ft.tranferFund(fromAccount, toAccount, amount);
		//ft1.tranferFund(fromAccount, toAccount, amount);
		
		scanner.close();

	}
	

}
