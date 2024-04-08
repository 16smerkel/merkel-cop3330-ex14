import java.util.Scanner;
import java.io.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sean Merkel
 */
public class Main
{
    public static void main(String[] args) {
        System.out.println("What is the first number?");
        Scanner scanner = new Scanner(System.in);
        String firstNum = scanner.nextLine();
        int firstInt = Integer.parseInt(firstNum);
        while (firstInt < 0 || firstNum.length() < 1)
        {
            System.out.println("Please input a positive number.");
            firstNum = scanner.nextLine();
            firstInt = Integer.parseInt(firstNum);
        }
        System.out.println("What is the second number?");
        String secNum = scanner.nextLine();
        int secInt = Integer.parseInt(secNum);
        while (secInt < 0 || secNum.length() < 1)
        {
            System.out.println("Please input a positive number.");
            secNum = scanner.nextLine();
            secInt = Integer.parseInt(secNum);
        }
        int sum = (firstInt + secInt);
        int difference = (firstInt - secInt);
        int product = (firstInt * secInt);
        int quotient = (firstInt / secInt);
        System.out.println(firstNum + " + " + secNum + " = " + sum);
        System.out.println(firstNum + " - " + secNum + " = " + difference);
        System.out.println(firstNum + " * " + secNum + " = " + product);
        System.out.println(firstNum + " / " + secNum + " = " + quotient);


        //10 + 5 = 15
        //10 - 5 = 5
        //10 * 5 = 50
        //10 / 5 = 2
    }
}
