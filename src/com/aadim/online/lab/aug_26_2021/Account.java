package com.aadim.online.lab.aug_26_2021;

public class Account {
	public static void main(String[] args) {
		Student radha = new Student(false);
		radha.setName("Radhika");
		System.out.println("The total remaining fee of "+radha.getName()+" is: "+radha.getRemainingFee());
		
		Student krishnan = new Student(true);
		System.out.println("The total remaining fee of "+krishnan.getName()+" is: "+krishnan.getRemainingFee());;
	}
}
