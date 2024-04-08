mport java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sean Merkel
 */
public class Main
{
    public static void main(String[] args)
    {
        final double conversion = 0.09290304;
        System.out.println("What is the length of the room in feet?");
        Scanner scanner = new Scanner(System.in);
        String houseLength = scanner.nextLine();
        double lengthNum = Double.parseDouble(houseLength);
        while (lengthNum < 0 || houseLength.length() < 1) {
            System.out.println("Please input a positive number.");
            houseLength = scanner.nextLine();
            lengthNum = Integer.parseInt(houseLength);
        }
        System.out.println("What is the width of the room in feet?");
        String widthLength = scanner.nextLine();
        double widthNum = Double.parseDouble(widthLength);
        while (widthNum < 0 || widthLength.length() < 1) {
            System.out.println("Please input a positive number.");
            widthLength = scanner.nextLine();
            widthNum = Integer.parseInt(widthLength);
        }
        System.out.println("You entered dimensions of " + lengthNum + " feet by " + widthNum + " feet.");
        System.out.println("The area is ");
        double theArea = lengthNum * widthNum;
        System.out.println(theArea + " square feet");
        double theFinal = theArea * conversion;
        System.out.printf("%.3f square meters", theFinal);
    }
}
