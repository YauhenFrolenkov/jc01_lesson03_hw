package edu.training.jc.homework;

public class Calc_06 {

	public static void main(String[] args) {
		int x = 1234;
		int saveX = x;
		int res = 1;

		while (x > 0) {
			res *= x % 10;
			x /= 10;
			
		}

		System.out.println("Произведение цифр четырехзначного числа " + saveX + " = " + res);

	}

}
