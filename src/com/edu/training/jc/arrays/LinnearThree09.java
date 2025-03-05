package com.edu.training.jc.arrays;

/**
 * Дана сторона правильного четырёхугольника (квадрата). Найти его площадь,
 * диагональ и радиусы вписанной и описанной окружностей.
 */

public class LinnearThree09 {

	public static void main(String[] args) {

		double length;
		double area;
		double diagonal;
		double radiusIn;
		double radiusOut;

		length = 6;

		area = length * length;
		diagonal = Math.sqrt(area * 2);
		radiusIn = length / 2;
		radiusOut = diagonal / 2;

		System.out.println("Площадь квадрата со стороной " + length + " равна " + area + ", \nдиагональ = " + diagonal
				+ ", \nрадиус вписанной окружности = " + radiusIn + ", \nрадиус описанной окружности = " + radiusOut);

	}

}
