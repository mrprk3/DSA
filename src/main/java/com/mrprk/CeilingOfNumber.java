package com.mrprk;

public class CeilingOfNumber {
	public static void main(String[] args) {
		int[] arr = { 9, 12, 14 };

		int res = binarySearchForAscAndDesc(arr, 10);
		System.out.println(res);

	}

	public static int binarySearchForAscAndDesc(int[] arr, int number) {
		int start = 0;
		int end = arr.length - 1;
		int mid = start + end / 2;
		// int[] arr = { 9, 12, 14, 17 }; // search num is 13
		while (start <= end) {
			if (arr[mid] == number) {
				return mid;
			}

			if (arr[mid] < number) {
				start = mid + 1;
			}
			if (arr[mid] > number) {
				end = end - 1;
			}
			mid = (start + end) / 2;
		}

		return arr[start];
	}

}
