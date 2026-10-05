/*
Extract the individual digits of a 3-digit number.

*/

import java.util.Scanner;

public class Exercise28{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int ones = n % 10;
        n /= 10;
        
        int tens = n % 10;
        n /= 10;

        int hundreds = n % 10;
        
        System.out.println("Hundreds: " + hundreds);
        System.out.println("Tens: " + tens);
        System.out.println("Ones: " + ones);

        sc.close();
    }
}