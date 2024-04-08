import java.util.Scanner;
/*
Ask for number -> add number with the total -> repeat |
         <--------------------------------------------|
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int theNum = scanner.nextInt();
            total = total + theNum;
        }
        System.out.println("The total is " + total);
    }
}
