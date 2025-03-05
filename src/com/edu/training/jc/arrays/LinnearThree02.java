package com.edu.training.jc.arrays;

/**
 * Вычислить расстояние между центрами двух окружностей с заданными координатами
 * их центров (x1,y1) и (x2,y2).
 */

public class LinnearThree02 {

	public static void main(String[] args) {

		double X1;
		double Y1;
		double X2;
		double Y2;
		double length;

		X1 = 5.5;
		Y1 = 0;
		X2 = 9;
		Y2 = 0;

		if (X1 == Y1 && X1 == X2 && X1 == Y2) {

			System.out.println("Точки имеют одинаковые координаты, длина линии = 0");
			return;
		}

		length = Math.sqrt(Math.pow(Y1 - Y2, 2) + Math.pow(X1 - X2, 2));

		System.out.println(length);

	}

}
