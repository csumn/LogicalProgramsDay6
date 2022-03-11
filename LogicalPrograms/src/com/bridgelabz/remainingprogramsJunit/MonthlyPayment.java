package com.bridgelabz.remainingprogramsJunit;

public class MonthlyPayment {
	
	private static void monthlyPayment(double loan_Amount, double years, double rate_Of_Intrest) {
		double n = 12 * years;
		double r = rate_Of_Intrest /(12*100);
		double monthly_payment = ((loan_Amount * rate_Of_Intrest)/1 - (Math.pow(1+r, (-n))));
		System.out.println(monthly_payment);
	}
	public static void main(String[] args) {
		double loan_Amount = Double.parseDouble(args[0]);
		double years = Double.parseDouble(args[1]);
		double rate_Of_Intrest = Double.parseDouble(args[2]);
		monthlyPayment(loan_Amount, years, rate_Of_Intrest);		}
}
