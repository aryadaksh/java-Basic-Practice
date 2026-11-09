package com.streamapi3class;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurrenceOfChar {
	public static void main(String[] args) {
		String input = "Pneumonoultramicroscopicsilicovolcanoconiosis";
		
		Map<Character, Long> result =input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(e -> e,Collectors.counting()));
		System.out.println(result);
	}

}
