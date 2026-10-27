
/*
Countdown
Count down from a number to 1 and print Go!
*/
import java.util.Scanner;
public class Exercise38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        // Count down from n to 1
        for (int i = n; i >= 1; i--)
        {
          System.out.println(i);
        }

        // Print Go!
        System.out.println("Go!");

        sc.close();
    }
}
