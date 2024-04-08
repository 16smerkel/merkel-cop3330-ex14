import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sean Merkel
 */
public class Main
{
    public static void main(String[] args) {
        /*
        How many people? 8
        How many pizzas do you have? 2
        How many slices per pizza? 8
        8 people with 2 pizzas (16 slices)
        Each person gets 2 pieces of pizza.
            There are 0 leftover pieces.

         */
        System.out.println("How many people?");
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        while (people < 0) {
            System.out.println("Please input a positive number.");
            people = scanner.nextInt();
        }
        System.out.println("How many pizzas do you have?");
        int pizza = scanner.nextInt();
        while (pizza < 0) {
            System.out.println("Please input a positive number.");
            pizza = scanner.nextInt();
        }
        System.out.println("How many slices per pizza?");
        int slices = scanner.nextInt();
        while (slices < 0) {
            System.out.println("Please input a positive number.");
            slices = scanner.nextInt();
        }
        int totalSlices = pizza * slices;
        int eachSlice = totalSlices / people;
        int leftover = totalSlices % people;
        if (pizza == 1 || eachSlice > 1) {
            System.out.println(people + " people with " + pizza + " pizza (" + totalSlices + " slices)");
            System.out.println("Each person gets " + eachSlice + " pieces of pizza");
        } else if (pizza == 1 || eachSlice == 1) {
            System.out.println(people + " people with " + pizza + " pizza (" + totalSlices + " slices)");
            System.out.println("Each person gets " + eachSlice + " piece of pizza");
        } else if (pizza > 1 || eachSlice > 1) {
            System.out.println(people + " people with " + pizza + " pizzas (" + totalSlices + " slice)");
            System.out.println("Each person gets " + eachSlice + " pieces of pizza");
        } else {
            System.out.println(people + " people with " + pizza + " pizzas (" + totalSlices + " slices)");
            System.out.println("Each person gets " + eachSlice + " pieces of pizza");
        }
        if (leftover == 1) {
            System.out.println("There is " + leftover + " leftover piece.");
        }
        else{
            System.out.println("There are " + leftover + " leftover pieces.");
        }
    }
}
