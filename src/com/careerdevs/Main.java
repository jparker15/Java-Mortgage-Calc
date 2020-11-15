package com.careerdevs;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principal;
        float monthInterestRate;
        int numberOfPayments;
        int years;

        while(true){
            System.out.print("What's the principal amount?: ");
            principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 1_000_000) {
                break;
            }
                System.out.println("Please enter a principal between $1K and $1M ");

        }


        final byte months_in_years = 12;
        final byte percent = 100;

        while(true){
            System.out.print("Annual Interest Rate?: ");
            float annualInterestRate = scanner.nextFloat();

            if(annualInterestRate >= 1 && annualInterestRate <= 30 ){
                monthInterestRate = annualInterestRate/ percent / months_in_years;
                System.out.println(monthInterestRate);
                break;
            }
            System.out.println("Enter a value greater than 0 and less  than or equal 30");
        }



        while(true){

            System.out.print("Period (Years)? :");
            years = scanner.nextInt(); //amount of monthly payments
            if(years >= 1 & years <= 30){
                numberOfPayments = years * months_in_years;
                System.out.println(numberOfPayments);

                break;
            }
            System.out.println("Please an amount of years between 1 and 30");

        }
        double mortgage = principal * (monthInterestRate * Math.pow(1 + monthInterestRate, numberOfPayments)) / Math.pow(1 + monthInterestRate, numberOfPayments) - 1;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Monthly Mortgage Payment:" + currency.format(mortgage));

    }
}
