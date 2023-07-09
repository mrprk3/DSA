package com.mrprk;

public class FloorOfNumber {
	public static void main(String[] args) {

		int[] arr = { 1, 4, 6, 9, 12, 14, 15, 18 };

		int res = binarySearchForAscAndDesc(arr, 13);
		System.out.println(res);
	}

	public static int binarySearchForAscAndDesc(int[] arr, int number) {
		int start = 0;
		int end = arr.length - 1;
		int mid = start + end / 2;

		boolean isAccending = arr[0] < arr[arr.length - 1];

		while (start <= end) {
			if (arr[mid] == number) {
				return mid;
			}
			if (isAccending == true) {
				if (arr[mid] < number) {
					start = mid + 1;
				}
				if (arr[mid] > number) {
					end = end - 1;
				}
			}
			if (isAccending == false) {
				if (arr[mid] < number) {
					end = mid - 1;
				}
				if (arr[mid] > number) {
					start = mid + 1;
				}
			}
			mid = (start + end) / 2;
		}

		return arr[end];
	}

}
