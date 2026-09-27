// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class Exercise12 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        double a = sc.nextDouble();

        System.out.print("Enter the second value: ");
        double b = sc.nextDouble();

        System.out.print("Enter the third value: ");
        double c = sc.nextDouble();

        double avg = (a + b + c) / 3;

        System.out.println("The average of the three is: " + avg);
    }
}
