package com.mrprk;

public class LowerBoundConcept {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 7, 8, 9, 9, 9, 11 };
		int[] arr2 = { 10, 20, 30, 40, 50 };
		//System.out.println("Lower Bound Answer");
		//System.out.println(searchLowerBound(arr2, arr2.length, 20));

		//System.out.println("Upper Bound Answer");
		System.out.println("Floor : index :"+ getFloor(arr2, arr2.length, 25));
		System.out.println("Ceil : index :"+ getCeil(arr2, arr2.length, 25));


	}

	public static int [] getFloor(int[] arr, int n, int x) {
		int start = 0;
		int end = n - 1;
		int [] ans = {-1,-1};
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] <= x) {
				ans[0] = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return ans;
	}

	public static int getCeil(int[] arr, int n, int x) {
		int start = 0;
		int end = n - 1;
		int ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] >= x) {
				ans = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return ans;
	}

	public static int searchUpperBound(int[] arr, int n, int k) {
		int low = 0;
		int high = n - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > k) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static int searchLowerBound(int[] arr, int n, int k) {
		int start = 0;
		int end = n - 1;
		int ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] >= k) {
				ans = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return ans;
	}

}
