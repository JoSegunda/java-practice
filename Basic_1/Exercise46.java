/*
Reverse String
Reverse a string without using built-in reverse functions.

*/

import java.util.*;

public class Exercise46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        // Reverse the string without using StringBuilder.reverse()

        int strLen = s.length() - 1;

        for (int i = strLen; i >= 0; i--)
        {
          System.out.print(s.charAt(i));
        }

        System.out.println();

        sc.close();
    }
}