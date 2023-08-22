package com.mrprk.array.mid;

public class SQRT {
	public static void main(String[] args) {
		System.out.println(findSqrt(100));
	}

	public static int findSqrt(int n) {
		int low = 0;
		int high = n;
		int ans = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (mid * mid > n) {
				high = mid - 1;
			}
			if (mid * mid <= n) {
				ans = mid;
				low = mid + 1;
			}
		}
		return ans;
	}

}
