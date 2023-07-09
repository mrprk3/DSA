package com.mrprk.recursive;

import java.util.Arrays;

// reverse an array using recursion
public class Example5 {

	public static void main(String[] args) {
		String[] arr = { "H", "a", "n", "n", "a", "h" };
		reverseArray(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		System.out.println();
	}

	public static void reverseArray(String[] arr, int left, int right) {
		if (left >= right) {
			return;
		} else {
			String temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
			reverseArray(arr, left, right);
		}
	}

}
