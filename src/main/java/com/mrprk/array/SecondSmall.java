package com.mrprk.array;

import java.util.Arrays;

public class SecondSmall {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(findSecondSmalllest(arr));
	}

	public static int findSecondSmalllest(int[] arr) {
		int smallest = arr[0];
		int secondSmallest = 2147483647;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} else if (arr[i] != smallest && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
	}
}
