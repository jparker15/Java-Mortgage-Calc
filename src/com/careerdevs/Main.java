package com.careerdevs;


public class Main {


    public static void main(String[] args) {

//        MortgageCalc.MortgageCal();

    }
}
class Calculator{

    int power(int n , int p) throws Exception{

        if (n < 0 || p < 0){
            throw new Exception("n and p should be non-negative");
        }

        int calc = (int) Math.pow(n,p);

        return calc;
    }
}
 