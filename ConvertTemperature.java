package com.java;

public class ConvertTemperature {

	public static void main(String[] args) {
		// Fahrenheit to celcius
		
		double fahrenheit = 50.0, celcius = 0.0;
		
		celcius = (fahrenheit - 32) / 1.8;
		
		System.out.println("Value of temperature ion celcius:" + celcius);

	}

}
