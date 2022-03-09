package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class CouponNumber {
	public static int getCoupon() {
		return((int)(Math.random()*9000)+1000);
	}
	public static void check(int n) {
		String str = "";  
		int count=1;
		while(count<=n) {
			String str1 = ""+getCoupon();
			if(str.contains(str1)) {
				System.out.println("Coupon already exist  ");
			}
			else 
				str=str+str1;
			count++;
			System.out.println(str1);
			System.out.println("   ");
			System.out.println("Updated to " +str);
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the numbers of coupons required");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		check(number);
		sc.close();
	} 
}
