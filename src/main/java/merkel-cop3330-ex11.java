import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sean Merkel
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("How many euros are you exchanging?");
        Scanner scanner = new Scanner(System.in);
        double theEuro = scanner.nextDouble();
        while (theEuro < 0 ) {
            System.out.println("Please input a positive number.");
            theEuro = scanner.nextDouble();
        }
        System.out.println("What is the exchange rate?");
        double theExchange = scanner.nextDouble();
        while (theExchange < 0 ) {
            System.out.println("Please input a positive number.");
            theExchange = scanner.nextDouble();
        }
        double usaRate = 100;
        double theDollar = (theEuro * theExchange)/usaRate;
        double roundDollar = Math.round(theDollar * 100.0) / 100.0;
        System.out.println(theEuro + " euros at an exchange rate of " + theExchange + " is");
        System.out.println(roundDollar + " U.S. dollars.");
    }
}
