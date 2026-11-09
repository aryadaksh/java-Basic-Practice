package com.week.six;

public class QuaryConstructor {

	public String constructQuary(String empId, double salary) {
		StringBuilder finalQuary = new StringBuilder("SELECT * FROM employee");
		
		if(empId != null) {
			finalQuary.append(" WHERE id = ").append(empId);
		}
		if(salary > 0) {
			finalQuary.append(" WHERE salary > ").append(salary);
		}
		
		finalQuary.append(";");
		
		
		
		return finalQuary.toString();
	}
	
}
