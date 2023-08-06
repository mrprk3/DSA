package com.mrprk.array.mid;

import java.util.ArrayList;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		ArrayList<Integer> sprialMatrix = sprialMatrix(arr);
		System.out.println(sprialMatrix);

	}

	public static ArrayList<Integer> sprialMatrix(int[][] matrix) {
		ArrayList<Integer> list = new ArrayList<>();

		int top = 0;
		int bottom = matrix.length - 1;
		int left = 0;
		int right = matrix[top].length - 1;
		while (top <= bottom && left <= right) {
			for (int i = left; i <= right; i++) {
				list.add(matrix[top][i]);
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				list.add(matrix[i][right]);
			}
			right--;
			if (!(top <= bottom && left <= right)) {
				break;
			}
			for (int i = right; i >= left; i--) {
				list.add(matrix[bottom][i]);
			}
			bottom--;
			for (int i = bottom; i >= top; i--) {
				list.add(matrix[i][left]);
			}
			left++;
		}
		return list;
	}

}
