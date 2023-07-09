package com.mrprk;

public class TodaySolve {

	public static void main(String[] args) {
		//int[][] arr = { { 1, 2, 3 }, { 4, 5, 50 }, { 7, 8, 9, 13 } };

		int[] arr1 = { 1,2,3};
		int[] arr2 = { 1,1,2};

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.println(arr1[i]+" "+arr2[j]);
			}
		}

	}

	public static String checkIndex(int[][] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == element) {
					return "Search element of " + element + " index array of " + i + " " + j;
				}
			}
		}
		return "";

	}

	public static int checkMAxIn2D(int[][] arr) {
		int max = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;

	}

}
