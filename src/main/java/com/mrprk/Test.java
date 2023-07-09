package com.mrprk;

public class Test {
	public static void main(String[] args) {
		String s1 = "Atim";
		String s2 = s1.concat("Pramanik");
		System.out.println(reverse(-121));

	}

	public static boolean reverse(int num) {
		int temp = num;
		int rem = 0;
		int rev = 0;
		if (num >= 0) {
			while (num != 0) {
				rem = num % 10;
				rev = (rev * 10) + rem;
				num = num / 10;
			}
		}
		if (temp == rev) {
			return true;
		}
		return false;

	}

}
