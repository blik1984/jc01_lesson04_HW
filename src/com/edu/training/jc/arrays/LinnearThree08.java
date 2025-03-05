package com.edu.training.jc.arrays;

/**
 * Дана длина стороны правильного шестигранника. Найти его периметр, площадь и
 * объём правильной призмы на его основе с заданной высотой.
 */

public class LinnearThree08 {

	public static void main(String[] args) {

		double length;
		double height;
		double perimeter;
		double area;
		double valuePrism;

		length = 5.5;
		height = 3;

		perimeter = length * 6;
		area = (3.0 * Math.cbrt(3.0 * length * length)) / 2.0;
		valuePrism = area * height;

		System.out.println("Периметр = " + perimeter + " ,\nплощадь = " + area + " ,\nобъём призмы = " + valuePrism);

	}

}
