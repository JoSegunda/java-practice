
/*
Repeat String
Read a string and a number, then print the string repeated that many times.

*/

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().trim();
        int n = Integer.parseInt(sc.nextLine().trim());

        // Print the word repeated n times
        for (int i = 0; i < n; i++)
        {
          System.out.print(word);
        }

        System.out.println();

        sc.close();
    }
}
