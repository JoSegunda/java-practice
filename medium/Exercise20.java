/*
Running Sum
Print the running (cumulative) sum of a list of numbers.
 */

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) numbers[i] = Integer.parseInt(sc.nextLine().trim());

        // Print running sum
      	int sum = 0;
      	for (int i = 0; i < n; i++)
        {
          sum += numbers[i];
          System.out.print(sum + " ");
        }
      	
      	System.out.println();
        sc.close();
    }
}
