package edu.training.jc.homework;

public class Task_03 {

	public static void main(String[] args) {
		double x1 = 1.5;
		double y1 = 2.5;
		double x2 = 4.5;
		double y2 = 6.5;
		double x3 = 14.5;
		double y3 = 3.4;

		double a = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double b = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
		double c = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));

		if (a + b > c && a + c > b && b + c > a) {

			double p = a + b + c;
			double sP = p / 2;
			double s = Math.sqrt(sP * (sP - a) * (sP - b) * (sP - c));

			System.out.println("Периметр треугольника = " + p);
			System.out.println("Площадь треугольника = " + s);
		} else {
			System.out.println("Треугольник не существует");
		}
	}

}
