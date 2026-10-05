/*
Split a total amount equally among a group of people.

*/

import java.util.Scanner;

public class Exercise27{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total: ");
        double total = Double.parseDouble(sc.nextLine().trim());

        System.out.print("Number of people: ");
        int people = Integer.parseInt(sc.nextLine().trim());

        double amount = total / people;

        System.out.printf("Each pays: %.2f\n", amount);
        sc.close();
    }
}