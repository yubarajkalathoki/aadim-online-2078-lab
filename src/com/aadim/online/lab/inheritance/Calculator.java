package com.aadim.online.lab.inheritance;
/**
 * The main uses of Inheritance is Code Reuse.
 * 
 * 
 * @author yubaraj
 *
 */
public class Calculator {
	public static void main(String[] args) {
//		BasicCalculator bc = new BasicCalculator();
//		bc.doSum(5, 10);
		
		ScientificCalculator sc = new ScientificCalculator();
		sc.doSum(5, 2);
		
		sc.sinValue();
	}
}
	