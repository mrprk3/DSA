package com.mrprk.dsa.array;

public class MinMax {
	int min;
	int max;

	public static MinMax getminMax(int arr[], int low, int high) {
		MinMax minmax = new MinMax();
		int mid;
		if (low == high) {
			minmax.min = arr[low];
			minmax.max = arr[high];
			return minmax;
		}

		if (high == low + 1) {
			if (arr[high] > arr[low]) {
				minmax.max = arr[high];
				minmax.min = arr[low];
				return minmax;
			}
		}

		mid = (low + high) / 2;

		MinMax left = getminMax(arr, low, mid);
		MinMax right = getminMax(arr, mid + 1, high);

		if (left.min < right.min) {
			minmax.min = left.min;
		} else {
			minmax.min = right.min;
		}

		if (left.max > right.max) {
			minmax.max = left.max;
		} else {
			minmax.max = right.max;
		}
		return minmax;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 7, 2 ,8};
		MinMax getminMax = getminMax(arr, 0, 5);
		System.out.println(getminMax.max);
		System.out.println(getminMax.min);

	}

}
