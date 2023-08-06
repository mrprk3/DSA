package com.mrprk.array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr2 = { 1, 4, 5, 6, 7, 8 };
		intersectionArray(arr1, arr2);

	}

	public static List<Integer> intersectionArray(int[] a, int[] b) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j] && (!list.contains(a[i]))) {
					list.add(a[i]);
				}
			}
		}
		return list;
	}

}
