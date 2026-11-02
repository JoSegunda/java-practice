/*
Number Pyramid
Print a pyramid of numbers.
*/

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        // Print the number pyramid

        for (int i = 1; i <= n; i++)
        {
          for (int j = 1; j <= i; j++)
          {
            System.out.print(j +" ");
          }
          System.out.println();
        }

        sc.close();
    }
}