package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
	public static void perfect() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		int sum=0;
		  for(int i = 1; i < number; i++)
	      {
	          if(number % i == 0)
	          {
	              sum = sum + i;
	          }
	      }
	      if(sum == number)
	      {
	          System.out.println("Its a Perfect Number ");
	      }
	      else
	      {
	          System.out.println("Its not a Perfect Number ..... ");
	      }    
	      sc.close();
	}
	public static void main(String[] args) {
		perfect();
	}
}
