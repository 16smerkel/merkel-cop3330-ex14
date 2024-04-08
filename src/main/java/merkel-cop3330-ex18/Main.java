import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sean Merkel
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.println("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        while (!option.equals("c") && !option.equals("C") && !option.equals("f") && !option.equals("F")) {
            System.out.println("Please enter either C or F");
            option = scanner.nextLine();
        }
        if (option.equals("c") || option.equals("C")) {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            double theFah = scanner.nextDouble();
            double theCel = ((theFah - 32) * 5 / 9);
            System.out.println("The temperature in Celsius is " + theCel);

        } else if (option.equals("f") || option.equals("F")) {
            System.out.println("Please enter the temperature in Celsius: ");
            double theCel = scanner.nextDouble();
            double theFah = ((theCel * 9 / 5) + 32);
            System.out.println("The temperature in Fahrenheit is " + theFah);

        }
    }
}
