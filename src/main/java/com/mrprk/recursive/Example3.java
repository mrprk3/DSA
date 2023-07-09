package com.mrprk.recursive;

// Without using ++ 
public class Example3 {
	public static void main(String[] args) {
		function(5, 5);
	}

	public static void function(int i, int n) {
		if (i < 1) {
			return;
		} else {
			function(i - 1, n);
			System.out.println(i);
		}
	}

}
