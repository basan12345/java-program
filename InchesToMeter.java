package com.java;
import java.util.Scanner;

public class InchesToMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a value of inches:");
		double inch = input.nextDouble();
		double meters = inch * 0.0254;
		System.out.println(inch + "inch is" + meters + "meters");

	}

}
