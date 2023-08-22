package com.mrprk.array;

public class FirstAndLastOccourance {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 25, 30, 30, 30, 40, 40 }; // 2,3
		System.out.println(firstOccourance(arr, 30));
		System.out.println(secondOccourance(arr, 30));

	}

	public static int firstOccourance(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int ans = arr.length;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				ans = mid;
				high = mid - 1;
			} else if (arr[mid] > target) {
				high = mid - 1;

			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static int secondOccourance(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int ans = arr.length;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				ans = mid;
				low = mid + 1;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
	}

}
