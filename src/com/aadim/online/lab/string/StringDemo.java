package com.aadim.online.lab.string;

public class StringDemo {
	public static void main(String[] args) {
		final String name = "Milan";
		
//		name = "Parajuli";
		
		String name1 = " milan ";
		
		System.out.println("The length is: "+name1.length());
		
		String trimed = name.trim();
		System.out.println("The length is : "+trimed.length());
		
		String upperCase = name.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = name.toLowerCase();
		System.out.println(lowerCase);
		
		boolean equal = name.equalsIgnoreCase(name1);
		System.out.println(equal);
		
//		A, B
	}
	
	public final synchronized void print() {
		
	}
}
//interface A extends B, C, D, E, F, G

//toUpperCase

class A extends StringDemo{
//	public void print() {
//		
//	}
}