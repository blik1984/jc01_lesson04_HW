package com.edu.training.jc.arrays;

/**
 * Найти сумму цифр заданного четырёхзначного числа.
 */

public class LinnearThree06 {

	public static void main(String[] args) {

		int ceil = -3990;
		int sum = 0;

		ceil = Math.abs(ceil);

		while (ceil > 0) {
			sum = sum + ceil % 10;
			ceil = ceil / 10;
		}

		System.out.println(sum);

	}

}
