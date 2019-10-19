package com.company;

public class Application {
    static double annualInterestRate;
    static double savingBalance;

    public static void main(String[] args) {
        System.out.println("Saver 1 has 2000.00\nSaver 2 has 3000.00");
        System.out.println("We will be testing with 4% interest followed by 5% interest");

        System.out.println("");

        double saver1 = 2000.00;
        double saver2 = 3000.00;

        modifyInterestRate(0.04);
        savingBalance = saver1;
        for(int i=0;i<12;i++) {
            System.out.println("The balance for month " + (i+1) + " saver 1 is: ");
            calculateMonthlyInterest();
        }
        System.out.println("");
        savingBalance = saver2;
        for(int i=0;i<12;i++) {
            System.out.println("The balance for month " + (i+1) + " saver 2 is: ");
            calculateMonthlyInterest();
        }
        System.out.println("");
        modifyInterestRate(0.05);
        savingBalance = saver1;
        for(int i=0;i<12;i++) {
            System.out.println("The balance for month " + (i+1) + " saver 1 is: ");
            calculateMonthlyInterest();
        }
        System.out.println("");
        savingBalance = saver2;
        for(int i=0;i<12;i++) {
            System.out.println("The balance for month " + (i+1) + " saver 2 is: ");
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
        System.out.println("The new interest rate is: "+annualInterestRate);
        System.out.println("");
    }
}