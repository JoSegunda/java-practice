// Check if a number is even or odd.

import java.util.Scanner;

public class Exercise14 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int n = sc.nextInt();

        if (n % 2 == 0) 
        {
            System.out.println("Even");    
        }
        else
        {
            System.out.println("Odd");
        }

        sc.close();
    }
}
