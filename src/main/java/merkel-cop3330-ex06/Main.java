import java.util.Scanner;
import java.io.*;
import java.util.Date;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sean Merkel
 */
public class Main
{
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int curYear = cal.get(Calendar.YEAR);
        System.out.println("What is your current age?");
        Scanner scanner = new Scanner(System.in);
        String age = scanner.nextLine();
        int numAge = Integer.parseInt(age);
        while (numAge < 0 || age.length() < 1) {
            System.out.println("Please input a positive number.");
            age = scanner.nextLine();
            numAge = Integer.parseInt(age);
        }
        System.out.println("At what age would you like to retire?");
        String retire = scanner.nextLine();
        int retireAge = Integer.parseInt(retire);
        while (retireAge < 0 || retire.length() < 1) {
            System.out.println("Please input a positive number.");
            retire = scanner.nextLine();
            retireAge = Integer.parseInt(retire);
        }
        int retireTime = retireAge - numAge;
        int retireYear = retireTime + curYear;
        if (retireTime < 0) {
            System.out.println("You can already retire.");
        } else {
            System.out.println("You have " + retireTime + " years left until you can retire.");
            System.out.println("It's " + curYear + ", so you can retire in " + retireYear);
        }
    }
}
