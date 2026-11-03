
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        // Reverse and print
      
      int s = n, counter = 1;
      int numb = 0;
      
      // loop to get the number of digits (counter)
      while (s != 0)
      {
        counter = counter*10;
        s /= 10;
      }

      // Decrease counter because the value will always be 10 times more
      counter /= 10;
      
      // loop to get the numbers in reverse
      while (n != 0)
      {
        // take the last number and multiply it by the number of the digits
        numb += (n % 10) * counter;

        // remove the last number
        n /= 10;

        // Decrease the counter corresponding to the number ofdigits
        counter /= 10;
      }
      
      System.out.println(numb);

      sc.close();
    }
}