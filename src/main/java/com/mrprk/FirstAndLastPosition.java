package com.mrprk;

public class FirstAndLastPosition {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 6, 4, 5, 6, 6, 6, 6, 7, 9, 10, 12, 14 };
		String res = searchFirstAndLastIndexOfGivenNumber(arr, 6);
		System.out.println(res);

	}

	public static int binarySearchAproach(int[] arr, int num, boolean isAscending) {
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;

		return 0;
	}

	// Brute force process
	public static String searchFirstAndLastIndexOfGivenNumber(int[] arr, int num) {
		int start = 0;
		int end = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				start = i;
				break;
			}
		}

		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] == num) {
				end = i;
				break;
			}
		}
		return "Number is found in index " + start + " and  " + end;
	}

}