package com.mrprk.array;

public class ShareBuySell {
	public static void main(String[] args) {
		int[] arr = { 1,2};
		System.out.println(maxProfit(arr));

	}

	public static int findMaxProfit(int[] arr) {
		int minPrice = 2147483647;
		int maxProfit = 0;
		for (int i = 1; i < arr.length; i++) {
			minPrice = Math.min(minPrice, arr[i]);
			// now profit will be arr[i] is current cost - minimum which we already stored
			maxProfit = Math.max(maxProfit, arr[i] - minPrice);
		}
		return maxProfit;
	}
	
	 public static int maxProfit(int[] prices) {
	        int minPrice = prices[0];
	        int maxProfit =0;
	        for(int i=1; i<prices.length; i++){
	            minPrice = Math.min(minPrice, prices[i]);
	            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
	        }
	        return maxProfit;
	    }

}
