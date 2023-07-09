package com.mrprk;

public class MountainArray {
	public static void main(String[] args) {
		int[] arr = { 0, 10, 5, 2 };
		System.out.println(getMountainNum(arr));

	}

	public static int getMountainNum(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = (start + end) / 2;
			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			}
			if (arr[mid] < arr[mid + 1]) {
				start = mid + 1;
			}
		}

		return start;
	}
}
