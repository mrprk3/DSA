package com.mrprk.recursive;

import java.util.ArrayList;

public class LeetCode2 {
	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 3 };
		int[] arr2 = { 5, 6, 4 };
		int res = sum(arr1) + sum(arr2);// 807
		ArrayList<Integer> list = new ArrayList<>();
		while (res != 0) {
			int rem = res % 10;
			list.add(rem);
			res = res / 10;
		}
		System.out.println(list);

	}

	public static int sum(int[] arr) {
		int sum = 0;
		int length = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			sum = sum * 10 + arr[length];
			length--;
		}
		return sum;
	}

}
