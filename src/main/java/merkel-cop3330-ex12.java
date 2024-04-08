import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sean Merkel
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the principal: ");
        Scanner scanner = new Scanner(System.in);
        double thePrincipal = scanner.nextDouble();
        while (thePrincipal < 0 ) {
            System.out.println("Please input a positive number.");
            thePrincipal = scanner.nextDouble();
        }
        System.out.println("Enter the rate of interest: ");
        double rateInterest = scanner.nextDouble();
        while (rateInterest < 0 ) {
            System.out.println("Please input a positive number.");
            rateInterest = scanner.nextDouble();
        }
        System.out.println("Enter the number of years: ");
        double numYears = scanner.nextDouble();
        while (numYears < 0 ) {
            System.out.println("Please input a positive number.");
            numYears = scanner.nextDouble();
        }
        double theRate = rateInterest / 100;
        double theInvestment = thePrincipal * (1 + theRate * numYears);
        double roundDollar = Math.round(theInvestment * 100.0) / 100.0;
        String finalInvestment = String.format("$%.2f",roundDollar);
        System.out.println("After " + numYears + " at " + rateInterest + "%, the investment will be worth " + finalInvestment);
    }
}
