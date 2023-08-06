package com.mrprk.array.mid;

public class RotateMatrix {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println(arr.length);
		rotateMatrix(arr);
	}

	public static void rotateMatrix(int[][] arr) {
		int[][] newArr = new int[arr.length][arr.length];
		int n = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				newArr[j][n] = arr[i][j];
			}
			n--;
		}

		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr.length; j++) {
				System.out.print(newArr[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
