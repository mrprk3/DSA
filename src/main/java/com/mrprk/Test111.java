package com.mrprk;

public class Test111 {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 7 };
		System.out.println(getNumUnique(arr));

	}

	public static int getNumUnique(int[] arr) {
		for (int i = 0; i < arr.length; i = i + 2) {
			if (arr[i] != arr[i + 1]) {
				return arr[i];
			}
		}
		return -1;
	}

}
