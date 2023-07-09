package com.mrprk.recursive;

// Find out factorial of given number
public class Example4 {
	public static void main(String[] args) {
		System.out.println(findFactorial(5));
	}

	public static int findFactorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * findFactorial(n - 1);
		}
	}

}
