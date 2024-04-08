import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sean Merkel
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the price of item 1: ");
        Scanner scanner = new Scanner(System.in);
        String firstItem = scanner.nextLine();
        double firstNum = Double.parseDouble(firstItem);
        while (firstNum < 0 || firstItem.length() < 1) {
            System.out.println("Please input a positive number.");
            firstItem = scanner.nextLine();
            firstNum = Integer.parseInt(firstItem);
        }
        System.out.println("Enter the quantity of item 1:");
        String firstQuantity = scanner.nextLine();
        double firstQuantityNum = Double.parseDouble(firstQuantity);
        while (firstQuantityNum < 0 || firstQuantity.length() < 1) {
            System.out.println("Please input a positive number.");
            firstQuantity = scanner.nextLine();
            firstQuantityNum = Integer.parseInt(firstQuantity);
        }
        System.out.println("Enter the price of item 2: ");
        String secItem = scanner.nextLine();
        double secNum = Double.parseDouble(secItem);
        while (secNum < 0 || secItem.length() < 1) {
            System.out.println("Please input a positive number.");
            secItem = scanner.nextLine();
            secNum = Integer.parseInt(secItem);
        }
        System.out.println("Enter the quantity of item 2:");
        String secQuantity = scanner.nextLine();
        double secQuantityNum = Double.parseDouble(secQuantity);
        while (secQuantityNum < 0 || secQuantity.length() < 1) {
            System.out.println("Please input a positive number.");
            secQuantity = scanner.nextLine();
            secQuantityNum = Integer.parseInt(secQuantity);
        }
        System.out.println("Enter the price of item 3: ");
        String thirdItem = scanner.nextLine();
        double thirdNum = Double.parseDouble(thirdItem);
        while (thirdNum < 0 || thirdItem.length() < 1) {
            System.out.println("Please input a positive number.");
            thirdItem = scanner.nextLine();
            thirdNum = Integer.parseInt(thirdItem);
        }
        System.out.println("Enter the quantity of item 3:");
        String thirdQuantity = scanner.nextLine();
        double thirdQuantityNum = Double.parseDouble(thirdQuantity);
        while (thirdQuantityNum < 0 || thirdQuantity.length() < 1) {
            System.out.println("Please input a positive number.");
            thirdQuantity = scanner.nextLine();
            thirdQuantityNum = Integer.parseInt(thirdQuantity);
        }
        double theFirst = firstNum * firstQuantityNum;
        double theSec = secNum * secQuantityNum;
        double theThird = thirdNum * thirdQuantityNum;
        double subTotal = theFirst + theSec + theThird;
        double theTax = subTotal * 0.055;
        double theTotal = subTotal + theTax;
        String finalSubTotal = String.format("%.2f",subTotal);
        String theFinalTax = String.format("%.2f",theTax);
        String theFinalTotal = String.format("%.2f",theTotal);
        System.out.println("Subtotal: " + finalSubTotal);
        System.out.println("Tax: " + theFinalTax);
        System.out.println("Total: " + theFinalTotal);
    }
}
