package com.edu.training.jc.arrays;

/**
 * Вычислить периметр и площадь прямоугольника по заданным длинам его сторон a и
 * b.
 */

public class LinnearThree01 {

	public static void main(String[] args) {

		double a;
		double b;
		double perimeter;
		double area;

		a = 3.5;
		b = 6;

		perimeter = a * 2 + b * 2;
		area = a * b;

		System.out.println(
				"Площадь прямоугольника составляет " + area + ", \nпериметр прямоугольника равна " + perimeter + ".");

	}

}
