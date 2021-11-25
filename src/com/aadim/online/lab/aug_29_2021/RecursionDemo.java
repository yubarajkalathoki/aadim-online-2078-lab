package com.aadim.online.lab.aug_29_2021;

public class RecursionDemo {
	public static void main(String[] args) {
		RecursionDemo rd = new RecursionDemo();
//		rd.milan();
		int count = 100;

		for (int i = 0; i < count; i++) {
			int fibonacci = rd.fibonacci(i);
			if (fibonacci > count)
				break;

			System.out.println(fibonacci);
//			System.out.println("i=" + i);
		}

	}

	int fibonacci(int i) {
//		return fibonacci(i - 1) + fibonacci(i - 2);
		if (i <= 1) // base case/point
			return i;
		else {
			return fibonacci(i - 1) + fibonacci(i - 2);
		}

	}

// To print the fibonacci numbers which are less than 100
	public void milan() {
		int n1 = 0, n2 = 1, fibonacci = 0, i, count = 100;
		System.out.println(n1 + " " + n2);

		// ++i;
		// inc/add + existing value = assignment

		// i=i+1;

		// i++
		// assignment and inc

		for (i = 2; fibonacci < count; i++) {
			fibonacci = n1 + n2;
			if (fibonacci > 100)
				break;
			System.out.println(fibonacci);
			n1 = n2;
			n2 = fibonacci;
		}
	}
}
