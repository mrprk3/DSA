package com.mrprk;

public class NthRoot {
	public static void main(String[] args) {
		System.out.println(findNthRoot(125, 3));
	}

	public static int findNthRoot(int num, int n) {
		int low = 0;
		int high = num;
		while (low <= high) {
			int mid = (low + high) / 2;
			int res = calculateRoot(mid, n);
			if (res == num) {
				return mid;
			}
			if (res > num) {
				high = mid - 1;
			}
			if (res < num) {
				low = mid + 1;
			}
		}
		return -1;
	}

	private static int calculateRoot(int mid, int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res = res * mid;
		}
		return res;

	}

}
