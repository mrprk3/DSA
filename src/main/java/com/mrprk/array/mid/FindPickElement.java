package com.mrprk.array.mid;

public class FindPickElement {
	public static void main(String[] args) {
		int[] arr = { 1,2,1,2,1 };
		System.out.println(findPickElement(arr));
	}

	public static int findPickElement(int[] arr) {
		int low = 1;
		int high = arr.length - 2;
		if (arr.length == 1) {
			return arr[0];
		}
		if (arr[0] > arr[1]) {
			return arr[0];
		}
		if (arr[arr.length - 1] > arr[arr.length - 2]) {
			return arr[arr.length - 1];
		}
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
				return arr[mid];
			}
			if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
				low = mid + 1;
			}
			if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
				high = mid - 1;
			}
		}
		return -1;
	}

}
