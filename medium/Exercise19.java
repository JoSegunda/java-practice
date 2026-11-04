/*
Second Largest
Find the second largest number in a list.
If two numbers share the highest value, the second largest is still that same value.
*/

import java.util.Scanner;

public class Exercise19 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine().trim());
    int[] numbers = new int[n];
    for (int i = 0; i < n; i++)
      numbers[i] = Integer.parseInt(sc.nextLine().trim());
    // Find and print the second largest

    int max = numbers[0], secondMax = numbers[0];
    int arrLength = numbers.length;
    for (int i = 1; i < arrLength; i++) {
      if (numbers[i] > max)

      {
        secondMax = max;
        max = numbers[i];
      }
      // if the second highest number needs to be different from th first, otherwise we can delete this
      if (numbers[i] < max && secondMax == max)
      {
        secondMax = numbers[i];
      }
    }
    System.out.println("Second largest: " + secondMax);
    sc.close();
  }

}