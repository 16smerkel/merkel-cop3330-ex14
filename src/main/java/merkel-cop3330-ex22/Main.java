import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sean Merkel
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secNum = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int thirdNum = scanner.nextInt();
        if(firstNum > secNum)
        {
            if(firstNum > thirdNum)
            {
                System.out.println("The largest number is " + firstNum + ".");
            }
            else if(thirdNum > firstNum)
            {
                System.out.println("The largest number is " + thirdNum + ".");
            }
        }
        else if(secNum > firstNum)
        {
            if(secNum > thirdNum)
            {
                System.out.println("The largest number is " + secNum + ".");
            }
            else if(thirdNum > secNum)
            {
                System.out.println("The largest number is " + thirdNum + ".");
            }
        }
        else if(thirdNum > firstNum)
        {
            if(thirdNum > secNum)
            {
                System.out.println("The largest number is " + thirdNum + ".");
            }
            else if(secNum > thirdNum)
            {
                System.out.println("The largest number is " + secNum + ".");
            }
        }
    }
}
