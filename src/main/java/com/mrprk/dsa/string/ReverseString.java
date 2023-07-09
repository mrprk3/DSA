package com.mrprk.dsa.string;

public class ReverseString {

	public static String reverseString(String str) {
		int length = str.length();
		if (length == 0) {
			return "";
		}
		return (str.charAt(length - 1) + reverseString(str.substring(0, length - 1)));
	}

	public static void main(String[] args) {
		String reverseString = reverseString("Atim");
		System.out.println(reverseString);

	}

}
