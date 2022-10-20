package com.Bridgelabz.Day13;

public class FindMaximumInteger {

	public static Integer testMax(Integer value1, Integer value2, Integer value3) {
		Integer max = value1;

		if (value2.compareTo(max) > 0) {
			max = value2;
		}
		if (value3.compareTo(max) > 0) {
			max = value3;
		}
		return max;

	}

	public static void main(String[] args) {
		System.out.println(" Maximum Integer is " + testMax(40, 20, 30));
	}
}