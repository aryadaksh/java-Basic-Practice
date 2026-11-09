package com.week.nine.serlization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Daksh Arya", "Xdasew821", 2000000);
		
		try {
			FileOutputStream fis = new FileOutputStream("emp.daksh");
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(employee);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Serlization Done");
		
		
		
		
	}

}
