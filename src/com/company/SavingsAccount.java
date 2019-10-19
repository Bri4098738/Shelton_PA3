package com.company;

import java.util.Scanner;

public class SavingsAccount
{
    static  double annualInterestRate;
    static double savingBalance;

    public static void main(String[] args)
    {
        System.out.println("What is the interest rate?");
        Scanner scnr = new Scanner(System.in);
        double rate = scnr.nextDouble();

        System.out.println("What is the savings account value?");
        savingBalance = scnr.nextDouble();

        modifyInterestRate(rate);
        for(int i=0;i<12;i++) {
            System.out.println("The balance for month " + (i+1) + " is: ");
            calculateMonthlyInterest();
        }

    }

    public static void calculateMonthlyInterest() {
        double interest = annualInterestRate * savingBalance / 12;
        savingBalance = savingBalance + interest;
        System.out.println(savingBalance);
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }
}
