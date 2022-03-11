package com.bridgelabz.remainingprogramsJunit;

import java.util.Scanner;

public class TemperatureConversion {
	static void temperatureConversion() {
		double fahrenheit, celsius;
		System.out.println("Select any one from below \n 1. Celsius to Fahrenheit  \n 2. Fahrenheit to Celsius");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch(option)
		{
		case 1:  
			System.out.println("Enter temperature in Celsius : ");
			celsius = sc.nextDouble();
			fahrenheit = ((9 * celsius) / 5) + 32;
			System.out.println("Fahrenheit temperature is = "+fahrenheit +" F");
			break;
		case 2:  
			System.out.println("Enter temperature in Fahrenheit : ");
			fahrenheit = sc.nextDouble();
			celsius = ((fahrenheit - 32) * 5 / 9);
			System.out.println("Celsius temperature is = "+celsius +" C");
			break;
		default:  System.out.println("You have selected wrong option !!!!   ");
		sc.close();
		}  		
	} 
	public static void main(String[] args) {
		temperatureConversion();
	}
}