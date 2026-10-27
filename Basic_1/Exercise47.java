/*
Sum of Digits
Calculate the sum of all digits in a given number.
*/

import java.util.*;

public class Exercise47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        // Calculate the sum of digits
        int counter = 1;
        int sum = 0;

        while (counter != 0)
        {
          sum += n % 10;
          n /= 10;
          counter = n;
        }

        System.out.println(sum);

        sc.close();
    }
}