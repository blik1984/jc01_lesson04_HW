package com.edu.training.jc.arrays;

/**
 * Вычислить длину дуги и площадь сектора окружности с заданным радиусом R и
 * центральным углом α (в градусах).
 */

public class LinnearThree04 {

	public static void main(String[] args) {

		double R;
		double angle;
		double proportion;
		double arcLength;
		double sectorArea;

		R = 11;
		angle = 66;

		while (angle > 360) {
			angle = angle - 360;
		}

		proportion = angle / 360;
		arcLength = 2 * Math.PI * R * proportion;
		sectorArea = Math.PI * Math.pow(R, 2) * proportion;

		System.out.println("Длина дуги = " + arcLength + ", \nплощадь сектора = " + sectorArea);

	}

}
