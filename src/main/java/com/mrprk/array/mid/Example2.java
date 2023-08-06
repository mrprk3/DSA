package com.mrprk.array.mid;

import java.util.Arrays;

public class Example2 {
	public static void main(String[] args) {
		int[] arr = { 2,0,1};
		System.out.println(Arrays.toString(doSort(arr)));

	}

	public static int[] doSort(int[] arr) {
		int low = 0;
		int mid = 0;
		int high = arr.length-1;
		while (mid <= high) {
			if (arr[mid] == 0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else if (arr[mid] == 2) {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
		return arr;
	}

}
