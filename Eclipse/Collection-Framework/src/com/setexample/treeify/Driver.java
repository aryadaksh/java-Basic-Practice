package com.setexample.treeify;

import java.util.HashSet;

class Company{
	
	private String name;
	public Company(String name) {
		this.name =name;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
	
}

public class Driver {
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	public static void main(String[] args) {
		
		HashSet<Company> company  = new HashSet<Company>();
		company.add(new Company("TCS1"));
		company.add(new Company("TCS2"));
		company.add(new Company("TCS3"));
		company.add(new Company("TCS4"));
		company.add(new Company("TCS5"));
		company.add(new Company("TCS6"));
		company.add(new Company("TCS7"));
		company.add(new Company("TCS8"));
		company.add(new Company("TCS9"));
		company.add(new Company("TCS10"));
		company.add(new Company("TCS11"));
		
//		company.remove("TCS10");
//		company.remove("TCS9");
//		company.remove("TCS8");
//		company.remove("TCS7");
//		company.remove("TCS6");
//		company.remove("TCS5");
		
		
	}

}
