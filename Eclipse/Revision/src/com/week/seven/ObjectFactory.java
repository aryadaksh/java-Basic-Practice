package com.week.seven;

public class ObjectFactory {

	public Object getObject(String name) {
		Object obj = null;
		if(name.equals("parent")) {
			obj = new Parent();
		}else if(name.equals("Child")) {
			obj = new Child();
		}
		
		
		return obj;
	}
}
