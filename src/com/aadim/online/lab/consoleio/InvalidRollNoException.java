package com.aadim.online.lab.consoleio;

import java.io.Serializable;

public class InvalidRollNoException  extends RuntimeException implements Serializable{
	String message;

	public InvalidRollNoException(String message) {
		super(message);
	}
}
