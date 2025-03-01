package edu.training.jc.homework;

public class Calc_08 {

	public static void main(String[] args) {
		double a = 8;

		double sG = Math.pow(a, 2);

		double sP = 6 * sG;

		double V = Math.pow(a, 3);

		System.out.println("Площадь грани куба " + sG);

		System.out.println("Площадь полной поверхности куба " + sP);

		System.out.println("Объем этого куба " + V);

	}

}
