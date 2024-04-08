import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int check = 0;
        int i = 0;
        int numNames = 0;
        String input = ("Ling, Mai\n" +
                "Johnson, Jim\n" +
                "Zarnecki, Sabrina\n" +
                "Jones, Chris\n" +
                "Jones, Aaron\n" +
                "Swift, Geoffrey\n" +
                "Xiong, Fong");
        while (check != 0) {
            while (input.charAt(i) != '\n') {
                i++;
                check = 1;
            }
            numNames++;
        }
        String[] theInput = new String[numNames];
        System.out.println("Enter " + i);

    }
}
