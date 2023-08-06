package com.mrprk.array.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5 };
		System.out.println(fourSum(arr, 8));

	}

	public static List<List<Integer>> fourSum(int[] arr, int target) {
		Arrays.sort(arr);
		List<List<Integer>> list2 = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			// for duplicate avoid
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				// for duplicate avoid
				if (j != i + 1 && arr[j] == arr[j - 1]) {
					continue;
				}
				int k = j + 1;
				int l = arr.length - 1;
				while (k < l) {
					ArrayList<Integer> list = new ArrayList<>();
					// long sum = arr[i] + arr[j] + arr[k] + arr[l];
					// sum < target k++
					long sum = arr[i];
					sum += arr[j];
					sum += arr[k];
					sum += arr[l];
					if (sum < target) {
						k++;
					} else if (sum > target) {
						l--;
					} else {
						// means it is equal to target
						list.add(arr[i]);
						list.add(arr[j]);
						list.add(arr[k]);
						list.add(arr[l]);
						list2.add(list);
						k++;
						l--;
						while (k < l && arr[k] == arr[k - 1]) {
							k++;
						}
						while (k < l && arr[l] == arr[l + 1]) {
							l--;
						}
					}
				}
			}

		}
		return list2;
	}

}
