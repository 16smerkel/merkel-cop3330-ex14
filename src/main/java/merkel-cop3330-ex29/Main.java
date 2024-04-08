import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the rate of return?");
        String theReturn = scanner.nextLine();
        for (int i = 0; i < theReturn.length(); i++) {
            char theOne = theReturn.charAt(i);
            if(theOne == '0' && i == 0)
            {
                System.out.println("Sorry. That's not a valid input.");
                return;
            }
            if (Character.isAlphabetic(theOne)) {
                System.out.println("Sorry. That's not a valid input.");
                return;
            }
        }
        int theRate = Integer.parseInt(theReturn);
        theRate = 72/theRate;
        System.out.println("It will take " + theRate + " years to double your initial investment.");
    }
}
