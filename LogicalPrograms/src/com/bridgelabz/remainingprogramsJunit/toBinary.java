package com.bridgelabz.remainingprogramsJunit;

import java.util.Scanner;

public class toBinary {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = obj.nextInt();

		int binary[] = convertToBinary(number);
		for (int i = 0; i<=binary.length -1; i++) {
			System.out.print(binary[i]);
		}
		obj.close();
}
	public static int[] convertToBinary(int number) {
		int binary_Number[] = new int [8];
		int index = 0;
		while(number > 0) {
			binary_Number[index++] = number % 2;
			number = number/2;
		}
		binary_Number = reverse_Binary(binary_Number);
		return binary_Number;
	}
	public static int[] reverse_Binary(int binary_Number[]) {
		for(int i = 0; i<binary_Number.length/2; i++) {
			int temp = binary_Number[i];
			binary_Number[i] = binary_Number[binary_Number.length - i - 1];
			binary_Number[binary_Number.length - i -1] = temp;
		}
		return binary_Number;
	}
}
