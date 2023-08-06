package com.mrprk.array;

public class FindMissingNumber {
	public static void main(String[] args) {
		int[] arr = { 3, 0, 1 };
		  int expected = (arr.length) * (arr.length+1)/2;

		System.out.println(expected);
	}

	public static int findMissingFunctionOne(int[] nums) {
		int n = nums.length;
		int expected = 0;
		int actual = 0;
		for (int i = 1; i <= n; i++) {
			expected = expected + i;
		}
		for (int i = 0; i < nums.length; i++) {
			actual = actual + nums[i];
		}
		return expected - actual;
	}

}
