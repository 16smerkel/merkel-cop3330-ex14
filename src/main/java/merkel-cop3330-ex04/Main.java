import java.util.Scanner;
import java.io.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sean Merkel
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Enter a noun: ");
        Scanner scanner = new Scanner(System.in);
        String noun = scanner.nextLine();
        while (noun.length() < 1)
        {
            System.out.println("Please input a noun.");
            noun = scanner.nextLine();
        }
        System.out.println("Enter a verb: ");
        String verb = scanner.nextLine();
        while (verb.length() < 1)
        {
            System.out.println("Please input a verb.");
            verb = scanner.nextLine();
        }
        System.out.println("Enter an adjective: ");
        String adjective = scanner.nextLine();
        while (adjective.length() < 1)
        {
            System.out.println("Please input an adjective.");
            adjective = scanner.nextLine();
        }
        System.out.println("Enter an adverb: ");
        String adverb = scanner.nextLine();
        while (adverb.length() < 1)
        {
            System.out.println("Please input an adverb.");
            adverb = scanner.nextLine();
        }
        System.out.println("Enter a country: ");
        String country = scanner.nextLine();
        while (country.length() < 1)
        {
            System.out.println("Please input a country.");
            country = scanner.nextLine();
        }
        System.out.println("Enter a weather condition: ");
        String weather = scanner.nextLine();
        while (weather.length() < 1)
        {
            System.out.println("Please input a weather condition.");
            weather = scanner.nextLine();
        }
        System.out.println("Is it currently " + weather + " outside? yes or no?");
        String decision = scanner.nextLine();
        while (decision.length() < 1 || !decision.equals("yes") && !decision.equals("no"))
        {
            System.out.println("Please input input either yes or no");
            decision = scanner.nextLine();
        }
        if(decision.equals("yes"))
        {
            System.out.println("Even though it is " + weather + " in " + country + " right now, you still have to " + verb + " your " + adjective + " " + noun + " " + adverb +". What a crazy world!");
        }
        else
        {
            System.out.println("The " + adjective + " weatherman said that there would be no " + weather + " in " + country + ". You still have to " + verb + " your " + noun + " " + adverb + ". What a crazy world!");
        }

    }
}
