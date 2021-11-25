package com.aadim.online.lab.sep_2_2021.outer;

import com.aadim.online.lab.sep_2_2021.Base;

public class Demo {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.print();
	}
	
	void print() {
		Base b = new Base();
		System.out.println(b.getId());
//		System.out.println(name);
	}
}
