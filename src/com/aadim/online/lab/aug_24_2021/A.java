package com.aadim.online.lab.aug_24_2021;

public class A {


	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.getRollNo(2));
		System.out.println(a.getRollNo());
		
	}
	
	// identifier -> name
	// variable, class, method
	// 		1. case sensitive
	// 		2. no duplicate allowed
	
	// Method overloading / function overloading
	
	// same name method, same class but parameters/arguments different
	private int getRollNo(int a) {
		return 2*a;
	}
	
	public int getRollNo() {
		return 2;
	}
	
}
