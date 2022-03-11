package com.bridgelabz.remainingprogramsJunit;

import java.util.Scanner;

public class VendingMachine {
	public static void noOfNotes(int amount)
	{
		int sum = 0;
		int notes[] = new int[]{1000, 500, 100, 50, 20, 10, 5, 2, 1};
		int noteCounter[] = new int[100];
		for (int i = 0; i < notes.length; i++) {
			if (amount >= notes[i]) {
				noteCounter[i] = amount / notes[i];
				amount = amount - noteCounter[i] * notes[i];
			}
		}
		System.out.println("List of RS notes :  ");
		for (int i = 0; i < notes.length; i++) {
			if (noteCounter[i] != 0) {
				System.out.println(notes[i]+ " ---- " +noteCounter[i]);
			}
		}    
		for(int i=0; i<noteCounter.length; i++){
			sum = sum + noteCounter[i];
		}
		System.out.println("Minimun number of notes needed is : " +sum);
	}
	public static void main(String argc[]) {
		System.out.println("Enter any Amount :  ");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		noOfNotes(amount);
		sc.close();
	}
}
