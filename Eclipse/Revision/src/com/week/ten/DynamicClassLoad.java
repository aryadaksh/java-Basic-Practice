package com.week.ten;

public class DynamicClassLoad {
	
	void dynamicLoadClass() throws ClassNotFoundException {
		Class.forName("Html.java");
	}

}
