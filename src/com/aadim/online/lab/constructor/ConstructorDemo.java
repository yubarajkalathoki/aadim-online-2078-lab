package com.aadim.online.lab.constructor;

/**
 * Constructor is a kind of method in a Java class which name is same as Class
 * Name and does not have a return type.
 * <p>
 * 
 * Java compiler provides a Default Constructor. But, when we define a
 * parameterize constructor then compiler does not provide a default
 * constructor. If we need the default constructor then we have to create/define
 * it manually
 * <p>
 * 
 * There are two types of Constructor in Java. These are:
 * <p>
 * <ul>
 * Default Constructor (No argument)
 * </ul>
 * <ul>
 * Parameterize Constructor (With Argument)
 * </ul>
 * <p>
 * We can use default constructor when we have to initialize a default object.
 * <p>
 * We can use parameterize constructor when we have to initialize an object
 * along with specific value of the instance variable.
 * 
 * 
 * @author yubaraj
 *
 */
public class ConstructorDemo {
	String name ;

	ConstructorDemo() {
	}

	ConstructorDemo(String nameToPass) {
		this.name = nameToPass;
	}

	void print() {
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo("Milan Parajuli");
		cd.print();
		ConstructorDemo cd1 = new ConstructorDemo();
		cd1.print();
	}
}
