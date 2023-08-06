package com.mrprk.array.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SUM {
	public static void main(String[] args) {
		int[] arr = { -1,0,1,2,-1,-4 };
		Arrays.sort(arr);
		System.out.println(sum3(arr));
	}

	public static List<List<Integer>> sum3(int[] arr) {
		List<List<Integer>> list2 = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			int j = i + 1;
			int k = arr.length - 1;
			while (j < k) {
				int sum = arr[i] + arr[j] + arr[k];
				if (sum < 0) {
					j++;
				} else if (sum > 0) {
					k--;
				} else {
					ArrayList<Integer> list = new ArrayList<>();
					list.add(arr[i]);
					list.add(arr[j]);
					list.add(arr[k]);
					list2.add(list);
					j++;
					k--;
					while (j < k && arr[j] == arr[j - 1]) {
						j++;
					}
					while (j < k && arr[k] == arr[k + 1]) {
						k--;
					}
				}
			}
		}
		return list2;
	}
}
