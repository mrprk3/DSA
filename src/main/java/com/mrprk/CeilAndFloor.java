package com.mrprk;

import java.util.Arrays;

public class CeilAndFloor {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 8, 8, 10 };
		// int[] result = getResult(arr, 5, 30);
		System.out.println(searchFirstIndex(arr, 8));
		System.out.println(searchLastIndex(arr, 8));

	}

	public static int searchLastIndex(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				ans = mid;
				start = mid + 1;
			} else if (nums[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return ans;
	}

	public static int searchFirstIndex(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				ans = mid;
				end = mid - 1;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return ans;
	}

	public static int[] getResult(int[] arr, int n, int x) {
		int[] res = { -1, -1 };
		res[0] = getFloor(arr, n, x);
		res[1] = getCeil(arr, n, x);
		return res;

	}

	public static int getFloor(int[] arr, int n, int x) {
		int start = 0;
		int end = n - 1;
		int ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] <= x) {
				ans = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return ans;
	}

	public static int getCeil(int[] arr, int n, int x) {
		int start = 0;
		int end = n - 1;
		int ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] >= x) {
				ans = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return ans;
	}

}
