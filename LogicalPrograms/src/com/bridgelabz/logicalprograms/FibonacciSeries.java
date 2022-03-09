package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void fibinacci(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : " );
		int num = sc.nextInt();
		int a = 0, b = 1, fib=0;
		System.out.println("0");
		System.out.println("1");
		for(int i=2;i<num;i++) {
			fib = a + b;
			System.out.println(fib);
			a = b;
			b = fib;
		}sc.close();
	}
	public static void main(String[] args) {
		fibinacci();
	}
}
