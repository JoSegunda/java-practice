
/*
Count Matches
Count how many numbers in a list match a target value.
*/
import java.util.Scanner;

public class Exercise44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) numbers[i] = Integer.parseInt(sc.nextLine().trim());
        int target = Integer.parseInt(sc.nextLine().trim());

        // Count and print
        int count = 0;
        for (int number : numbers)
        {
          if (number == target)
          {
            count++;
          }
        }

        System.out.println("Count: " + count);

        sc.close();
    }

}
