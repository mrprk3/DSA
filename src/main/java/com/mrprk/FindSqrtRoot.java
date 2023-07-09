package com.mrprk;

public class FindSqrtRoot {
	public static void main(String[] args) {
		System.out.println(findSqrtRoot(2147483647));
//		Long x = (long) (2147483647+1);
//		System.out.println(x);

	}

	public static int findSqrtRoot(int num) {
		int start = 1;
		int end = num;
		int ans = 0;
		while (start <= end) {
			long mid = (start + end) / 2;
			long value = mid * mid;
			if (value <= num) {
				ans = (int) mid;
				start = (int) (mid + 1);
			} else {
				end = (int) (mid - 1);
			}
		}
		return ans;
	}

}
