package com.mrprk;

import java.util.HashMap;

public class CheckCharOccouraceEqual {
	public static void main(String[] args) {
		checkCharEqualOrNot("AATTIM");
	}

	public static boolean checkCharEqualOrNot(String str) {
		char[] charArray = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for (Character c : charArray) {
			if (map.containsKey(c)) {
				Integer integer = map.get(c);
				map.put(c, integer + 1);
			} else {
				map.put(c, 1);
			}
		}

		System.out.println(map);
		return false;
	}

}
