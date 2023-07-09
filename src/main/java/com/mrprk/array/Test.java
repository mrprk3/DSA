package com.mrprk.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static int[] swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		return arr;
	}

	public static int[] reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}

		return arr;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 34, 56, 7 };
//		int[] swap = swap(arr, 0, 4);
		System.out.println("Hiii");

		int[] reverseArray = reverseArray(arr);
		System.out.println(Arrays.toString(reverseArray));

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(14);
		list1.add(15);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(13);
		list2.add(14);
		list2.add(15);

		for (int i = 0; i < list2.size(); i++) {
			if (!list2.contains(list1.get(i)) || !list1.contains(list2.get(i))) {
				System.out.println(list1.get(i));
				System.out.println(list2.get(i));

			}
		}
	}

}
