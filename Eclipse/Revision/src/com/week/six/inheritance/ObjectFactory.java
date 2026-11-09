package com.week.six.inheritance;

public class ObjectFactory {
	Object getObject(String name) {
		Object obj = null;
		if(name.equals("Employee")){
			obj = new Employee();
		}
		else if(name.equals("Manager")) {
			obj = new Manager();
		}
			
		
		return obj;
		
				
	}

}
