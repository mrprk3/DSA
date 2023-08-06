package com.mrprk.array;

import java.util.Arrays;

public class LongestConsecutiveArray {
	public static void main(String[] args) {
		int[] arr = { 5,4,3 };
		Arrays.sort(arr);
		System.out.println(findLongestConsecutiveCount(arr));
	}

	public static int findLongestConsecutiveCount(int[] arr) {
		int longest = 1;
		int count = 0;
		int lastSmall = -100000;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] - 1 == lastSmall) {
				count = count + 1;
				lastSmall = arr[i];
			} else if (arr[i] != lastSmall) {
				count =1;
				lastSmall=arr[i];
			}
			longest = Math.max(longest, count);
		}
		return longest;
	}

}
