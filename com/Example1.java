package com;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import static java.util.stream.Collectors.*;

import java.time.Month;

public class Example1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Vivek", "Varun", "Test", "Xyz");
		
		// Print Names in Upper Case With Commna Seperated
		System.out.println(
			names.stream()
				 .map(String::toUpperCase)
				 .collect(joining(","))
		);
		System.out.println(new Example1().toUpperCase("vivek"));
		
	}
	
	
	
	// To Upper Case With Impementation
	public String toUpperCase(String str) {
	    char[] chars = str.toCharArray();
	    for (char c : chars) {
	        if ('a' <= c && c <= 'z') {
	            c = (char) (c - 'a' + 'A');
	        }
	    }

	    return new String(chars);
	}
}
