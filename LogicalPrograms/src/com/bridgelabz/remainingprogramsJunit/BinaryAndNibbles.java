package com.bridgelabz.remainingprogramsJunit;

import java.util.Scanner;

public class BinaryAndNibbles {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = obj.nextInt();
		int binary[] = convertToBinary(number);
		System.out.println("Binary representation of given Number is  ");

		for (int i = 0; i<=binary.length -1; i++) {
			System.out.println(binary[i]);
		}
		obj.close();
		System.out.println(" ");
		System.out.println("Binary representation after Swapping is  ");
		int swapped_binary[] = swapToBinary(binary);

		for (int i = 0; i<=swapped_binary.length-1; i++) {
			System.out.println(swapped_binary[i]);
		}

		int decimal_number = covertToDecimal(swapped_binary);
		System.out.println("Decimal Number of Swapped Nibble is " +decimal_number);
	}
	private static int covertToDecimal(int[] swapped_binary) {
		int decimal =0;
		swapped_binary = reverse_Binary(swapped_binary);
		for (int i = 0; i<=swapped_binary.length-1;i++) {
			decimal = (int) (decimal +(swapped_binary[i] * Math.pow(2, i)));
		}
		return decimal;
	}

	private static int[] swapToBinary(int binary[]) {
		int swap_Number [] = new int[binary.length];
		for (int j = 0; j< binary.length-1; j++) {
			if(j<binary.length/2)
				swap_Number[j]= binary[(binary.length/2 + j)];
			else if(j< binary.length)
				swap_Number[j] = binary[j-(binary.length)/2];
		}
		return swap_Number;
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

