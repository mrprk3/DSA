package com.mrprk.array;

public class ReversePairs {
	public static void main(String[] args) {
		int[] arr = { 40, 25, 19, 12, 9, 6, 2 };
		System.out.println(reversePairs(arr));

	}

	public static int reversePairs(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j] * 2) {
					count = count + 1;
					System.out.print(arr[i]);
				}
			}
		}
		return count;
	}

	public String largestOddNumber(String num) {
		int n = Integer.parseInt(num);
		if (n % 2 != 0) {
			return num;
		} else {
			char[] arr = num.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				
			}
		}
		return num;
	}

}
