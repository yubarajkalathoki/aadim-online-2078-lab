package com.aadim.online.lab.accesscontrol;
/**
 * Access Control: <p>
 * To control Data member or methods or constructor or inner class. 
 * <p>
 * There are 4 (four) types of access control. These are:<p>
 * <ul>private</ul>
 * <ul>default</ul>
 * <ul>protected</ul>
 * <ul>public</ul><p>
 * 
 * <code> Default</code>: is the access control where no other keywords are defined. 
 * 
 * @author yubaraj
 *
 */
public class Demo {
	private String name ="Radha Krishnan"; // access control is private
	String address = "Chennai"; // Default access control
	protected int id = 10; // Protected
	public String country = "India"; // Public
	
	public void accessPrivateVariable() {
		name = "Hari Prasad Chaurasia";
	}
	
	public void accessDafaultVariable() {
		address = "Utter Pradesh";
	}
	
	public void accessProtectedVariable() {
		id = 1;
	}
	
	public void accessPublicVariable() {
		country = "Napal";
	}
	
	
}
