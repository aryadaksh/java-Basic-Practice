package com.streamapi3class;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Delhi", "Mumbai", "Bengaluru", "Chennai", "Kolkata", "Hyderabad", "Pune",
				"Ahmedabad", "Jaipur", "Lucknow", "Surat", "Nagpur", "Indore", "Bhopal", "Patna", "Kanpur",
				"Coimbatore", "Vadodara", "Rajkot", "Varanasi");

		/* long total = cities.stream().count(); */
		long total = cities.stream().collect(Collectors.counting());

		// Difference between count() and Collectors.counting()
		// -> Both are use to count the elements count()-> this will count all the
		// elements within the stream Collectors.counting() this will apply when we will
		// do groupBy and all
		System.out.println(total);
		
		// GroupBy by length
		Map<Integer,List<String>> groupByLength = cities.stream().collect(Collectors.groupingBy(c->c.length(),Collectors.toList()));
		System.out.println(groupByLength);
	}
}
