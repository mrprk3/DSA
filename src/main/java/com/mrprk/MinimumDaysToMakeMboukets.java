package com.mrprk;

public class MinimumDaysToMakeMboukets {
	public static void main(String[] args) {
		int[] arr = { 7, 7, 7, 7, 7, 7, 13, 11, 12, 7 };
		System.out.println(findMainAnswer(arr, 3, 2));
	}

	public static int findMainAnswer(int[] arr, int m, int k) {
		int result = -1;
		int[] findMinMax = findMinMax(arr);
		int low = findMinMax[0];
		int high = findMinMax[1];
		while (low <= high) {
			int mid = (low + high) / 2;
			boolean res = isPossibleOrNot(arr, mid, m, k);
			if (res) {
				result = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}
		return result;
	}

	public static boolean isPossibleOrNot(int[] arr, int day, int m, int k) {
		int n = arr.length;
		int count = 0;
		int noOfB = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] <= day) {
				count = count + 1;
			} else {
				noOfB = noOfB + (count / k);
				count = 0;
			}
		}
		noOfB = noOfB + (count / k);
		if (m <= noOfB) {
			return true;
		} else {
			return false;
		}
	}

	public static int[] findMinMax(int[] arr) {
		int[] minMax = new int[2];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = Math.max(max, arr[i]);
			}
			if (arr[i] < min) {
				min = Math.min(min, arr[i]);
			}
		}
		minMax[0] = min;
		minMax[1] = max;
		return minMax;
	}
}
