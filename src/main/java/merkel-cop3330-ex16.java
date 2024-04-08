import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sean Merkel
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("What is your age?");
        Scanner scanner = new Scanner(System.in);
        int userAge = scanner.nextInt();
        if (userAge >= 16) {
            System.out.println("You are old enough to legally drive.");
        } else {
            System.out.println("You are not old enough to legally drive.");
        }
    }
}
