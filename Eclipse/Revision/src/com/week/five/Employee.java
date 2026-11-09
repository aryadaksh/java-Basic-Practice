package com.week.five;

public class Employee {
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Khihi");
        return true;
    }
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		//System.out.println(e1 == e2); // false cuz both will have different address in heap
		System.out.println(e1.equals(e2)); // false cuz employee doesn't override equals
										  // so its uses Object default (same as ==)
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		//System.out.println(s1 = s2);
		//System.out.println(s1.equals(s2));
		
		e1.equals(new Employee());
	}

}
