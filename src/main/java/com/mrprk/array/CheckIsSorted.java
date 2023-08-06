package com.mrprk.array;

public class CheckIsSorted {
	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 1 };
		System.out.println(isSorted(arr.length, arr));
	}

	public static int isSorted(int n, int[] arr) {
		for (int i = 0; i < n-1; i++) {
			if (!(arr[i] <= arr[i + 1])) {
				return 0;
			}
		}
		return 1;
	}

}
