package com.edu.training.jc.arrays;

/**
 * Известен радиус шара. Найти его объем и площадь поверхности.
 */

public class LinnearThree10 {

	public static void main(String[] args) {

		double R;
		double value;
		double area;

		R = 5;

		value = 4.0 / 3.0 * Math.PI * Math.pow(R, 3);
		area = 4.0 * Math.PI * Math.pow(R, 2);

		System.out.println("Объём шара = " + value + ", \nплошадь сферы = " + area);

	}

}
