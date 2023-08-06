package com.mrprk.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Given an array you have to return the element from array who has > n/3[n is the length]
public class MajorityNumber {
	public static void main(String[] args) {
		int[] arr = { 2,2 };
		System.out.println(arr.length / 3);

		// Brute force approach
		System.out.println(checkCountApproach1(arr));

		// Better approach
		System.out.println(checkCountApproach2(arr));

	}

	// Brute force approach
	public static ArrayList<Integer> checkCountApproach1(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count = count + 1;
				}
			}
			if (count > (arr.length / 3)) {
				if (!list.contains(arr[i])) {
					list.add(arr[i]);
				}
				count = 0;
			}
		}
		return list;
	}

	// Better approach
	public static ArrayList<Integer> checkCountApproach2(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				Integer count = map.get(arr[i]);
				map.put(arr[i], count + 1);
			} else {
				map.put(arr[i], 1);
			}
			if (map.get(arr[i]) > (arr.length / 3)) {
				if (!list.contains(arr[i])) {
					list.add(arr[i]);
				}
			}
		}
		return list;
	}

}
