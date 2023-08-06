package com.mrprk.array.mid;

import java.util.HashMap;
import java.util.Map.Entry;

public class MajorityElement {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2, 3, 2, 2, 2, 3, 3, 3 };
		System.out.println(findMajorityUsingMoorsAlgo(arr));
	}

	// Brute force approach
	public static int findMajority(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count = count + 1;
				}
				if (count > arr.length / 2) {
					return arr[i];
				}
			}
		}
		return -1;
	}

	// Better approach
	public static int findMajorityUsingHash(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				Integer count = map.get(arr[i]);
				map.put(arr[i], count + 1);
			} else {
				map.put(arr[i], 1);
			}

		}
		for (Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() > arr.length / 2) {
				return m.getKey();
			}
		}
		return -1;
	}

	public static int findMajorityUsingMoorsAlgo(int[] arr) {
		int count = 0;
		int element = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (element == arr[i]) {
				count = count + 1;
			} else {
				count = count - 1;
			}
			if (count == 0) {
				count = 1;
				element = arr[i];
			}
		}
		return element;

	}

}
