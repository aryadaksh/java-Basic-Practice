package com.streamapi3class;

import java.util.List;
import java.util.stream.Collectors;

public class NotRepatedChar {
	
	public static void main(String[] args) {
		String input = "rajar";
		/*
		 * List<Character> result = input.chars().mapToObj(c -> (char) c).filter(ch ->
		 * input.indexOf(ch) == input.lastIndexOf(ch)).collect(Collectors.toList());
		 */		
		
		Character result = input.chars().mapToObj(c -> (char) c).filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch)).findFirst().get();
		System.out.println(result);
	}

}
