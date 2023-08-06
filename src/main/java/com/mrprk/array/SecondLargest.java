package com.mrprk.array;

public class SecondLargest {
	// Find the second largest number from array
	public static void main(String[] args) {
		// int[] arr = { 1, 2, 4,3, 7, 7, 7 };
		int[] arr = { 1, 2, 4, 7, 7, 5 };

		System.out.println(getSecondLargest(arr));
	}

	public static boolean checkSortedOrNot(int[] arr) {
		int start = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (!(start <= arr[i])) {
				return false;
			}
			start = arr[i];
		}
		return true;
	}

	public static int getSecondLargest(int[] arr) {
		int max = arr[0];
		int secondLargest = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondLargest = max;
				max = arr[i];
			} else if (arr[i] < max && secondLargest < arr[i]) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

}
