package com.mrprk;

public class PrintNameNTimes {
	public static int i = 0;

	public static void main(String[] args) {
		printName(1, 5);
	}

	public static void printName(int i, int n) {
		if (i > n) {
			return;
		} else {
			System.out.println("Atim");
			i++;
			printName(i, n);
		}
	}
}
