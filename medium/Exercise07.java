/*
Count Vowels
Count the number of vowels in a string.
*/

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().trim().toLowerCase();

        // Count vowels and print
        int count = 0;

        int wordLength = text.length();
        String tempChar;
        for (int i = 0; i < wordLength; i++)
        {
            tempChar = String.valueOf(text.charAt(i));

            if (tempChar.equals("a") || tempChar.equals("e") || tempChar.equals("i") || tempChar.equals("o") || tempChar.equals("u"))
            {
                count++;    
            }

        }
        System.out.println("Vowels: " + count);

        sc.close();
    }
}
