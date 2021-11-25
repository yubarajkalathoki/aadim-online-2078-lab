package com.aadim.online.lab.sep_2_2021;

public class Base {
	private int id = 1;
	private String name = "Deepak";
	
	public static void main(String[] args) {
		Base b = new Base();
		b.print();
	}
	
	void print() {
		System.out.println(getId());
		System.out.println(name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
