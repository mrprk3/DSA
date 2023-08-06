package com.mrprk.array;

import java.util.ArrayList;
import java.util.List;

public class UnionArrayOptimal {
	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 2, 3, 4, 5, 6, 7 };
		int[] arr2 = { 3, 4, 5, 6, 7, 8 };
		List<Integer> unionArray = unionArray(arr1, arr2);
		System.out.println(unionArray);

	}

	public static List<Integer> unionArray(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		int i = 0;
		int j = 0;
		ArrayList<Integer> list = new ArrayList<>();

		while (i < n1 && j < n2) {
			if (arr1[i] <= arr2[j] && (!list.contains(arr1[i]))) {
				list.add(arr1[i]);
				i++;
			} else {
				if (!list.contains(arr1[j])) {
					list.add(arr2[j]);
					j++;
				}
			}
		}

		while (i < n1) {
			if (!list.contains(arr1[i])) {
				list.add(arr1[i]);
				i++;
			}
		}
		while (j < n2) {
			if (!list.contains(arr1[j])) {
				list.add(arr2[j]);
				j++;
			}
		}

		return list;
	}

}
