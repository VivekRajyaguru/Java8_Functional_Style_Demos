package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;


public class Example4 {

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
	
	public static void printSorted(List<Person> people, Comparator<Person> comparator) {
		people.stream()
			  .sorted(comparator)
			  .forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		List<Person> people = createPerson();
		// printSorted(people, comparing(Person::getName));
		// printSorted(people, comparing(Person::getAge));
		// printSorted(people, comparing(Person::getAge).thenComparing(Person::getName).reversed());
		
		System.out.println(
				people.stream()
					  .collect(groupingBy(Person::getAge, mapping(Person::getName, toList())))
					  
		);
	}
	
}
