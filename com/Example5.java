package com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example5 {

	public static List<Person> createPerson() {
		return Arrays.asList( 
			new Person("Vivek", Gender.MALE.getValue(), 25),
			new Person("Vivek", Gender.MALE.getValue(), 25),
			new Person("Testing", Gender.FEMALE.getValue(), 20),
			new Person("Test", Gender.MALE.getValue(), 20),
			new Person("Bob", Gender.MALE.getValue(), 32),
			new Person("Jack", Gender.MALE.getValue(), 72),
			new Person("Jack", Gender.MALE.getValue(), 2),
			new Person("Jill", Gender.MALE.getValue(), 12)
		);
	}
	
	public static void print(int number, Predicate<Integer> predicate, String msg) {
		System.out.println(number+" "+ msg+":"+predicate.test(number));
	}
	
	public static void main(String[] args) {
		Predicate<Integer> isEven = e -> e%2 == 0;
		Predicate<Integer> isGT4 = e -> e > 4;
		
		print(5, isEven, "is even?");
		print(4, isEven, "is even?");
		
		print(4, isGT4, "is GT4?");
		
		print(10, isEven.and(isGT4), "Both Check");
	}
	
}
