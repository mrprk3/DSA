package com.mrprk;

public class MinimumNumberRotateArray {
	public static void main(String[] args) {
		int[] arr = { 11,13,15,17};
		System.out.println(getMinNumber(arr));
	}

	public static int findMin(int value1, int value2) {
		if (value1 > value2) {
			return value2;
		}
		return value1;

	}

	public static int getMinNumber(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int ans = 2147483647;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[start] <= arr[mid]) {
				int temp = arr[start];
				ans = findMin(ans, arr[start]);
				start = mid + 1;
			} else {
				if (arr[mid] < arr[end]) {
					ans = findMin(ans, arr[mid]);
					end = mid - 1;
				}
			}
		}
		return ans;

	}

}
