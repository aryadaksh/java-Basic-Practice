package com.week.two;

public class TypeOfVariable {
	
	//-> class metadata/bytecode -> Stored in MetaSpace(also called the method Area)
	

	static int staticValue =20; // belongs to class -> one copy per class
								// to access static variable className.staticVaraibleName
								// stored in the heap
	int instanceValue; // belongs to object  ->  one copy per object
					   // stored in the heap
	
	public static void main(String[] args) {
		int localValue = 10; // belongs to methods only 
							 // stored in the stack
	}
}
