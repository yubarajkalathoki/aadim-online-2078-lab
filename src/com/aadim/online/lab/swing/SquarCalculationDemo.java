package com.aadim.online.lab.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SquarCalculationDemo {
	
	public SquarCalculationDemo() {
		JFrame frame = new JFrame();

		frame.setSize(400, 400);
		frame.setTitle("Square Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(null);
		
		JLabel label1 = new JLabel("Enter any number:");
		label1.setBounds(50, 50, 150, 20);
		frame.add(label1);
		
		JTextField inputField = new JTextField();
		inputField.setBounds(250, 50, 500, 20);
		frame.add(inputField);
		
		JButton calculateButton = new JButton("Calculate Square");
		calculateButton.setBounds(90, 100, 200, 20);
		frame.add(calculateButton);
		
		JLabel label2 = new JLabel("Square of entered number:");
		label2.setBounds(50, 150, 250, 20);
		frame.add(label2);
		
		JTextField outputField = new JTextField();
		outputField.setBounds(250, 150, 500, 20);
		frame.add(outputField);
		
		// design part completed
		// Now, business logic to calculate square starts
		
		calculateButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// read the input text field
				String inputTextValue = inputField.getText();
				// converting string to int
				long inputValue = Long.parseLong(inputTextValue);
				// squaring
				long  square = inputValue * inputValue;
				// adding square value to output text field
				
				outputField.setText(String.valueOf(square));
				
//				152415765279684
//				15241578750190521
			}
		});
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SquarCalculationDemo();
	}
}
