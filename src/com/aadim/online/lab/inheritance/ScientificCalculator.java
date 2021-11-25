package com.aadim.online.lab.inheritance;

public class ScientificCalculator extends BasicCalculator {
	
	void doSum(int a, int b) {
		System.out.println("The sum of "+ a+" and "+b+" is "+ (a+b+1));
	}
	
	void sinValue() {
		System.out.println("The Parent value is " + a);
	}
}
