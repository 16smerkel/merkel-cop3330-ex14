import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] employees = {"John Smith","Jackie Jackson","Chris Jones", "Amanda Cullen","Jeremy Goodwin"};
        int len = employees.length;
        System.out.println("There are " + len + " employees:");
        for(int i = 0; i < employees.length;i++)
        {
            System.out.println(employees[i]);
        }
        System.out.println("Enter an employee name to remove:");
        String theRemove = scanner.nextLine();
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i].equals(theRemove))
            {
                employees[i] = null;
                len--;
                break;

            }
        }
        System.out.println("There are " + len + " employees:");
        for(int i = 0; i < employees.length;i++)
        {
            if(employees[i] == null)
            {
                continue;
            }
            else {
                System.out.println(employees[i]);
            }
        }
    }
}
