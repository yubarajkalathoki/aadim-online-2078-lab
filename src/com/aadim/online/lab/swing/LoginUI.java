package com.aadim.online.lab.swing;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginUI {
	public LoginUI() {
		JFrame frame = new JFrame();

		frame.setSize(400, 400);
		frame.setTitle("Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(null);

		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setBounds(50, 50, 80, 20);
		frame.add(usernameLabel);

		JTextField usernameField = new JTextField();
		usernameField.setToolTipText("Enter your username");
		usernameField.setBounds(150, 50, 100, 20);
		frame.add(usernameField);

		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(50, 80, 80, 20);
		frame.add(passwordLabel);

		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(150, 80, 100, 20);
		frame.add(passwordField);

		JButton loginButton = new JButton("Login");
		loginButton.setToolTipText("Click to login");
		loginButton.setBounds(150, 120, 100, 20);
		frame.add(loginButton);

		loginButton.addActionListener(new LoginController(usernameField, passwordField));

		frame.setVisible(true);
	}
}
