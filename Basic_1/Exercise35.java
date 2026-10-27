
/*
Ticket Price
Determine the ticket type and price based on age.

*/

import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine().trim());

        // Determine ticket type and price

        // Print results
        if (age < 12)
        {
            System.out.println("Child\n$5");
        }
        else if (age >= 12 && age <= 64)
        {
          System.out.println("Adult\n$15");
        }
        else
        {
          System.out.println("Senior\n$8");
        }

        sc.close();
    }
}
