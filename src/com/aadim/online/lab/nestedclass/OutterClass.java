package com.aadim.online.lab.nestedclass;

public class OutterClass {

	String name = "I am outer Class";

	void print() {
		InnerClass ic = new InnerClass();
		ic.setName(name);
		ic.print();
	}

	class InnerClass {

		String name = "I am inner Class";

		void setName(String name) {
			this.name = name;
		}
		void print() {
			System.out.println(this.name);
		}
	}
}
