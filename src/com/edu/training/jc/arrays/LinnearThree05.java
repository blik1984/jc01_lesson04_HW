package com.edu.training.jc.arrays;

/**
 * Написать программу, которая выводит на экран первые четыре степени числа e
 * (экспоненты).
 */

public class LinnearThree05 {

	public static void main(String[] args) {

		int count = 4;
		double ceil = 1;

		while (count > 0) {
			ceil = ceil * Math.E;
			System.out.println(ceil);
			count--;
		}

	}

}
