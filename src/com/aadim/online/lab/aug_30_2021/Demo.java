package com.aadim.online.lab.aug_30_2021;

public class Demo {
	public static void main(String[] args) {
		Demo d = new Demo();
//		d.print();
		
		System.out.print("-");
		//\u000d System.out.print("Hello");
		System.out.print("-");
		
		
		
		System.out.println(\u000d);
	}
}// demo class body finishes from here

/**
 * An abstract class is a class which is declared along with abstract keyword and has abstract method.
 */
abstract class A {
	// Non abstract method
	void print() {
		System.out.println("Printing from A");
	}
	
	// abstract method
	abstract void sayHi();
}
