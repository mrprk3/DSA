package com.mrprk.array;

public class FloorCeil {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 9, 10, 15, 18, 20, 30, 40, 50 };
		findFloor(arr, 19);
	}

	public static void findFloor(int[] arr, int target) {
		int ans = 0;
		int low = 0;
		int high = arr.length;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] <= target) {
				ans = arr[mid];
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		System.out.println("Floor : " + ans);
	}

}
