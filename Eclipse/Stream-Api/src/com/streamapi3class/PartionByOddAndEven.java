package com.streamapi3class;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartionByOddAndEven {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    7, 12, 45, 3, 89,
			    21, 56, 14, 72, 33,
			    98, 5, 64, 27, 11,
			    42, 67, 19, 88, 30
			);
		
	Map<Boolean,List<Integer>> result =	numbers.stream().collect(Collectors.partitioningBy( num -> num %2 == 0));
	System.out.println(result);
	}
}
