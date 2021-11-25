package com.aadim.online.lab.accesscontrol;

public class AccessControlDemo  {
//	public void accessPrivateVariable() {
//		Demo demo = new Demo();
//		demo.name = "Hari Prasad Chaurasia";
//	}
	
	public void accessDafaultVariable() {
		Demo demo = new Demo();
		demo.address = "Utter Pradesh";
	}
	
	public void accessProtectedVariable() {
		Demo demo = new Demo();
		demo.id = 1;
	}
	
	public void accessPublicVariable() {
		Demo demo = new Demo();
		demo.country = "Napal";
	}
}
