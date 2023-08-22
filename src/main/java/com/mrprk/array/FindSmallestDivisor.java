package com.mrprk.array;

public class FindSmallestDivisor {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 9 };

		System.out.println(findSmallestDivisior(arr, 7));
	}

	public static int findSmallestDivisior(int[] arr, int threshold) {
		int ans = 0;
		int low = 1;
		int high = findMinMax(arr);
		while (low <= high) {
			int mid = (low + high) / 2;
			double res = sumByDay(arr, mid);
			if (res <= threshold) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static double sumByDay(int[] arr, int mid) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += Math.ceil((double) arr[i] / (double) mid);
		}
		return sum;
	}

	public static int findMinMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = Math.max(max, arr[i]);
			}
		}
		return max;
	}

}
