/*
Calculate a discounted price from a price and discount percentage.
*/

import java.util.Scanner;

public class Exercise26{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Price: ");
        double price = sc.nextDouble();
        
        System.out.print("Discount percentage: ");
        int discountPercent = sc.nextInt();

        double discount = price * discountPercent / 100;
        double finalPrice = price - discount;

        System.out.printf("Discount: %.2f\nFinal price: %.2f\n", discount, finalPrice);

        sc.close();
    }
}