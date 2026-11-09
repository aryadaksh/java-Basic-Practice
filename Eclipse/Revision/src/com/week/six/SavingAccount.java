package com.week.six;

public class SavingAccount extends Accountx {

	private  static int interestRate = 5;
	
	public SavingAccount(String _accountHolderName, String _userId, int _balance) {
		super(_accountHolderName,  _userId,  _balance);
	}
	
	public SavingAccount() {
		
	}
	
	public void updateInterstRate(int rate) {
		interestRate = rate;
	}
	
	public int calculateInterestRate() {
		int interest = (interestRate*super.showBalance())/100;
		//int balance = super.showBalance()+interest;
		System.out.println("Interest Rate:"+interest);
		return interest;
	}
	@Override
	public int showBalance() {
		
		return super.showBalance()+calculateInterestRate();
	}
	
	public void showDetailsSaving() {
		super.showDetails();
		System.out.println("Interest Rate:"+interestRate);
		System.out.println("Balance: "+showBalance());
	}
	
}
