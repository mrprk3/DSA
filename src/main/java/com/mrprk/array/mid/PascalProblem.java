package com.mrprk.array.mid;

import java.util.ArrayList;
import java.util.List;

public class PascalProblem {

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();

		int n = 6;
		for (int i = 1; i < n; i++) {
			list.add(printPascal(i));
		}
		System.out.println(list);
	}

	public static List<Integer> printPascal(int n) {
		List<Integer> temp = new ArrayList<>();
		int ans = 1;
		temp.add(ans);

		for (int i = 1; i < n; i++) {
			ans = ans * (n - i);
			ans = ans / i;
			temp.add(ans);
		}
		System.out.println(temp);

		return temp;

	}
}
