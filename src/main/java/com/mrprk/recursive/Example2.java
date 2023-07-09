package com.mrprk.recursive;

// using recursive print n to 1
public class Example2 {
	public static void main(String[] args) {
		printN2One(5);
	}

	public static void printN2One(int n) {
		if (n == 0) {
			return;
		} else {
			System.out.println(n);
			n--;
			printN2One(n);
		}
	}

}
