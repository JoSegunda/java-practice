// Convert a temperature from Celsius to Fahrenheit.

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args)    
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value in celsius: ");
        int celsius = sc.nextInt();

        double temp = celsius * 9 / 5 + 32;

        System.out.println(celsius + " Celsius = " + temp + " Fahrenheit");


        sc.close();
    }
}
