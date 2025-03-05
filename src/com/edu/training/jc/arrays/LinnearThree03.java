package com.edu.training.jc.arrays;

/**
 * Даны координаты трёх вершин прямоугольного треугольника (x1,y1), (x2,y2),
 * (x3,y3). Найти длины его катетов и гипотенузы.
 */

public class LinnearThree03 {

	public static void main(String[] args) {

		double X1;
		double Y1;
		double X2;
		double Y2;
		double X3;
		double Y3;
		double lengthAB;
		double lengthBC;
		double lengthCA;

		X1 = 19.5;
		Y1 = 0;
		X2 = 5.5;
		Y2 = -15;
		X3 = 5.5;
		Y3 = 0; // пердполагаем что треугольник точно будет прямоугольным
				// иначе алгоритм определения где катеты, а где гипотенуза не имеют смысла и
				// работают неверно

		if (X1 == Y1 && X1 == X2 && X1 == Y2) {

			lengthAB = 0;

		} else {
			lengthAB = Math.sqrt(Math.pow(Y1 - Y2, 2) + Math.pow(X1 - X2, 2));

		}
		if (X2 == Y2 && X2 == X3 && X2 == Y3) {

			lengthBC = 0;

		} else {
			lengthBC = Math.sqrt(Math.pow(Y2 - Y3, 2) + Math.pow(X2 - X3, 2));

		}
		if (X3 == Y3 && X3 == X1 && X3 == Y1) {

			lengthCA = 0;

		} else {
			lengthCA = Math.sqrt(Math.pow(Y3 - Y1, 2) + Math.pow(X3 - X1, 2));

		}

		System.out.println(lengthAB + ", " + lengthBC + ", " + lengthCA);

		if (lengthAB > lengthBC && lengthAB > lengthCA) {
			System.out.println("Катеты треугольника равны " + lengthBC + " и " + lengthCA
					+ ", гипотенуза треугольника равна " + lengthAB + ".");
		} else if (lengthBC > lengthAB && lengthBC > lengthCA) {
			System.out.println("Катеты треугольника равны " + lengthAB + " и " + lengthCA
					+ ", гипотенуза треугольника равна " + lengthBC + ".");
		} else {
			System.out.println("Катеты треугольника равны " + lengthAB + " и " + lengthBC
					+ ", гипотенуза треугольника равна " + lengthCA + ".");

		}

	}

}
