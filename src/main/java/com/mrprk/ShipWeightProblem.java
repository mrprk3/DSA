package com.mrprk;

public class ShipWeightProblem {

	public static void main(String[] args) {
		int[] weight = { 5, 4, 5, 2, 3, 4, 5, 6 };
		System.out.println(minShipCapacityRequired(weight, 5));
	}

	public static int minShipCapacityRequired(int[] weight, int day) {
		int ans = -1;
		int[] lowHigh = findHigh(weight);
		int low = lowHigh[0];
		int high = lowHigh[1];
		while (low <= high) {
			int mid = (low + high) / 2;
			int findDayRequired = findDayRequired(weight, mid);
			if (findDayRequired <= day) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;

	}

	public static int findDayRequired(int[] weight, int shipCapacity) {
		int day = 1;
		int load = 0;
		for (int i = 0; i < weight.length; i++) {
			if (load + weight[i] > shipCapacity) {
				day = day + 1;
				load = weight[i];
			} else {
				load += weight[i];
			}
		}
		return day;
	}

	public static int[] findHigh(int[] weight) {
		int high = 0;
		// max in array will be the low
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < weight.length; i++) {
			high = high + weight[i];
			if (weight[i] > max) {
				max = weight[i];
			}
		}
		int[] lowHigh = new int[2];
		lowHigh[0] = max;
		lowHigh[1] = high;
		return lowHigh;
	}
}
