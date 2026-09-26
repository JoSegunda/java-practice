// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;

public class Exercise06 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int a = sc.nextInt();

        System.out.print("Enter another Number: ");
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " / " + b + " = " + (a/b));
        System.out.println(a + " x " + b + " = " + (a*b));
        System.out.println(a + " % " + b + " = " + (a%b));

        sc.close();
    }
}
