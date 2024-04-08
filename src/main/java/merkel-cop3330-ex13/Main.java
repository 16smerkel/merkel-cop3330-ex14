import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sean Merkel
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Would you like to find the value of an investment compounded over time(end) or the initial value to start of with(initial)? Please type end or initial. ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        while (!(option.equals("initial")) || !(option.equals("end"))) {
            if (option.equals("end")) {
                System.out.println("What is the principal amount? ");
                double thePrincipal = scanner.nextDouble();
                while (thePrincipal < 0) {
                    System.out.println("Please input a positive number.");
                    thePrincipal = scanner.nextDouble();
                }
                System.out.println("What is the rate? ");
                double rateInterest = scanner.nextDouble();
                while (rateInterest < 0) {
                    System.out.println("Please input a positive number.");
                    rateInterest = scanner.nextDouble();
                }
                System.out.println("What is the number of years? ");
                double numYears = scanner.nextDouble();
                while (numYears < 0) {
                    System.out.println("Please input a positive number.");
                    numYears = scanner.nextDouble();
                }
                System.out.println("What is the number of times the interest is compounded per year?");
                double intYears = scanner.nextDouble();
                while (intYears < 0) {
                    System.out.println("Please input a positive number.");
                    intYears = scanner.nextDouble();
                }
                double theRate = rateInterest / 100;
                double stepOne = (1 + theRate / intYears);
                double stepTwo = Math.pow(stepOne, (intYears * numYears));
                double theInvestment = thePrincipal * stepTwo;
                double roundDollar = Math.round(theInvestment * 100.0) / 100.0;
                String finalInvestment = String.format("$%.2f", roundDollar);
                String finalPrincipal = String.format("$%.2f", thePrincipal);
                System.out.println(finalPrincipal + " invested at " + rateInterest + "% for " + numYears + " years compounded " + intYears + " times per year is " + finalInvestment);
                return;
            } else if (option.equals("initial")) {
                System.out.println("What is the final amount? ");
                double theFinal = scanner.nextDouble();
                while (theFinal < 0) {
                    System.out.println("Please input a positive number.");
                    theFinal = scanner.nextDouble();
                }
                System.out.println("What is the rate? ");
                double rateInterest = scanner.nextDouble();
                while (rateInterest < 0) {
                    System.out.println("Please input a positive number.");
                    rateInterest = scanner.nextDouble();
                }
                System.out.println("What is the number of years? ");
                double numYears = scanner.nextDouble();
                while (numYears < 0) {
                    System.out.println("Please input a positive number.");
                    numYears = scanner.nextDouble();
                }
                System.out.println("What is the number of times the interest is compounded per year?");
                double intYears = scanner.nextDouble();
                while (intYears < 0) {
                    System.out.println("Please input a positive number.");
                    intYears = scanner.nextDouble();
                }
                double theRate = rateInterest / 100;
                double stepOne = (1 + theRate / intYears);
                double stepTwo = Math.pow(stepOne, (intYears * numYears));
                double thePrincipal = theFinal * (1 / stepTwo);
                double roundDollar = Math.round(thePrincipal * 100.0) / 100.0;
                String finalPrincipal = String.format("$%.2f", roundDollar);
                String finalInvestment = String.format("$%.2f", theFinal);
                System.out.println(finalPrincipal + " invested at " + rateInterest + "% for " + numYears + " years compounded " + intYears + " times per year is $" + finalInvestment);
                return;
            } else {
                System.out.println("Please input either end or initial");
                option = scanner.nextLine();
            }
        }
    }
}
