package com.aadim.online.lab.fileiolab;

import java.io.*;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("C:/Users/yubaraj/Desktop/aadim-lab/milandaju.txt");
			String textValue = "Milan daju ko passowrd is: radhakrishnan.";
			byte[] bArray = textValue.getBytes();
			fout.write(bArray);
			fout.close();
			System.out.println("File created successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fout != null)
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
