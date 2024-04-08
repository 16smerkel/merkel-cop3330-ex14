import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name:");
        String curGuess = scanner.nextLine();
        int i = 1;
        String theArray[] = new String[100000];
        theArray[0] = curGuess;
        while(!curGuess.equals(" "))
        {
            System.out.println("Enter a name:");
            curGuess = scanner.nextLine();
            theArray[i] = curGuess;
            i++;
        }
        Random rand = new Random();
        int theAns = rand.nextInt(i);
        System.out.println("The winner is... " + theArray[theAns] + ".");
    }
}
