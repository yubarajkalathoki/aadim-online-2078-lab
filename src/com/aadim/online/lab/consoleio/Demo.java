package com.aadim.online.lab.consoleio;

import java.util.*;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input your information:");

		System.out.print("Rol No: ");
//		try {
			int rollNo = Integer.parseInt(sc.nextLine());
			if(rollNo >33 || rollNo<1)
				throw new InvalidRollNoException("The roll number should be greater than 0 and less 34");
			
			System.out.println("Roll No: " + rollNo);
//		} catch (Exception e) {
//			throw new InvalidRollNoException("Tapaile type gareko roll number ko value only 0 to 9 samma ko matrai hunu parchha");
//		}finally {
//			sc.close();
//		}
	}
}
