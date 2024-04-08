import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 13; i++)
        {
            for(int j = 0; j < 13; j++)
            {
                int theAnswer = i * j;
                System.out.println(i + " x " + j + " = " + theAnswer);
            }
        }
    }
}
