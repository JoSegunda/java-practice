/*
Reverse Words
Reverse the order of words in a sentence.
*/

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().trim();

        String[] words = sentence.split(" ");
        int wordsLength = words.length;

        String[] tempStr = new String[wordsLength];

        // Reverse the words and print
        int c = 0;
        for (int i = wordsLength -1; i >= 0; i--)
        {
          tempStr[c] = words[i];
          c++;
        }
        
        sentence = String.join(" ", tempStr);

        System.out.println(sentence);

        sc.close();
    }
}