package com.mrprk.sort;

import java.util.ArrayList;

public class MergeArray {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 4, 2, 4, 5, 6 };
		merge(arr, 0, 4, 8);
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		int i = 1;
		int left = low;
		int right = mid + 1;
		ArrayList<Integer> list = new ArrayList<>();
		while (i != 10) {
			if (arr[left] <= arr[right] && left <= mid) {
				list.add(arr[left]);
				left++;
			} else {
				list.add(arr[right]);
				right++;
			}
			i++;
		}
		System.out.println(list);
	}

}
