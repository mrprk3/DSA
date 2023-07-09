package com.mrprk.kunal;

public class Primitives {
	public static void main(String[] args) {
		int roll = 67; // 4 bytes
		long largeIntegerNumber = 365712451; // 8 bytes
		
		float marks =67.5f; // 4 bytes
		double largeDecimalNumber = 5253757.674636; // 8 bytes
		
		char letter = 'A';
		boolean check = true;
		byte b =42;
		char c = 'a';
		short s = 1024;
		int i=5000;
		float f =5.67f;
		double d = 0.1234;
		double result = (f*b) + (i/c) - (d-s);
		System.out.println((f*b) +" "+ (i/c) +" "+  (d-s));
		System.out.println(result);
		
	}

}
