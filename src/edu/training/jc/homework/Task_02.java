package edu.training.jc.homework;

public class Task_02 {

	public static void main(String[] args) {
		double x1 = 4.5;
		double y1 = 7.5;
		double x2 = 3.5;
		double y2 = 4.8;
		
		double dist = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		
		System.out.println("Расстояние между двумя точками с данными координатами " + "(" + x1 + ", " + y1 + ") и " + "(" + x2 + ", " + y2 + ") = " + dist);
		

	}

}
