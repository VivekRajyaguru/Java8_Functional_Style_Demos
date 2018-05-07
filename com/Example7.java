package com;

import java.util.Arrays;
import java.util.List;

public class Example7 {
	
	public static int doubleIt(int number) {
		System.out.println(number+" :"+ Thread.currentThread());
		return number*2;
	}
	 
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		/*System.out.println(
				numbers.stream()
					   .map(Example7::doubleIt)
					   .reduce(0, Integer::sum)
		);*/
		
		System.out.println(
				numbers.parallelStream()
					   .map(Example7::doubleIt)
					   .reduce(0, Integer::sum)
		); 
	}

}
