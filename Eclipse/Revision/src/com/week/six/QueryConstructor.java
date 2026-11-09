package com.week.six;

public class QueryConstructor {
	
	public String constructQuery(String employeeId, String salary) {
		StringBuilder query = new StringBuilder("SELECT * FROM employee");
		
		if(employeeId != null) {
			query.append("WHERE id = ").append(employeeId);
		}
		else if(salary != null) {
			query.append("WHERE salary > ").append(salary);
		}
		
		query.append(";");
		
		return query.toString();
		
	}

}
