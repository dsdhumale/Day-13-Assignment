package com.Bridgelabz.Day13;

public class GenericMethod {
	private static <E extends Comparable> E testMax(E value1, E value2, E value3) {

		E max = value1; // assume value1 is initially largest

		if (value2.compareTo(max) > 0) {
			max = value2; // vslue2 is largest so far
		}
		if (value3.compareTo(max) > 0) {
			max = value3; // value3 is largest so far
		}
		return max; // return largest element

	}

	public static void main(String[] args) {
		System.out.println("Welcome to maximum string program !");
		Integer result = GenericMethod.testMax(-10, -20, -30);
		Float result1 = GenericMethod.testMax(10.5f, 12.2f, 5.5f);
		String result2 = GenericMethod.testMax("apple", "banana", "peach");
		System.out.println("\nMaximum integer among three integer is : " + result);
		System.out.println("Maximum float among three float is : " + result1);
		System.out.println("Maximum string among three string is : " + result2);
	}

}
