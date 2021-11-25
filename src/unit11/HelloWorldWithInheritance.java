package unit11;

import javax.swing.JFrame;

public class HelloWorldWithInheritance extends JFrame{
	
	/**
	 * Default constructor
	 */
	public HelloWorldWithInheritance() {
		
	}
	
	void addComponent() {
		setSize(400, 400);
		setTitle("Inheritance Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		HelloWorldWithInheritance obj = new HelloWorldWithInheritance();
		obj.addComponent();
	}
}
