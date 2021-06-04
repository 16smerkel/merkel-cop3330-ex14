import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the order amount?");
        double theOrder = scanner.nextDouble();
        while (theOrder < 0) {
            System.out.println("Please input a positive number.");
            theOrder = scanner.nextDouble();
        }
        String theState = scanner.nextLine();
        System.out.println("What is the state?");
        String theSta2te = scanner.nextLine();
        while (theSta2te.length() < 0) {
            System.out.println("Please input a real state name.");
            theSta2te = scanner.nextLine();
        }
        double theTax = 0.055;
        if(theSta2te.equals("WI"))
        {
            System.out.println("The subtotal is $" + theOrder);
            double theFinalTax = (theOrder * theTax);
            System.out.println("The tax is $" + theFinalTax);
            double theAnswer = theFinalTax + theOrder;
            double roundDollar = Math.round(theAnswer * 100.0) / 100.0;
            String finalAnswer = String.format("$%.2f", roundDollar);
            System.out.println("The total is $" + theAnswer);
            return;
        }
        System.out.println("The total is $" + theOrder);

    }
}