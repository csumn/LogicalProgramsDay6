package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) {
		StopWatch stopwatch = new StopWatch();
		stopwatch.elapsedTime();		
	}
	void elapsedTime(){
		Scanner sc = new Scanner(System.in);	
		long time1 = 0, time2 = 0;
		System.out.println("Press the \"Enter\" key twice two check the time difference between the two entries ");
		String input = sc.nextLine();
		if(input.isEmpty()) {
			time1 = System.currentTimeMillis();
		}
		input = sc.nextLine();
		if(input.isEmpty()) {
			time2 = System.currentTimeMillis();
		}
		System.out.println("Diffrence between two clicks is: " + ((int)(time2 - time1) / 1000) + " seconds.");
		sc.close();
	}
} 
