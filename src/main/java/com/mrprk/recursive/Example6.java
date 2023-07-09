package com.mrprk.recursive;

public class Example6 {
	public static void main(String[] args) {
		String str = "Atim";
		System.out.println(reverse("A man, a plan, a canal: Panama"));
	}

	public static String reverse(String str) {
		if (str.length() == 0) {
			return ""; 
		} else {
			return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
		}
	}

}
