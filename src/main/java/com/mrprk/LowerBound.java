package com.mrprk;

public class LowerBound {
	public static void main(String[] args) {
		int[] arr = { 1,2,8,10,11,12,19 };
		int res = findFloor(arr, 7, 5);
		System.out.println(res);

	}

	public static int findFloor(int arr[], int n, long x) {
		int start = 0;
		int end = n - 1;
		int ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] < x) {
				ans = mid;
				end = mid - 1;
			} else {
				end = mid - 1;
			}
		}
		return ans;
	}

	public static int checkLowerBound(int[] arr, int n) {
		int start = 0;
		int end = arr.length - 1;
		int ans = 0;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] >= n) {
				ans = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}
}
