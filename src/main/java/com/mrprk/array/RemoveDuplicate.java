package com.mrprk.array;

import java.util.ArrayList;

public class RemoveDuplicate {
	public static void main(String[] args) {
		ArrayList<Integer> asList = new ArrayList<>();
		asList.add(1);
		asList.add(2);
		asList.add(2);
		asList.add(3);
		asList.add(3);
		asList.add(4);
		asList.add(4);
		asList.add(5);
		asList.add(5);

//1 2 2 3 3 3 4 4 5 5 
		System.out.println(removeDuplicate(asList));
	}

	public static int removeDuplicate(ArrayList<Integer> arr) {
		int i = 0;
		for (int j = 1; j < arr.size(); j++) {
			if (arr.get(i) != arr.get(j)) {
				arr.add(i + 1, arr.get(j));
				i++;
			}
		}
		return i + 1;
	}

}
