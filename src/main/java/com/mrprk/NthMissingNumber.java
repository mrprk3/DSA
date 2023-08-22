package com.mrprk;

public class NthMissingNumber {
	public static void main(String[] args) {
		int[] arr = { 4, 7, 9, 10 };// 1,5,6,7,8,10
		findAllMissingNumber(arr, 4);
	}

	public static void findAllMissingNumber(int[] arr, int nth) {
		int num = 1;
		int count = 1;
		int n = arr.length;
		int i = 0;
		while (i < n) {
			if (arr[i] == num) { // not missing
				i++;
			} else {// missing number
				if (count == nth) {
					System.out.println(num);
				}
				count++;
			}
			num = num + 1;
		}
	}

}
