package com.mrprk;

public class SearchInMountainArray {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 10, 12, 13, 14, 15, 17, 13, 12, 11, 10, 5, 7, 2 };
		int target = 7;

		System.out.println(searchElementInMountantArray(arr, target));

	}

	public static int searchElementInMountantArray(int[] arr, int target) {
		int maxIndex = searchElementInMountainArray(arr);
		// System.out.println(maxIndex);

		int start = 0;
		int end = arr.length - 1;
		int ascResult = anyOrderbinarySearch(arr, target, start, maxIndex);
		// System.out.println(ascResult);

		int descResult = anyOrderbinarySearch(arr, target, maxIndex + 1, end);
		// System.out.println(descResult);
		if (ascResult != 0) {
			return ascResult;
		} else {
			if (descResult != 0) {
				return descResult;
			}
		}

		return -1;

	}

	// It can search asc or desc order
	public static int anyOrderbinarySearch(int[] arr, int target, int start, int end) {
		boolean isAscending = arr[0] < arr[end];
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (isAscending) {
				if (arr[mid] > target) {
					end = mid - 1;
				}
				if (arr[mid] < target) {
					start = mid + 1;
				}
			} else {
				if (arr[mid] > target) {
					start = mid + 1;
				}
				if (arr[mid] < target) {
					end = mid - 1;
				}
			}
		}
		return 0;
	}

	// binary search for mountain num in array
	public static int searchElementInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = (start + end) / 2;
			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return end;
	}

}
