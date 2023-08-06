package com.mrprk.array.mid;

import java.util.Arrays;

public class MissingReapeatingNumber {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 6, 2, 1, 1 };
		findMissingReapeatingNumber(arr);
	}

	public static int[] findMissingRepeatingNumbers(int[] a) {
		int n = a.length; // size of the array
		int repeating = -1, missing = -1;

		for (int i = 1; i <= n; i++) {
			int cnt = 0;
			for (int j = 0; j < n; j++) {
				if (a[j] == i)
					cnt++;
			}
			if (cnt == 2)
				repeating = i;
			else if (cnt == 0)
				missing = i;

			if (repeating != -1 && missing != -1)
				break;
		}
		int[] ans = { repeating, missing };
		System.out.println(Arrays.toString(ans));
		return ans;
	}

	public static void findMissingReapeatingNumber(int[] arr) {
		int repeating = -1, missing = -1;
		for (int i = 1; i <= arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					count++;
				}
				if (count == 2) {
					repeating = i;
				} else if (count == 0) {
					missing = i;
				}
				if (repeating != -1 && missing != -1)
					break;
			}
		}
		int[] ans = { repeating, missing };
		System.out.println(Arrays.toString(ans));
	}
}
