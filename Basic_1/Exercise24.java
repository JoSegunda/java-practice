/*
print a rectangle border made of stars.

Instructions
Read a width and a height from input.

Print a rectangle border using * characters.

The first and last rows are full rows of stars. The rows in between have a star at the start and end, with spaces in the middle.
*/

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = Integer.parseInt(sc.nextLine().trim());
        int height = Integer.parseInt(sc.nextLine().trim());

        // Print the rectangle border
        printWidth(width);
        
        int j = height - 2;
        int m = width - 2;

        // print height
        for (int i = 0; i < j; i++)
        {
            System.out.print("*");

            // print spaces (width)
            for (int k = 0; k < m; k++)
            {
                System.out.print(" ");
            }

            System.out.print("*");
            System.out.println();
        }

        printWidth(width);

        sc.close();
      	
    }

    static void printWidth(int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

}
