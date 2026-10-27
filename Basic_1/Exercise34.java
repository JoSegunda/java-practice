/*
Password Check
Check if a password is long enough.

*/

import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine().trim();


        // Check length and print
        if (password.length() >= 8)
        {
          System.out.println("Valid");
        }
        else
        {
          System.out.println("Invalid");
        }

        sc.close();
    }
}
