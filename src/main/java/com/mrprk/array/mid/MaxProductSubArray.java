package com.mrprk.array.mid;

public class MaxProductSubArray {
	public static void main(String[] args) {
		int[] arr = { 2,3,-2,4 };
		System.out.println(maxProduct(arr));
	}

	// Brute force approach
	public static int maxProductSubArray(int[] arr) {
		int res = -2147483648;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int product = 1;
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + " ");
					product = product * arr[k];
				}
				res = Math.max(res, product);
			}
		}
		return res;
	}

	// Better force approach
	public static int maxProductBetter(int[] arr) {
		int res = -2147483648;
		for (int i = 0; i < arr.length; i++) {
			int product = 1;
			for (int j = i; j < arr.length; j++) {
				product = product * arr[j];
				res = Math.max(res, product);
			}
		}
		return res;
	}

	// Optimal force approach
	public static int maxProduct(int[] arr) {
		int n = arr.length;
		int leftProduct = 1;
		int rightProduct = 1;
		int ans = arr[0];
		for (int i = 0; i < arr.length; i++) {
			leftProduct = leftProduct * arr[i];
			if (leftProduct == 0) {
				leftProduct = 1;
			}
			rightProduct = rightProduct * arr[n - 1 - i];
			if (rightProduct == 0) {
				rightProduct = 1;
			}
			ans = Math.max(ans, Math.max(leftProduct, rightProduct));
		}
		if (ans == 1) {
			ans = 0;
		}
		return ans;
	}

}
