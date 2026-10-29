/*
Triangle Classifier
Classify a triangle based on its side lengths.
*/

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine().trim());
        int b = Integer.parseInt(sc.nextLine().trim());
        int c = Integer.parseInt(sc.nextLine().trim());

        // Classify and print
        if ((a + b) > c)
      {
          if (a == b && c == b)
          {
            System.out.println("Equilateral");
          }
          else if (a == b || a == c || b == c)
          {
            System.out.println("Isosceles");
          }
          else
          {
            System.out.println("Scalene");
          }
      }
      else
      {
        System.out.println("Not a Triangle");
      }

        sc.close();
    }
}