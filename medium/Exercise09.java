/*
Longest Word
Find the longest word in a sentence.
*/

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().trim();

        String[] words = sentence.split(" ");
        // Find and print the longest word

        int longestIndex = 0;
        int max = 0;

        for (int i = 0; i < words.length; i++)
        {
            if (max < words[i].length())
            {
                max = words[i].length();
                longestIndex = i;
            }
        }

        System.out.println(words[longestIndex]);

        sc.close();
    }
}
