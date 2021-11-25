package unit11;

import javax.swing.JFrame;
import javax.swing.JLabel;

// IDE -> Integrated Development Environment
public class HelloWorldDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello from Swing");
		frame.setSize(500, 500);
//		frame.setTitle("Hello from Swing");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(null);
		
		JLabel helloLebel = new JLabel("Hello World!");
		
		helloLebel.setBounds(50, 50, 80, 50);
		frame.add(helloLebel);
		
		frame.setVisible(true);
	}
}
