package com.aadim.online.lab.methodthatreturnsvalue;

public class MethodReturnDemo {
	public static void main(String[] args) {
		
		MethodReturnDemo mrd = new MethodReturnDemo();
		
		System.out.println(mrd.returnCollegeName());
	}

	String returnCollegeName() {
		return "Aadim College";
	}
}
