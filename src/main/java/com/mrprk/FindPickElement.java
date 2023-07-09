package com.mrprk;

public class FindPickElement {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 1 };
		int[] arr2 = { 1, 2, 1, 3, 5, 6, 4 };
		int[] arr3 = { 1, 2, 3, 4, 5 };
		int[] arr4 = { 1, 13 };
		int n = arr4.length;
		System.out.println(pickElement(arr4,n));
	}

	public static int pickElement(int[] arr, int n) {
		int start = 1;
		int end = n - 2;
		if(n==1) {
			return 0;
		}
		if (arr[0] > arr[1]) {
			return 0;
		}
		if (arr[n - 1] > arr[n - 2]) {
			return arr.length - 1;
		}
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (arr[mid] > arr[mid - 1]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
