package com.mrprk;

public class BinarySearch {
//		iint[] arr = { 50, 40, 10, 1 };

	public static int binarySearchForAscAndDesc(int[] arr, int number) {
		int start = 0;
		int end = arr.length - 1;
		int mid = start + end / 2;

		boolean isAccending = arr[0] < arr[arr.length-1];

		while (start <= end) {
			if (arr[mid] == number) {
				return mid;
			}
			if (isAccending == true) {
				if (arr[mid] < number) {
					start = mid + 1;
				}
				if (arr[mid] > number) {
					end = end - 1;
				}
			}
			if (isAccending == false) {
				if (arr[mid] < number) {
					end = mid - 1;
				}
				if (arr[mid] > number) {
					start = mid + 1;
				}
			}
			mid = (start + end) / 2;
		}

		return 0;
	}

	public static int binarySearchForDesc(int[] arr, int number) {
		int start = 0;
		int end = arr.length - 1;
		int mid = start + end / 2;

		while (start <= end) {
			if (arr[mid] == number) {
				return mid;
			}
			if (arr[mid] < number) {
				end = mid - 1;
			}
			if (arr[mid] > number) {
				start = mid + 1;
			}
			mid = (start + end) / 2;
		}

		return 0;
	}

	public static void main(String[] args) {
		int[] arr = { 50, 40, 10, 1 };
		int[] arr1 = { 1, 3, 8, 9 };

		int binarySearch = binarySearchForAscAndDesc(arr1, 8);
		System.out.println(binarySearch);

	}

}
