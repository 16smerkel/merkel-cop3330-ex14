import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sean Merkel
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("What is the length of the ceiling?");
        Scanner scanner = new Scanner(System.in);
        int theLen = scanner.nextInt();
        while (theLen < 0) {
            System.out.println("Please input a positive number.");
            theLen = scanner.nextInt();
        }
        System.out.println("What is the width of the ceiling?");
        int theWid = scanner.nextInt();
        while (theWid < 0) {
            System.out.println("Please input a positive number.");
            theWid = scanner.nextInt();
        }
        int theArea = theLen * theWid;
        int paintGallon = theArea / 350;
        int extraGallon = theArea % 350;
        if(extraGallon != 0)
        {
            paintGallon++;
        }
        System.out.println("You will need to purchase " + paintGallon + " gallons of paint to cover " + theArea + " square feet.");
    }
}
