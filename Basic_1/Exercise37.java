
/*
Smallest of Three
Find the smallest of three numbers.

*/

import java.util.Scanner;

public class Exercise37 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.nextLine().trim());
    int b = Integer.parseInt(sc.nextLine().trim());
    int c = Integer.parseInt(sc.nextLine().trim());

    // Find and print the smallest
    if ((a < b) && (a < c))
    {
      System.out.println("Smallest: " + a);
    }
    else if ((b < a) && (b < c))
    {
      System.out.println("Smallest: " + b);
    }
    else
    {
      System.out.println("Smallest: " + c);
    }

    sc.close();
  }
}
