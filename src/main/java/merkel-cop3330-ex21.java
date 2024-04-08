import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sean Merkel
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of the month:");
        int theNum = scanner.nextInt();
        String theMonth;
        switch(theNum)
        {
            case 1:
                theMonth = "January";
                break;
            case 2:
                theMonth = "February";
                break;
            case 3:
                theMonth = "March";
                break;
            case 4:
                theMonth = "April";
                break;
            case 5:
                theMonth = "May";
                break;
            case 6:
                theMonth = "June";
                break;
            case 7:
                theMonth = "July";
                break;
            case 8:
                theMonth = "August";
                break;
            case 9:
                theMonth = "September";
                break;
            case 10:
                theMonth = "October";
                break;
            case 11:
                theMonth = "November";
                break;
            case 12:
                theMonth = "December";
                break;
            default:
                theMonth = "N/A";
        }
        System.out.println("The name of the month is " + theMonth + ".");
    }
}
