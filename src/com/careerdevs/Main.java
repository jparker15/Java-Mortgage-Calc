package com.careerdevs;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        Scanner scanner = new Scanner(System.in);


        System.out.print("What's the principal amount?: ");
        int principal = scanner.nextInt();

        if(principal < 1000 || principal > 1000000) {
            System.out.println("Please enter a principal between $1K and $1M ");
        }

        final byte months_in_years = 12;
        final byte percent = 100;

        System.out.print("Annual Interest Rate?: ");
        float annualInterestRate = scanner.nextFloat();

        if(annualInterestRate < 0 || annualInterestRate > 30 ){
            System.out.println("Enter a value greater than 0 and less  than or equal 30");
        }

        float monthInterestRate = annualInterestRate/ percent / months_in_years;
        System.out.println(monthInterestRate);

        System.out.print("Period (Years)? :");
        int years = scanner.nextInt(); //amount of monthly payments
        if(years < 0 || years > 30){
            System.out.println("Please an amount of years between 1 and 30");
        }
        int numberOfPayments = years * months_in_years;
        System.out.println(numberOfPayments);
        double mortgage = principal * (monthInterestRate * Math.pow(1 + monthInterestRate,numberOfPayments)) / Math.pow(1 + monthInterestRate,numberOfPayments) - 1;

        System.out.println("Monthly Mortgage Payment:" + mortgage);




    }
}
