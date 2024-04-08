import java.util.Scanner;
import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("What is the input string?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while (name.length() < 1)
        {
            System.out.println("Please input a name.");
            Scanner scanner1 = new Scanner(System.in);
            name = scanner1.nextLine();
        }
        System.out.println(name +" has " + name.length() + " characters.");
    }

}
