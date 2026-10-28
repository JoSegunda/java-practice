/*
Count Words
Count the number of words in a sentence.
*/


import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().trim().toLowerCase();

        // Count and print the number of words
        char letter;
        int charToAscii, count = 0;
        for (int i = 0; i < sentence.length(); i++)
        {
            letter = sentence.charAt(i);
            charToAscii = (int) letter;

            if (charToAscii >= 97 && charToAscii <= 122) 
            {
                count++;    
            }
        }
        System.out.println(count);
    }
}
