package com.mrprk.array.mid;

import java.util.ArrayList;

public class GenerateSubArray {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 2, 6, 4 };
		ArrayList<Integer> A = new ArrayList<>();
		A.add(4);
		A.add(2);
		A.add(2);
		A.add(6);
		A.add(4);

		System.out.println(generateSubArray(arr, 6));
	}
	
	public static int subarraysWithSumK(int []a, int b) {
        int count =0;
        for(int i=0; i<a.length-1; i++){
            int xor =0;
            for(int j=i; j<a.length-1; j++){
                xor = xor ^ a[j];
            }
            if(xor == b){
                count ++;
            }
        }
        return count;
    }

	public static int subarraysWithXorK(ArrayList<Integer> A, int k) {
		int n = A.size(); // size of the given array.
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int xorr = 0;
			for (int j = i; j < n; j++) {
				xorr = xorr ^ A.get(j);
				if (xorr == k)
					cnt++;
			}
		}
		return cnt;
	}

	public static int solve(ArrayList<Integer> A, int B) {
		int count = 0;
		for (int i = 0; i < A.size(); i++) {
			int xor = 0;
			for (int j = i; j < A.size(); j++) {
				xor = xor ^ A.get(j);
				if (xor == B) {
					count++;
				}
			}
		}
		return count;
	}

	public static int generateSubArray(int[] arr, int target) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int xor = 0;
				for (int k = i; k <= j; k++) {
					xor = xor ^ arr[k];
					System.out.print(arr[k]);
				}
				if (xor == target) {
					count++;
				}
				System.out.println();
			}
		}
		return count;
	}

}
