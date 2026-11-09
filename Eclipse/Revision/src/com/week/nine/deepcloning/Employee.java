package com.week.nine.deepcloning;

public class Employee implements Cloneable
{
	
	private String name;
	private Address address;
	
	public Employee(String name,Address address)
	{
		this.name = name;
		this.address= address;
	}
	
	public String getDetails() {
		return name+"\n"+address.getAddress();
	}
	
	public void setDetails(String name,String l1,String l2) {
		this.name = name;
		this.address = new Address(null,null);
		this.address.setAddress(l1, l2);
	}
	
	public Employee clone() throws CloneNotSupportedException {
		Employee cloned = (Employee) super.clone();
		cloned.address = (Address) this.address.clone();
		return cloned;
	}

}
