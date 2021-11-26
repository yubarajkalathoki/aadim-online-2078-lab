package com.aadim.online.lab.swing;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class GridLayoutDemo {
	public GridLayoutDemo() {
		JFrame frame = new JFrame("GridLayoutDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLayout(new GridLayout(3, 2));
		frame.add(new Button("1"));
		frame.add(new Button("2"));
		frame.add(new Button("3"));
		frame.add(new Button("4"));
		frame.add(new Button("5"));
		frame.add(new Button("6"));
		frame.add(new Button("7"));

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutDemo();
	}
}
