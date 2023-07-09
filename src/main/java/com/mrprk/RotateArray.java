package com.mrprk;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr = { 1 };
		System.out.println(searchInRotateArray(arr, 0));

	}

	public static int searchInRotateArray(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] >= arr[start]) {
				if (target >= arr[start] && arr[mid] >= target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target >= arr[mid] && target <= arr[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}

	public static int findIndexInRotateArray(int[] arr, int k) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == k) {
				return mid;
			}
			if (arr[low] <= arr[mid]) {
				if (arr[low] <= k && k <= arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (arr[mid] <= k && k <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}

}
