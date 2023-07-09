package com.mrprk;

public class FindMin {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7 };
		System.out.println(searchMin(arr));

	}

	public static int searchMin(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
				return mid;
			}
			// even
			if ((mid % 2 == 0) && ((mid - 1) % 2 == 1)) {
				end = mid - 1;
			} else {
				// odd
				if ((mid % 2 == 1) && ((mid - 1) % 2 == 0)) {
					start = mid + 1;
				}
			}
		}
		return -1;
	}
}
