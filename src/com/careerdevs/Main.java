package com.careerdevs;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        Scanner scanner = new Scanner(System.in);


        System.out.print("What's the principal amount?: ");
        int principal = scanner.nextInt();

        final byte months_in_years = 12;
        final byte percent = 100;

        System.out.print("Annual Interest Rate?: ");
        float annualInterestRate = scanner.nextFloat();

        float monthInterestRate = annualInterestRate/ percent / months_in_years;
        System.out.println(monthInterestRate);

        System.out.print("Period (Years)? :");
        int years = scanner.nextInt(); //amount of monthly payments
        int numberOfPayments = years * months_in_years;
        System.out.println(numberOfPayments);
        double mortgage = principal * (monthInterestRate * Math.pow(1 + monthInterestRate,numberOfPayments)) / Math.pow(1 + monthInterestRate,numberOfPayments) - 1;

        System.out.println("Monthly Mortgage Payment:" + mortgage);




    }
}
