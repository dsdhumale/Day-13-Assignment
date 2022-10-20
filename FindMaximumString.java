package com.Bridgelabz.Day13;

public class FindMaximumString {
	public static String testMax(String x, String y, String z) {
		Integer value1 = x.length();
		Integer value2 = y.length();
		Integer value3 = z.length();
		Integer max = value1;
		String maximum = null;

		if (value2.compareTo(max) > 0) {
			max = value2;
		}
		if (value3.compareTo(max) > 0) {
			max = value3;
		}

		if (max == value1) {
			maximum = x;
		} else if (max == value2) {
			maximum = y;
		}
		if (max == value3) {
			maximum = z;
		}
		return maximum;
	}

	public static void main(String[] args) {
		System.out.println(" Maximum String is " + testMax("Mango", "Pineapple", "Watermelon"));
	}

}
