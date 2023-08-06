package com.mrprk.array;

public class Test22 {
	public static void main(String[] args) {

	}

	public static int getRes(int[] arr) {
		int res = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (res < (arr[i] - 1) * (arr[j] - 1)) {
					res = (arr[i] - 1) * (arr[j] - 1);
				}
			}
		}
		return res;
	}

}
