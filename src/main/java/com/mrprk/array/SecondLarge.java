package com.mrprk.array;

public class SecondLarge {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 20 };
		System.out.println(findSecondSmallest(arr));

	}
//} else if (arr[i] < max && secondLargest < arr[i]) {
//	secondLargest = arr[i];
//}

	public static int findSecondLargest(int[] arr) {
		int large = arr[0];
		int secondLarge = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				secondLarge = large;
				large = arr[i];
			}
		}
		return secondLarge;

	}

	public static int findSecondSmallest(int[] arr) {
		int smallest = arr[0];
		int secondSmallest = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}
		}
		return secondSmallest;

	}

}
