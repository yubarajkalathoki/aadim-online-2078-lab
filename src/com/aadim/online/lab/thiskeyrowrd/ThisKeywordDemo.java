package com.aadim.online.lab.thiskeyrowrd;

/**
 *<code>this</code> keyword.
 *<p>
 *Denotes the instance of the current class. 
 * @author yubaraj
 *
 */
public class ThisKeywordDemo {
	private String name; 
	public void setName(String nameToSet) {
		this.name = nameToSet;
	}
	public String getName() {
		return this.name;
	}
	public void print() {
		ThisExample te = new ThisExample();
		te.paramPass(this);
	}
	public static void main(String[] args) {
		ThisKeywordDemo tkd = new ThisKeywordDemo();
		tkd.setName("Radha Krishanan");
		tkd.print();
	}
}
