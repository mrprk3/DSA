package com.mrprk;

public class SearchInsertPosition {
	public static void main(String[] args) {
		int [] arr = {1,3,5,6};
		System.out.println(searchInsertInsed(arr,7));

	}

	public static int searchInsertInsed(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int res = arr.length;;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] >= target) {
				res = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return res;
	}

}
