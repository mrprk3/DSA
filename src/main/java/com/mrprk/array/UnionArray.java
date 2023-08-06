package com.mrprk.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UnionArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 2, 3, 4, 5 };
		int[] arr2 = { 2, 3, 4, 4, 5 ,7};
		System.out.println(unionArr(arr1, arr2));

	}

	public static List<Integer> unionArr(int[] arr1, int[] arr2) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			set.add(arr2[i]);
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer s : set) {
			list.add(s);
		}

		return list;
	}

}
