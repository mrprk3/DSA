package com.mrprk;

public class KoKoEatBanana {
	public static void main(String[] args) {
		int[] arr = { 30,11,23,4,20 };
		System.out.println(getFinalResult(arr, 6));
	}

	public static int getFinalResult(int[] arr, int totalHours) {
		// we have to find out per hour
		int start = 1;
		int end = findMax(arr);
		int ans = 0;
		while (start <= end) {
			int mid = (start + end) / 2;
			int totalTime = calculateTotalHours(arr, mid);
			ans = mid;
			if (totalHours >= totalTime) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return ans;
	}

	public static int findMax(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int calculateTotalHours(int[] arr, int noOfEatBanana) {
		int time = 0;
		for (int i = 0; i < arr.length; i++) {
			time = time + checkTimeTakenToEat(arr[i], noOfEatBanana);
		}
		return time;
	}

	public static int checkTimeTakenToEat(int noOfBanana, int perHourEat) {
		if (noOfBanana < perHourEat) {
			return 1;
		}
		if (noOfBanana % perHourEat == 0) {
			return noOfBanana / perHourEat;
		}
		if (noOfBanana % perHourEat != 0) {
			return (noOfBanana / perHourEat) + 1;
		}
		return -1;
	}

}
