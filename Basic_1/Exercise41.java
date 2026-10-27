
/*
Star Triangle
Print a right triangle made of stars.
*/
import java.util.Scanner;
public class Exercise41 {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        // Print the star triangle
        for (int i = 1; i <= n; i++)
        {
          for (int j = 1; j <= i; j++)
          {
            System.out.print("*");
          }

          System.out.println();
        }

        sc.close();
    }
}

