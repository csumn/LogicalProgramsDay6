package com.bridgelabz.remainingprogramsJunit;

import java.util.Scanner;

public class SquareRoot {
	 public static void main(String args[]) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a non-negative number : ");
	    	int number = input.nextInt();
	        input.close();
	    	sqrt(number);
	    }

	    public static void sqrt(int number) {
	        double epsilon = 1e-15;
	        double t = number;
	        double root;
	        while (true) {     
	            root = 0.5 * (t + (number / t));
	     
	            if (Math.abs(root - t) < epsilon)
	                break;
	            t = root;
	        }
	        System.out.println("Root : " + root);
	    }
}
