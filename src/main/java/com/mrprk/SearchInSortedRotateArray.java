package com.mrprk;

public class SearchInSortedRotateArray {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };

		// int ans = searchElementInMountainArray(arr);
		// System.out.println(ans);
		isPlaindrome(121);

	}

	public static boolean isPlaindrome(int num) {
		int temp = 0;
		int rev = 0;
		int newNum = num;
		int rem = 0;
		if (num >= 0) {
			while (num != 0) {
				rem = num % 10;
				num = num / 10;
			}

		}
		return false;
	}

	public static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				return mid;
			}

			if (arr[mid] > target) {
				end = mid - 1;
			}
			if (arr[mid] < target) {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static int searchElementInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = (start + end) / 2;
			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return end;
	}
}
