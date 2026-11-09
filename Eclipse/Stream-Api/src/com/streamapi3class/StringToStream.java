package com.streamapi3class;

import java.util.List;
import java.util.stream.Collectors;

public class StringToStream {
	public static void main(String[] args) {

		String input = "Hello";
		List<Character> result =input.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
		System.out.println(result);
	}

}
