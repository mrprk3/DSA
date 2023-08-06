package com.mrprk.array.mid;

public class MaximumSubArray {
	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println(findMaxSubArray(arr));
	}

	public static int findMaxSubArrayBruteForce(int[] arr) {
		int sum = 0;
		int maxSum = -10000;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				for (int k = i; k <= j; k++) {
					sum = sum + arr[k];
					System.out.print(arr[k] + " ");
				}
				System.out.print("sum :" + sum);
				if (sum > maxSum) {
					maxSum = sum;
				}
				sum = 0;
				System.out.println();
			}
		}
		System.out.println("Answer is : " + maxSum);
		return maxSum;
	}

	public static int findMaxSubArray(int[] arr) {
		int maximum = arr[0];
		int sum = 0;
		int endIndex = -1;
		int startIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum > maximum) {
				endIndex = i;
				maximum = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		System.out.println(startIndex + "  " + endIndex);
		return maximum;
	}

}
