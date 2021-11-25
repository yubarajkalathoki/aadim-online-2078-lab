package com.aadim.online.lab.sep_12_2021;

public class StringDemo {
	public static void main(String[] args) {
//		basicExample();
		
		concatExample();
		
	}
/**
 * String is immutable
 */
	private static void concatExample() {
		// Radha
		// Krishnan
		// concat
		// Radha Krishnan
		
		String firstName = " Radha ";
		String lastName = "Krishnan";
		
//		String fullName = firstName + lastName;
//		System.out.println(fullName);
		
		String newVar = firstName.concat("1");
		System.out.println(firstName);
		System.out.println(newVar);
		
		
		firstName = firstName.toLowerCase(); // radha
		System.out.println("After using lower case");
		System.out.println(firstName.toLowerCase());
		
		
//		StringBuffer
//		StringBuilder
		
	}

	private static void basicExample() {
		String name;

		name = "Radhe";

//		name = new String("Radhe");

		// immutable/mutable

//		immutable -> unchangeable
//		mutable -> changeable

		String rollNo = "12B";
		try {
			int roll = Integer.parseInt(rollNo);
			System.out.println("Roll is :" + roll);
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
//			System.out.println(nfe.getMessage());
//			System.out.println("String "+rollNo+" can not converted to int");
		}
		
		int roll = 16;
		
		String rn = String.valueOf(roll);
		System.out.println(rn);
	}
}
