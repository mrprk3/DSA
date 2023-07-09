package com.mrprk.dsa.array;

public class FindMinMax {
	int min;
	int max;

	public static FindMinMax getMinMax(int arr[], int low, int high) {
		FindMinMax minmax = new FindMinMax();
		if (low == high) {
			minmax.min = arr[low];
			minmax.max = arr[high];
		}

		if (high == low + 1) {
			if (arr[low] < arr[high]) {
				minmax.min = arr[low];
				minmax.max = arr[high];
			}
		}

		int mid = (low + high) / 2;

		FindMinMax left = getMinMax(arr, low, mid);
		FindMinMax right = getMinMax(arr, mid + 1, high);

		if (left.min > right.min) {
			minmax.min = right.min;
		}
		if (left.max > right.max) {
			minmax.max = right.max;
		}

		return minmax;
	}

	public static void main(String[] args) {

	}

}
