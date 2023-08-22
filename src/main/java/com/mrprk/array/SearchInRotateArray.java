package com.mrprk.array;

public class SearchInRotateArray {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(findElement(arr,2));
	}

	public static int findElement(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if(arr[mid]==target) {
				return mid;
			}
			if (arr[low] <= arr[mid]) { // true means sorted
				if (target >= arr[low] && target <= arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}

			} else {// this one is sorted
				if (target >= arr[mid] && target <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return 0;
	}

}
