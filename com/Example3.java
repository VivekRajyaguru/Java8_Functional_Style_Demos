package com;


interface InterFace1 {
	default void Show() { System.out.println("Show");};
	default void Print() { System.out.println("Print"); overRide();};
	int overRide();
	
}

interface Interface2 extends InterFace1 {
	default void Print() {System.out.println("Child Print");}
}

class DemoInterface extends Vehicle implements Interface2, Sail {
	public void Print() {
		Sail.super.Print();
	}
	@Override
	public int overRide() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

interface Sail {
	default void Print() { System.out.println("Sail Print");}
}

class Vehicle {
	/*public void Print() {
		System.out.println("Vehicle Print");
	}*/
}
// Rules
// 1. you get what is in base interface
// 2. can override Default Method
// 3. if method is there in class heirachy then it take precedence
//4. If there is not method on any class heirachy but two of your interface that implements has default method to solve this use rule 3

//Default Methods from Interface
public class Example3 {
	public void use() {
		DemoInterface demo = new DemoInterface();
		demo.Print();
	}
	public static void main(String[] args) {
		new Example3().use();
	}
	
}
