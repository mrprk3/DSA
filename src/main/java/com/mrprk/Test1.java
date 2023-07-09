package com.mrprk;

public class Test1 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

		int res = findIndex(arr, 13);
		System.out.println(res);
	}

	public static int findIndex(int[] arr, int target) {
		int start = 0;
		int end = 1;
		int res = 0;
		for (int i = 0; i < 3; i++) {
			res = findIndexByBinarySearch(arr, target, start, end);
			start = end + 1;
			end = (start * 2) + 1;
		}
		return res;

	}

	public static int findIndexByBinarySearch(int[] arr, int target, int start, int end) {
		// int start = 0;
		// int end = arr.length - 1;
		int mid = (start + end) / 2;
		while (start <= end) {
			if (target == arr[mid]) {
				return mid;
			}
			if (target > arr[mid]) {
				start = mid + 1;
			}
			if (target < arr[mid]) {
				end = mid - 1;
			}
			mid = (start + end) / 2;
		}
		return -1;

	}

}
