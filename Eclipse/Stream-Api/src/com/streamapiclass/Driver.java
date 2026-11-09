package com.streamapiclass;

import java.util.Arrays;

/*
 * 1.	Given a list of integers, use filter() to find all numbers greater than 50.

	2.	Given a list of employee names, use map() to convert all names to uppercase.

	3.	Given a list of employees, use filter() to find employees with salary greater than 10 LPA and map() to get only their names.

	4.	Given a list of products, use filter() to find products with price greater than 1,000 and map() to apply a 10% discount.

	5.	Given List<List<String>>, use flatMap() to convert it into a single List<String>.
 */

import java.util.List;
import java.util.Optional;

public class Driver {

	public static void main(String[] args)
	{
		List<String> cityName = Arrays.asList("Patna","BLR","Udaipur","Jaipur","HYD","CHE","THV");
		Optional<String> value =cityName.stream().filter(word -> word.startsWith("B")).findFirst();
		
		if(value.isPresent())
		{
			System.out.println(value);
		}
		
		
	}
}
