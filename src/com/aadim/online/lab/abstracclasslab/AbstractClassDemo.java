package com.aadim.online.lab.abstracclasslab;

public class AbstractClassDemo {
	public static void main(String[] args) {
		TU aadim = new AadimCollege();
		aadim.teachBCA();

		TU pmc = new PMC();
		pmc.teachBCA();
		
		TU ascol = new ASCOL();
		ascol.teachCSIT();

//		RB gbime = new GBIME();
//		System.out.println("The home loan interest rate of GBIMe is: " + gbime.getHomeLoan());

	}
}

abstract class RB {
	double getBaseRate() {
		return 5;
	}

	abstract double getHomeLoan();
}

class GBIME extends RB {

	double getHomeLoan() {
		return 2.25 + super.getBaseRate();
	}
}

class SC extends RB {

	double getHomeLoan() {
		return 2.5 + super.getBaseRate();
	}
}