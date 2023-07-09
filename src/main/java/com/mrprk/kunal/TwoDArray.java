package com.mrprk.kunal;

public class TwoDArray {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 50 }, { 7, 8, 9, 13 } };
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		String res = checkIndex(arr, 8);
		System.out.println(res);

		int ress = checkMAxIn2D(arr);
		System.out.println(ress);

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
