package com.fuctionalinterface;

public class Driver {
	
	public static byte[] transformArray(short[] array, ShortToByteFunction function) {
		
		byte[] transformArray = new byte[array.length];
		for(int i = 0; i< array.length; i++) {
			transformArray[i] = function.applyAsByte(array[i]);
			
		}
		
		return transformArray;
		
	}
 	
	public static void main(String[] args) {
		
		short[] array = {(short) 1,(short) 2,(short) 3};
		byte[] transformedArray = transformArray(array, s -> (byte) (s*2));
		
		byte[] exceptedArray = {(byte) 2, (byte) 5, (byte) 6};
		boolean result = assertArrayEquals(exceptedArray,transformedArray);
		System.out.println("Result : "+result);
	}

	private static boolean assertArrayEquals(byte[] exceptedArray, byte[] transformedArray) {
		boolean s = false;
		for(int i =0; i< exceptedArray.length; i++) {
			
			if(transformedArray[i] == exceptedArray[i]) {
				s = true;
			}
			else { s= false; break;}
				
			
		}
		
		return s;
	}

	

}
