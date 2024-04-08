import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sean Merkel
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For the following questions type y for Yes or n for no.");
        System.out.println("Is the car silent when you turn the key?");
        String firstQue = scanner.nextLine();
        if(firstQue.equals("y"))
        {
            System.out.println("Are the battery terminals corroded?");
            String secQue = scanner.nextLine();
            if(secQue.equals("y"))
            {
                System.out.println("Clean terminals and try starting again.");
            }
            else
            {
                System.out.println("Replace cables and try again.");
            }
            return;
        }
        else
        {
            System.out.println("Does the car make a slicking noise?");
            String secQue = scanner.nextLine();
            if(secQue.equals("y"))
            {
                System.out.println("Replace the battery.");
            }
            else
            {
                System.out.println("Does the car crank up but fail to start?");
                String thirdQue = scanner.nextLine();
                if(thirdQue.equals("y"))
                {
                    System.out.println("Check spark plug connections.");
                }
                else
                {
                    System.out.println("Does the engine start and then die?");
                    String fourthQue = scanner.nextLine();
                    if(fourthQue.equals("y"))
                    {
                        System.out.println("Does you car have fuel injection?");
                        String fifthQue = scanner.nextLine();
                        if(fifthQue.equals("y"))
                        {
                            System.out.println("Get it in for service.");
                            return;
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }

    }
}
