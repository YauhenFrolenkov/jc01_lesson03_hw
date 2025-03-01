package edu.training.jc.homework;

public class Calc_07 {

	public static void main(String[] args) {
		double a = -2;
		double b = 4;

		double ar = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;

		double geo = Math.sqrt(Math.abs(a) * Math.abs(b));

		System.out.println("Среднее арифметическое кубов чисел " + a + " и " + b + " = " + ar);

		System.out.println("Среднее геометрическое модулей чисел " + a + " и " + b + " = " + geo);

	}

}
