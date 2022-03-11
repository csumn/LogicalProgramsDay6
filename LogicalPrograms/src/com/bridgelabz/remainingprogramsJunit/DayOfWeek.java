package com.bridgelabz.remainingprogramsJunit;

public class DayOfWeek {
	static void dayOfWeek(int date, int month, int year) {
		int Y = year - (14 - month) / 12;
		int X = Y + Y / 4 - Y / 100 + Y / 400;
		int M = month + 12 * ((14 - month) / 12) - 2;
		int D = (date + X + 31 * M / 12) % 7;
		System.out.println("The day is : "+D);
	}
	public static void main(String[] args) {
		int date = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		dayOfWeek(date, month, year);
	}
}