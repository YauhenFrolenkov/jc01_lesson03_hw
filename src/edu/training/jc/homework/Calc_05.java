package edu.training.jc.homework;

public class Calc_05 {

	public static void main(String[] args) {
		double P = Math.PI;
		
		for (int i = 1; i <= 4; i++) {
			double res = Math.pow(P, i);
			System.out.println("Пи в степени " + i + " = " + res);
		}

	}

}
