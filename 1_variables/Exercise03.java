// Write a Java program to divide two numbers and print them on the screen.

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("         Dividing two values          ");
        System.out.println("======================================");


        System.out.print("Input a value: ");
        int a = sc.nextInt();

        System.out.print("Input another value: ");
        int b = sc.nextInt();

        double result = a / b;

        System.out.println(a + " / " + b + " = " + result);
    }
}
