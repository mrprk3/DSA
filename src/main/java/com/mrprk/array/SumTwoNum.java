package com.mrprk.array;

import java.util.HashMap;

public class SumTwoNum {
	public static void main(String[] args) {
		int[] arr = { 2, 6, 5, 8, 11 };
		System.out.println(findSumOptimize(arr, 14));

	}

	public static String findSumOptimize(int[] arr, int num) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int search = num - arr[i];
			if (map.containsValue(search)) {
				return "Yes";
			} else {
				map.put(i, arr[i]);
			}
		}
		return "No";
	}

	public static void findSum(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == num) {
					System.out.println(i + " " + j);
					break;
				}
			}
		}
	}

}
