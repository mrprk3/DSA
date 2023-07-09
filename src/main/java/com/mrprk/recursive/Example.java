package com.mrprk.recursive;

// sum of n number using recursion
public class Example {
	public static int sum = 0;

	public static void main(String[] args) {
		int functionForSum = functionForSum(3);
		System.out.println(functionForSum);
	}

	public static int functionForSum(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n + functionForSum(n - 1);
		}
	}

	public static void function(int n) {
		if (n == 0) {
			System.out.println(sum);
			return;
		} else {
			sum = sum + n;
			n--;
			function(n);
		}
	}

}
