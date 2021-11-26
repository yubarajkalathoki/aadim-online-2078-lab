package com.aadim.online.lab.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginController implements ActionListener {

	JTextField usernameField;
	JPasswordField passwordField;

	public LoginController(JTextField un, JPasswordField pw) {
		this.usernameField = un;
		this.passwordField = pw;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String username = usernameField.getText();
		String password = passwordField.getText();

		if (username.length() <= 5)
			JOptionPane.showMessageDialog(null, "Username length should be greater than 5", "Warning!",
					JOptionPane.ERROR_MESSAGE);
		else {
			JOptionPane.showMessageDialog(null,
					"Your username and password is " + username + " and " + password + " respectively.");
		}

	}
}