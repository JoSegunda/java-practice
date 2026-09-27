// Create a username and initials from a first and last name.

import java.util.Scanner;

public class Exercise15 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the firstname: ");
        String fname = sc.nextLine().trim();

        System.out.print("Enter the firstname: ");
        String lname = sc.nextLine().trim();

        String userName = fname + lname;
        String initials = "" + fname.charAt(0) + lname.charAt(0);

        System.out.println("Username: " + userName.toLowerCase());
        System.out.println("Initials: " + initials.toUpperCase());

        sc.close();
    }
}
