package com.aadim.online.lab.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BorderLayoutDemo {
	public static void main(String[] args) {
		new BorderLayoutDemo();
	}
	
	public BorderLayoutDemo() {
		JFrame frame = new JFrame();

		frame.setSize(400, 400);
		frame.setTitle("Border Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new BorderLayout());
		
		frame.add(new JButton("1"), BorderLayout.NORTH);
		frame.add(new JButton("2 ghjkl;' gfhjkl;'"
				+ " ghjkl;"), BorderLayout.WEST);
		frame.add(new JButton("3"), BorderLayout.CENTER);
		frame.add(new JButton("4 fdghjkl; dfghjkl;"), BorderLayout.EAST);
		JButton button5 = new JButton("5");
//		button5.setSize(20, 200);
		frame.add(button5, BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}
}
