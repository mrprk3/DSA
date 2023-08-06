package com.mrprk.array.mid;

import java.util.ArrayList;
import java.util.List;

class Interval {
	int first;
	int second;

	public Interval(int first, int second) {
		this.first = first;
		this.second = second;
	}
}

class Result {
	int first;
	int last;
	public Result(int first, int last) {
		this.first = first;
		this.last = last;
	}
	@Override
	public String toString() {
		return "Result [first=" + first + ", last=" + last + "]";
	}
	
}

public class MergeOverlapping {
	public static void main(String[] args) {
		// intervals = [[1,3],[2,6],[8,10],[15,18]]
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] intervals2 = { { 1, 4 }, { 4, 5 } };
		System.out.println(merge(intervals));

	}

	public static List<Result> merge(int[][] intervals) {
		List<Result> list = new ArrayList<>();
		int[][] res = new int[intervals.length][intervals[0].length];
		int first = intervals[0][0];
		int second = intervals[0][1];
		for (int i = 1; i < intervals.length; i++) {
			if (second >= intervals[i][0]) {
				second = Math.max(second, intervals[i][1]);
			} else {
				// store res
				// System.out.println(first + " " + second);
				res[i - 1][0] = first;
				res[i - 1][1] = second;
				list.add(new Result(first, second));
				// list.clear();
				first = intervals[i][0];
				second = intervals[i][1];
			}
		}
		list.add(new Result(first, second));
		return list;
	}

	public static List<Interval> mergeOverlap(List<Interval> intervals) {
		if (intervals.size() < 2) {
			return intervals;
		}
		List<Interval> result = new ArrayList<>();
		// sort
		// Collections.sort(intervals, (a, b) -> Integer.compare(a.first, a.second));
		Interval firstIndex = intervals.get(0);
		int first = firstIndex.first;
		int second = firstIndex.second;
		for (int i = 1; i < intervals.size(); i++) {
			Interval temp = intervals.get(i);
			if (second >= temp.first) {
				second = Math.max(second, temp.second);
			} else {
				result.add(new Interval(first, second));
				first = temp.first;
				second = temp.second;
			}
		}
		result.add(new Interval(first, second));
		return result;
	}

}
