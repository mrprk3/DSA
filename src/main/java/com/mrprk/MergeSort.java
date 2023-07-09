package com.mrprk;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 4, 1, 3 };
		mergeSort(arr, 5);
		System.out.println(Arrays.toString(arr));
	}

	public static void mergeSort(int[] arr, int size) {
		if (size < 2) {
			return;
		}
		int mid = size / 2;
		int[] left = new int[mid];
		int[] right = new int[size - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		for (int i = mid; i < size; i++) {
			right[i - mid] = arr[i]; 
		} 
		mergeSort(left, mid); // mid is size here
		mergeSort(right, size - mid);

		merge(arr, left, right, mid, size - mid);
	}

	public static void merge(int[] a, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				a[k++] = l[i++];
			} else {
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}

}
