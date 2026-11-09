package com.books;

import java.util.ArrayList;
import java.util.List;

public class Driver2 {

	public static void main(String[] args) {
		List<String> word = new ArrayList<>();
		word.add("Hello");
		word.add(" World!");
		String s = word.get(0)+word.get(1);
		assert  s.equals("Hello World!");
	}
}
