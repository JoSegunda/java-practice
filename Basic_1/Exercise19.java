//Read a list of numbers and calculate their sum.
/*
Instructions
The first line of input is a count (how many numbers will follow).

The next lines each have one number.

Add all the numbers together and print the sum:
*/

import java.util.Scanner;

public class Exercise19 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many numbers will follow: ");
        int n = sc.nextInt();
        int total = 0;

        for (int i = 0; i < n; i++)
        {
            total += sc.nextInt();
        }

        System.out.println("Sum: " + total);
        sc.close();
        
    }
    
}
