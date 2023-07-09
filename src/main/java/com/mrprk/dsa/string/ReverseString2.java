package com.mrprk.dsa.string;

public class ReverseString2 {

	public static String reverseString(String str) {
		int n = str.length();
		if (n == 0) {
			return "";
		}
		char[] charArray = str.toCharArray();
		int start = 0;
		int end = n - 1;
		while(start<end) {
		char r = charArray[start];
		charArray[start] = charArray[end];
		charArray[end] = r;
		start++;
		end--;
		}
		return new String(charArray);

	}

	public static void main(String[] args) {
		String reverseString = reverseString("ABCD");
		System.out.println(reverseString);
	}

}
