package com.mrprk.sort;

import java.util.Arrays;

public class MergeSort {
	public static int[] arr = { 7, 1, 2, 9 };

	public static void main(String[] args) {
		doMergeSort(arr, 0, arr.length - 1);
	}

	public static void doMergeSort(int[] arr, int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		doMergeSort(arr, low, mid);
		doMergeSort(arr, mid + 1, high);
		merge(arr, low, mid, high);

	}

	public static void merge(int[] arr, int low, int mid, int high) {
		int[] temp = new int[arr.length];
		int i = 0;

		int left = low;
		int right = mid + 1;
		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp[i] = arr[left];
				left++;
				i++;
			} else {
				temp[i] = arr[right];
				right++;
				i++;
			}
		}
		while (left <= mid) {
			temp[i] = arr[left];
			left++;
			i++;
		}
		while (right <= high) {
			temp[i] = arr[right];
			right++;
			i++;
		}
		for (int k = 0; k < temp.length; k++) {
			arr[k] = temp[k];
		}

		System.out.println(Arrays.toString(arr));

	}

}
