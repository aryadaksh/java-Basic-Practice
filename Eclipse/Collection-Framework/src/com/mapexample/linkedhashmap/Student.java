package com.mapexample.linkedhashmap;

public class Student {
	
	private String name;
	private int rollNo;
	
	public Student(String name, int rollNo) {
		this.name  = name;
		this.rollNo = rollNo;
	}

	public int getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public int hashCode() {
		return name.hashCode()+rollNo;
	}
	
	public boolean equals(Object obj) {
		return this.name.equals(((Student)obj).getName()) & this.rollNo == ((Student)obj).getRollNo();
	}
	
	public String toString() {
		return name+" "+rollNo;
	}
}
