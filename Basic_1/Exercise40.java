
/*
Sum 1 to N
Calculate the sum of all numbers from 1 to N.
*/
import java.util.Scanner;
public class Exercise40 {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine().trim());
      // Calculate and print the sum
      int totalSUm = 0;
      for (int i = 0; i <= n; i++)
      {
        totalSUm += i;
      }
      System.out.println("Sum: " + totalSUm);

      sc.close();
    }
}
