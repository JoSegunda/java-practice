/*
Calculate a currency exchange from an amount and rate.

Instructions
Read an amount and an exchange rate from input.

Multiply the amount by the rate to get the result.

Print the result with two decimal places
*/

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = Double.parseDouble(sc.nextLine().trim());
        double rate = Double.parseDouble(sc.nextLine().trim());

        // Calculate and print result
        double result = amount * rate;

        System.out.printf("Result: %.2f\n", result);
    }
}
