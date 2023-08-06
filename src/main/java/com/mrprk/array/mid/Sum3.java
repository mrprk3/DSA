package com.mrprk.array.mid;

import java.util.ArrayList;

public class Sum3 {
	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };
		find3Sum(arr);
	}

	public static ArrayList<Integer> find3Sum(int[] arr) {
		for (int i = 0; i < arr.length - 3; i++) {
			for (int j = i + 1; j < arr.length - 2; j++) {
				for (int k = j + 1; k < arr.length - 1; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					}
				}
			}
		}
		return null;
	}
}
