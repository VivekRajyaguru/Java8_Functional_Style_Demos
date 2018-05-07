package com;

interface Util {
	public static int number() {
		return Runtime.getRuntime().availableProcessors();
	}
}

// static Method Use from Interface

public class Example2 {
	
	public static void main(String[] args) {
		System.out.println(Util.number());
	}

}
