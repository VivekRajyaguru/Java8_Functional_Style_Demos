package com;

import java.util.HashMap;
import java.util.Map;

public class Example6 {

	public static double compute(int number) {
		return Math.sqrt(number);
	}
	
	
	public static void main(String[] args) {
		Map<Integer, Double> sqrt = new HashMap<>();
		
		sqrt.computeIfAbsent(4, Example6::compute);
		sqrt.computeIfAbsent(2, Example6::compute);
	//	sqrt.computeIfPresent(2, Example6::noDemo);
		//sqrt.merge(4, sqrt.computeIfAbsent(4, Example6::compute), Example6::compute);
		
		System.out.println(sqrt.get(4));
	}
	
}
