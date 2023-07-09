package com.mrprk.recursive;

public class Example7 {
	public static void main(String[] args) {
		System.out.println(findNthFibonacciNum(6));
	}

	public static int findNthFibonacciNum(int n) {
		if (n <= 1) {
			return n;
		} else {
			return findNthFibonacciNum(n - 1) + findNthFibonacciNum(n - 2);
		}
	}
}
