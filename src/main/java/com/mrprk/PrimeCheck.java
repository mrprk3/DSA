package com.mrprk;

public class PrimeCheck {
	public static void main(String[] args) {
		System.out.println(countPrimes(10));

	}

	public static int countPrimes(int n) {
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (checkPrime(i)) {
				count = count + 1;
			}
		}
		return count;
	}

	public static boolean checkPrime(int n) {
		int count = 0;
		for (int i = 1; i <n; i++) {
			if (n % i == 0) {
				count = count + 1;
			}
		}
		if (count < 3) {
			return true;
		}
		return false;
	}

}
