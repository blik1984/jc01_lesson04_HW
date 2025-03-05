package com.edu.training.jc.arrays;

/**
 * Даны два числа. Найти среднее арифметическое их квадратов и среднее
 * геометрическое их модулей.
 */

public class LinnearThree07 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double sum;
		double medium;

		a = 6;
		b = -15;

		sum = (Math.pow(a, 2) + Math.pow(b, 2)) / 2;
		medium = Math.sqrt(Math.abs(a * b));

		System.out.println(sum);
		System.out.println(medium);
	}

}
