/*
Collatz Steps
Count the steps to reach 1 using the Collatz sequence.
*/

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.nextLine().trim());

        // Count steps to reach 1

        int counter =  0;

        while (n != 1)
        {
          if (n % 2 == 0)
          {
            n /= 2;
          }
          else
          {
            n = (n * 3) + 1;
          }
          counter++;
        }

        System.out.println("Steps: " + counter);

        sc.close();
    }
}