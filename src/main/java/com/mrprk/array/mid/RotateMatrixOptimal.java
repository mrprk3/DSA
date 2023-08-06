package com.mrprk.array.mid;

public class RotateMatrixOptimal {
	public static void main(String[] args) {
		int[][] arr = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };// [1,2,3],[4,5,6],[7,8,9]]
		int[][] rorateMatrix = rorateMatrix(arr);
		for (int i = 0; i < rorateMatrix.length; i++) {
			for (int j = 0; j < rorateMatrix.length; j++) {
				int k = rorateMatrix.length - 1;
				int s = 0; 
				while (s < k) {
					int temp = arr[i][s];
					arr[i][s] = arr[i][k];
					arr[i][k] = temp;
					k--;
					s++;
				}
			}
			System.out.println();
		}
		for (int i = 0; i < rorateMatrix.length; i++) {
			for (int j = 0; j < rorateMatrix.length; j++) {
				int k = rorateMatrix.length;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] rorateMatrix(int[][] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		return arr;
	}

}
