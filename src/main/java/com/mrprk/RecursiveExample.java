package com.mrprk;

import java.util.Arrays;

public class RecursiveExample {
	public static int count = 0;
	public static int[] arr = new int[10];
	public static int max = 10;

	public static void main(String[] args) {
		System.out.println(Arrays.toString(printNos(10)));
	}

	public static int[] printNos(int x) {
		if (count < max) {
			arr[count] = count+1;
			count++;
			printNos(count);
		}
		return arr;
	}
}
