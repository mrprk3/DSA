package com.mrprk;

public class KokoEatBananaLeetcode {
	public static void main(String[] args) {
		int[] arr = { 3, 6, 7, 11 };
		System.out.println(minimumRateToEatBananas(arr, 5));
	}

	public static int findMax(int[] v) {
		int maxi = Integer.MIN_VALUE;
		;
		int n = v.length;
		for (int i = 0; i < n; i++) {
			maxi = Math.max(maxi, v[i]);
		}
		return maxi;
	}

	public static int calculateTotalHours(int[] v, int hourly) {
		int totalH = 0;
		int n = v.length;
		// find total hours:
		for (int i = 0; i < n; i++) {
			totalH += Math.ceil((double) (v[i]) / (double) (hourly));
		}
		return totalH;
	}

	public static int minimumRateToEatBananas(int[] v, int h) {
		int low = 1, high = findMax(v);
		while (low <= high) {
			int mid = (low + high) / 2;
			int totalH = calculateTotalHours(v, mid);
			if (totalH <= h) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

}
