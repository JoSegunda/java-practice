/*
Longest Streak
Find the longest consecutive streak of the same number.
*/

import java.util.Scanner;									

public class Exercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) numbers[i] = Integer.parseInt(sc.nextLine().trim());

        // Find longest streak and print
        int longest = 0;
        int arrLength = numbers.length;
        for (int i = 0; i < arrLength; i++)
        {
            int active = numbers[i];
            int counter = 0;
            
            for (int j = i; j < arrLength; j++)
            {
                if (numbers[j] == active)
                {
                  counter++;
                } 
                else
                {
                  break;
                }
            }

            if (counter > longest)
            {
              longest = counter;
            }
        }

        System.out.println("Longest streak: " + longest);

        sc.close();
    }
}
