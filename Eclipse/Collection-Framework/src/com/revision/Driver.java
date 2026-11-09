package com.revision;

import java.util.HashMap;
import java.util.HashSet;

public class Driver {
	
	public boolean isDuplicate(int[] nums) {
		 HashSet<Integer> set = new HashSet<Integer>();
	        for(int i = 0; i<nums.length; i++){
	            int currElem = nums[i];
	            if(set.contains(currElem)){
	                return true;
	            }
	            set.add(currElem);
	        }
	        return false;
	    }
	

	public static void main(String[] args)
	{
		
	}
}
