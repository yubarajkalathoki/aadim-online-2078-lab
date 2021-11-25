package com.aadim.online.lab.abstracclasslab;

public interface TU {

//	public static final int rollNo=5;
	int rollNo = 5;

//	public void sayHello() {
//		System.out.println("Hello!");
//	}

	void teachBCA();

	public void teachCSIT();

	default int getRoll() {
		return rollNo;
	}

	/**
	 * It returns the marks of all the students in ascending order by their roll
	 * number.
	 */
	public int[] getInternalMarks();
}
