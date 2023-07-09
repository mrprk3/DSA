package com.mrprk;

public class Test11 {
	public static void main(String[] args) {
		int arr[] = { 3, 5, 7, 9, 10,11, 90, 100, 130, 140, 160, 170 };
		int target =90;

		int res = findIndex(arr, target);
		System.out.println(res);

	}

	public static int findIndex(int[] arr, int target) {
		int start = 0;
		int end = 1;
		while (target > arr[end]) {
			int temp = end + 1;
			end = end + (end - start + 1) * 2;
			start = temp;
		}
		return findIndexByBinarySearch(arr, target, start, end);

	}

	public static int findIndexByBinarySearch(int[] arr, int target, int start, int end) {
		while (start <= end) {
			int mid = (start + end) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			}
			if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;

	}

}
