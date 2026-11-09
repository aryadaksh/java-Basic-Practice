package com.week.nine.deepcloning;

public class Address implements Cloneable
{
	
	private String line1;
	private String line2;
	
	public Address(String line1,String line2)
	{
		this.line1 = line1;
		this.line2 = line2;
	}
	
	public String getAddress()
	{
		return line1 +"\n"+line2;
	}
	
	public void setAddress(String l1, String l2) {
		this.line1 = l1;
		this.line2 = l2;
		//return address;
	}
	
	public Address clone() throws CloneNotSupportedException {
		return (Address)super.clone();
	}

}
