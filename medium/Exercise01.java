
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = Integer.parseInt(sc.nextLine().trim());

        // Check and print
        if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 100 == 0) && (year % 400 == 0)))
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }

        sc.close();
    }
}
