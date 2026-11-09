package com.week.six.quarybuilder;

public class DyanmicQuaryBuilder {
	
 public 	String quaryBuilder(String empId, double salary) {
		StringBuilder quary = new StringBuilder("SELECT * FROM employee");
		if(!empId.isEmpty() ) {
			quary.append(" WHERE id = ").append(empId);
			
		}
		if(salary > 0) {
			quary.append(" AND WHERE salary > ").append(salary);
		}
		quary.append(";");
		
		return quary.toString();
	}

}
