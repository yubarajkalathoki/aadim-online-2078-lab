package com.aadim.online.lab.sep_2_2021.outer;

import com.aadim.online.lab.sep_2_2021.Base;

public class Derived extends Base {
	public static void main(String[] args) {
		Derived d = new Derived();
		d.print();
	}
	
	void print() {
		System.out.println(getId());
//		System.out.println(name);
	}
}
