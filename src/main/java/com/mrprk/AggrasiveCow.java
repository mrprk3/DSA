package com.mrprk;

import java.util.Arrays;

public class AggrasiveCow {
	public static void main(String[] args) {
		int[] arr = { 12,1, 2, 5, 7, 10 };
		Arrays.sort(arr);
		System.out.println();

	}

	public static int findFinalAnswer(int[] arr, int noOfCow) {
		int low = 1;
		int max = arr[arr.length - 1] - low;
		int ans = 0;
		while (low <= max) {
			int mid = (low + max) / 2;
			boolean res = isPossibleToPlace(arr, mid, noOfCow);
			if (res == true) {
				ans = mid;
				low = mid + 1;
			} else {
				max = mid - 1;
			}

		}
		return ans;
	}

	public static boolean isPossibleToPlace(int arr[], int distance, int noOfCow) {
		int countCow = 1;
		int last = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - last >= distance) {
				countCow++;
				last = arr[i];
			}
		}
		if (countCow >= noOfCow) {
			return true;
		}
		return false;
	}
}
