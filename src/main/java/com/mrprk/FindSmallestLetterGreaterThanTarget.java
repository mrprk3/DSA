package com.mrprk;

public class FindSmallestLetterGreaterThanTarget {
	public static void main(String[] args) {
		char[] arr = { 'a', 'c', 'f', 'g', 'h', 'l', 'm' };

		char res = findSmallestLetter(arr, 'f');
		System.out.println(res);

	}

	public static char findSmallestLetter(char[] arr, int number) {
		int start = 0;
		int end = arr.length - 1;
		int mid = start + end / 2;
		while (start <= end) {
			if (arr[mid] < number) {
				start = mid + 1;
			}
			if (arr[mid] > number) {
				end = end - 1;
			}
			mid = (start + end) / 2;
		}
		if (start <= arr.length - 1) {
			return arr[start];
		}
		return arr[0];

	}
}
