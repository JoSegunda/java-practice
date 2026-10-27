
/*
Min and Max
Find the smallest and largest numbers in a list.
*/
import java.util.Scanner;

public class Exercise45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) numbers[i] = Integer.parseInt(sc.nextLine().trim());

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < n; i++)
        {
          if (min > numbers[i])
          {
            min = numbers[i];
          }

          if (max < numbers[i])
          {
            max = numbers[i];
          }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        sc.close();
    }

}
