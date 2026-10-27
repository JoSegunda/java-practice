
/*
Positive Negative Zero
Check if a number is positive, negative, or zero.

*/

import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        // Check and print
        if (n < 0 )
        {
          System.out.println("Negative");
        }
        else if (n == 0)
        {
          System.out.println("Zero");
        }
        else
        {
          System.out.println("Positive");
        }

        sc.close();
    }
}
