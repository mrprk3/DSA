package com.mrprk.array.mid;

import java.util.ArrayList;

public class Example3 {
	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		int[][] arr = { { -1 }, { 2 }, { 3 } };
		solutionMatrix(arr);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			ArrayList<Integer> list2 = new ArrayList<>();
			for (int j = 0; j < arr[i].length; j++) {
				list2.add(arr[i][j]);
			}
			list.add(list2);
			System.out.println(list2);
		}
		System.out.println(list);
	}

	public static int[][] solutionMatrix(int[][] arr) {
		

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0) {
					makeRow(j, i, arr);
					makeColumn(j, i, arr);
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == -1) {
					arr[i][j] = 0;
				}
			}
		}

		return arr;
	}

	private static void makeRow(int j, int i, int[][] arr) {
		for (j = 0; j < arr[i].length; j++) {
			if (arr[i][j] != 0) {
				arr[i][j] = -1;
			}
		}

	}

	private static void makeColumn(int j, int i, int[][] arr) {
		for (i = 0; i < arr.length; i++) {
			if (arr[i][j] != 0) {
				arr[i][j] = -1;
			}
		}

	}

}
