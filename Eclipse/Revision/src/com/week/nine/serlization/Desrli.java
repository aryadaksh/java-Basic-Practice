package com.week.nine.serlization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Desrli {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.daksh"));
		
		Employee emp = (Employee)ois.readObject();
		
		System.out.println(emp.getName()+" "+emp.getEmpId()+" "+emp.getSalary());
		//System.out.println(emp.);
		
	}
}
