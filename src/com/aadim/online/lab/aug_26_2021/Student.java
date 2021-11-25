package com.aadim.online.lab.aug_26_2021;

/**
 * Encapsulation is a process of hiding the data member / properties / variables
 * of an object and allowing the access only from publicly exposed methods.
 * 
 * @author yubaraj
 */
public class Student extends Admission{
	private int rollNo;
	private String name = "Coder Sathi";
	private char gender;
	private double remainingFee;
	private boolean topper;

	public Student(boolean t) {
		this.topper = t;
	}

	public double getRemainingFee() {
		if (topper) {
			this.remainingFee = super.totalFee - 99;
		}else
			this.remainingFee = super.totalFee;
		return this.remainingFee;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
