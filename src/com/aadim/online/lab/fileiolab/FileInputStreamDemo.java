package com.aadim.online.lab.fileiolab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) 
			throws IOException, FileNotFoundException {
		FileInputStream fin = new FileInputStream("C:/Users/yubaraj/Desktop/aadim-lab/milandaju.txt");
		int i =0;
		while((i=fin.read()) != -1) {
			char c = (char)i;
			System.out.print(c);
		}
		fin.close();
	}
}
