package ecom.JUnit.Sample.OrderMgmt;

public class Largest {
	
	public int largestNumber(int []nums) {
		int largest =Integer.MIN_VALUE;
		
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] > largest) {
				largest = nums[i];
			}
		}
		
		
		
		return largest;
	}

}
