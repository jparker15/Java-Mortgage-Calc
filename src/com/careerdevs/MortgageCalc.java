package com.careerdevs;

import java.util.Scanner;

public class MortgageCalc {
    static public int principal;
    static public float annualInterestRate;
    static public byte years;
    static Scanner scanner = new Scanner(System.in);

    public static void MortgageCal(){

        final byte months_in_year = 12;
        final byte percent = 100;

        System.out.println("Principal:");
        principal = scanner.nextInt();
        System.out.println("Annual Interest Rate:");
        annualInterestRate = scanner.nextFloat();
        System.out.println("Years:");
        years = scanner.nextByte();

        double monthlyIR = (annualInterestRate / percent) / months_in_year;
        int numOfPayments = (years * months_in_year);

        double monthlyMortgage = mortgagePayment(principal,monthlyIR,numOfPayments);

        System.out.println(monthlyMortgage);
    }
    static double mortgagePayment(int principal, double monthlyIR, int numOfPayments){
        double mortgage = principal
                * ( (monthlyIR * Math.pow(1 + monthlyIR,numOfPayments)) /
                (Math.pow(1 + monthlyIR, numOfPayments)) );

        return mortgage;
    }
}
