package com.mrprk;

public class CountOccourance {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 4, 4, 5, 5, 5, 5, 5, 6 };
		int target = 5;
		System.out.println(countOccourance(arr, target));

	}

	public static int countOccourance(int[] arr, int target) {
		getFirstIndex(arr, target);
		getLastIndex(arr, target);
		return (getLastIndex(arr, target) - (getFirstIndex(arr, target)) + 1);
	}

	public static int getFirstIndex(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				ans = mid;
				end = mid - 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return ans;
	}

	public static int getLastIndex(int[] arr, int target) {
		int res = -1;
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				res = mid;
				start = mid + 1;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return res;
	}

}
