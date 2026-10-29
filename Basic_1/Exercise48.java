/*
Capitalize Words
Capitalize the first letter of every word in a sentence.


*/

import java.util.Scanner;

public class Exercise48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().trim();
        String[] words = sentence.split(" ");

        // Capitalize the first letter of each word
        String newWord = "";
        String tempStr = "";

        for (int i = 0; i < words.length; i++)
        {
          tempStr = words[i];
          newWord = String.valueOf(tempStr.charAt(0));
          newWord = newWord.toUpperCase();

          for (int j = 1; j < words[i].length(); j++)
          {
            newWord += words[i].charAt(j);
          }
          words[i] = newWord;
        }

        sentence = String.join(" ", words);

        System.out.println(sentence);

        sc.close();
    }
}