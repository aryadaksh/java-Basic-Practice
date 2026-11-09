package com.week.eight;

public interface IBanking {

	void deposit(double amount); // its means public abstract void deposit()

	void withdraw(double amount); // its means public abstract void withdraw()

	void checkBalance();

	// there is new regulation after 20 years i.e printPassbook og rurals bank only
	//void printPassbook(); // this will forces ALL 20 implementing bank to add this
	// we are implementing its unnesscary thats no need

	// so in java 8 java introduce default methods that u can use directly or u can
	// implements by overrideing it
	
	public default void printPassbook()
	{
		System.out.println("IBanking.printPassbook()");
	}

}
