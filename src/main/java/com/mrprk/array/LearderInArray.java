package com.mrprk.array;

import java.util.ArrayList;

public class LearderInArray {
	public static void main(String[] args) {
		int[] arr = { 5,4,3};
		ArrayList<Integer> findLeader = findLeader(arr);
		System.out.println(findLeader);
	}

	public static ArrayList<Integer> findLeader(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(arr[arr.length - 1]);
		int max = arr[arr.length - 1];
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] > max) {
				list.add(arr[i]);
				max = arr[i];
			}
		}
		return list;
	}

	public static void leader(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					flag = false;
				} else {
					flag = true;
				}
			}

		}
	}

}
