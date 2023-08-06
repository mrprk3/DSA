package com.mrprk.array.mid;

import java.util.Arrays;

public class MergeTwoSortedArr {
	public static void main(String[] args) {
		int[] arr1 = { 1,2,3,0,0,0 };
		int[] arr2 = { 2,5,6 };
		 System.out.println(Arrays.toString(merge(arr1, arr2)));
		//mergeOptimal(arr1, arr2);

	}

	// Brute force approach
	public static int[] merge(int[] arr1, int[] arr2) {
		int left = 0;
		int right = 0;
		int i = 0;
		int[] arr3 = new int[arr1.length + arr2.length];
		while (left < arr1.length && right < arr2.length) {
			if (arr1[left] > arr2[right]) {
				arr3[i] = arr2[right];
				i++;
				right++;
			} else {
				arr3[i] = arr1[left];
				i++;
				left++;
			}
		}
		while (left < arr1.length) {
			arr3[i] = arr1[left];
			i++;
			left++;
		}
		while (right < arr2.length) {
			arr3[i] = arr2[right];
			i++;
			right++;
		}
		for (int k = 0; k < (arr1.length + arr2.length); k++) {
			if (k < arr1.length) {
				arr1[k] = arr3[k];
			} else {
				arr2[k - arr1.length] = arr3[k];
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		return arr3;
	}

	// Optimal approach
	public static int[] mergeOptimal(int[] arr1, int[] arr2) {
		int left = arr1.length - 1;
		int right = 0;
		while (left >= 0 && right <= arr2.length) {
			if (arr1[left] > arr2[right]) {
				int temp = arr1[left];
				arr1[left] = arr2[right];
				arr2[right] = temp;
				left--;
				right++;
			} else {
				break;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		return arr2;

	}

	// Optimal approach
	public static int[] mergeOptimals(int[] arr1, int[] arr2) {
		int left = arr1.length - 1;
		int right = 0;
		while (left >= 0 && right <= arr2.length) {
			if (arr1[left] > arr2[right]) {
				int temp = arr1[left];
				arr1[left] = arr2[right];
				arr2[right] = temp;
				left--;
				right++;
			} else {
				break;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int[] arr3 = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr3.length; i++) {
			if (i < arr1.length) {
				arr3[i] = arr1[i];
			} else {
				arr3[i] = arr2[i-arr1.length];
			}
		}
		System.out.println(Arrays.toString(arr3));
		return arr3;

	}

}
