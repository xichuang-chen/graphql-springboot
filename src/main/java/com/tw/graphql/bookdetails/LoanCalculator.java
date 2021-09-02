package com.tw.graphql.bookdetails;

public class LoanCalculator {

    private static double total = 572360.92 - 650000/360 * 12;
    private static double rate = 0.05145;

    public static double calculate(int repayment) {
        double totalRemain = total - repayment * 10000;
        double average = totalRemain / 305;
        double totalRepayment = 0;

        for(int i = 0; i < 305; i++) {
            double interest = (totalRemain - average * i) * rate / 12;
            double monthRepayment = interest + average;
            if (repayment != 0) {
                System.out.println(monthRepayment);
            }
            totalRepayment += monthRepayment;
        }
        System.out.println("repay " + repayment + "wan total repayment is: " + totalRepayment);
        return totalRepayment;
    }

    public static void main(String[] args) {
        System.out.println("reduce " + (calculate(0) - calculate(10)) );
    }
}
