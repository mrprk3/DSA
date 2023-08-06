package com.mrprk.array.mid;

import java.util.Arrays;

// sort an array 0's 1's and 1's
public class Example1 {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		System.out.println(Arrays.toString(sortArr(arr)));
	}

// Brute force approach 
	public static int[] sortArr(int[] arr) {
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count0 = count0 + 1;
			} else if (arr[i] == 1) {
				count1 = count1 + 1;
			} else if (arr[i] == 2) {
				count2 = count2 + 1;
			}
		}
		for (int i = 0; i < count0; i++) {
			arr[i] = 0;
		}
		for (int i = count0; i < count0 + count1; i++) {
			arr[i] = 1;
		}
		for (int i = count0 + count1; i < arr.length; i++) {
			arr[i] = 2;
		}
		return arr;
	}

}
