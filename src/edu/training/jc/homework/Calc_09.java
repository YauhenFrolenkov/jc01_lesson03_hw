package edu.training.jc.homework;

public class Calc_09 {

	public static void main(String[] args) {
		double a = 12.5;
		
		double s = Math.sqrt(3) / 4 * Math.pow(a, 2);
		
		double h = Math.sqrt(3) / 2 * a;
		
		double rIn = a * Math.sqrt(3) / 6;
		
		double rOut = a / Math.sqrt(3);
		
		System.out.println("Площадь треугольника = " + s);
		
		System.out.println("Высота треугольника = " + h);
		
		System.out.println("Радиус вписанной окружности треугольника = " + rIn);
		
		System.out.println("Радиус описанной окружности треугольника = " + rOut);

	}

}
