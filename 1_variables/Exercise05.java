//Write a Java program that takes two numbers as input and displays the product of two numbers.

import java.util.Scanner;

public class Exercise05
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int a = sc.nextInt();

        System.out.print("Enter another Number: ");
        int b = sc.nextInt();

        int result = a * b;

        System.out.println(a + " x " + b + " = " + result);
    }
}