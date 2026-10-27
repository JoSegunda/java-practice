
/*
Range Checker
Check if a number falls within a given range.

*/

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine().trim());
        int low = Integer.parseInt(sc.nextLine().trim());
        int high = Integer.parseInt(sc.nextLine().trim());

        // Check and print
        if (num >= low && num <= high)
        {
          System.out.println("In range");
        }
        else
        {
          System.out.println("Out of range");
        }

        sc.close();
    }
}
