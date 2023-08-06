package com.mrprk.array;

import java.util.Arrays;

public class LeftRotate {
	public static void main(String[] args) {
//		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { -1,-100,3,99};
//		int[] leftRotateByOne = leftRotateByOne(arr1);
//		System.out.println(Arrays.toString(leftRotateByOne));
//		System.out.println(20 % 7);
//		System.out.println(Arrays.toString(leftRotateByOneEx(arr2, 2)));
//		System.out.println(Arrays.toString(reverseArray(arr2, 1, 3)));
		rightRotateByN(arr2, 2);

	}

	public static int[] leftRotateByN(int[] arr, int n) {
		reverseArray(arr, 0, n - 1);
		reverseArray(arr, n, arr.length - 1);
		reverseArray(arr, 0, arr.length - 1);
		return arr;
	}
	
	public static int[] rightRotateByN(int[] arr, int n) {
		int[] reverseArray = reverseArray(arr, 0, n-1);
		System.out.println(Arrays.toString(reverseArray));
		int[] reverseArray2 = reverseArray(arr, 2, 3);
		System.out.println(Arrays.toString(reverseArray2));

		int[] reverseArray3 = reverseArray(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(reverseArray3));

		return arr;
	}

	// leftRotateBy 1 element
	public static int[] leftRotateByOne(int[] arr) {
		int temp = arr[0];
		for (int j = 1; j < arr.length; j++) {
			arr[j - 1] = arr[j];
		}
		arr[arr.length - 1] = temp;
		return arr;

	}

	// brute force approach leftRotateBy n [n can be any number ]
	public static int[] leftRotateByOneEx(int[] arr, int n) {
		int[] temp = new int[n];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[i];
		}

		for (int j = n; j < arr.length; j++) {
			arr[j - n] = arr[j];
		}
		int p = 0;
		for (int k = arr.length - n; k < arr.length; k++) {
			arr[k] = temp[p];
			p++;
		}
		return arr;
	}

	// optimal or best solution
	public static int[] reverseArray(int[] arr, int index1, int index2) {
		int i = index1;
		int j = index2;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return arr;

	}

}
