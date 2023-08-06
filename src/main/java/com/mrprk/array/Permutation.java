package com.mrprk.array;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {
		List<List<Integer>> ll = new ArrayList<>();

		int[] arr = { 0, 1 };
		findPermutationArray(ll, arr, 0);
		System.out.println(ll);

	}

	public static void findPermutationArray(List<List<Integer>> ll, int[] arr, int fi) {
		ArrayList<Integer> sub = new ArrayList<>();

		if (fi == arr.length - 1) {
			for (int i = 0; i < arr.length; i++) {
				sub.add(arr[i]);
			}
			ll.add(sub);
			return;
		}

		for (int i = fi; i < arr.length; i++) {
			performSwap(arr, fi, i);
			findPermutationArray(ll, arr, fi + 1);
			performSwap(arr, fi, i);
		}

	}

	public static int[] performSwap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;

	}

	// fi means fixed
	public static void permutation(char[] arr, int fi) {
		if (fi == arr.length - 1) {
			System.out.println(arr);
			return;
		}
		for (int i = fi; i < arr.length; i++) {
			swap(arr, fi, i);
			permutation(arr, fi + 1);
			swap(arr, fi, i);
		}
	}

	private static char[] swap(char[] charArray, int j, int i) {
		char temp = charArray[j];
		charArray[j] = charArray[i];
		charArray[i] = temp;
		return charArray;
	}

}
