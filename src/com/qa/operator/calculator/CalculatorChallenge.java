package com.qa.operator.calculator;

public class CalculatorChallenge {

	public static void main(String[] args) {

		System.out.println(add(5, 2));
		System.out.println(subtract(5, 2));
		System.out.println(multiply(5, 2));
		System.out.println(divide(5, 2));

	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static int subtract(int x, int y) {
		return x - y;
	}

	public static int multiply(int x, int y) {
		return x * y;
	}

	public static double divide(double x, double y) {

		if (x < y) {
			return x / y;
		} else {

			System.out.println("Division cannot be done.");
			return 0;
		}
	}

}
