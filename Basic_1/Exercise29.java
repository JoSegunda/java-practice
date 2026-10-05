/*
Calculate a discounted price from a price and discount percentage.
*/

import java.util.Scanner;

public class Exercise29{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sentence: ");
        String sentence = sc.nextLine().trim();

        String word;
        int counter = 1;

        for (int i = 0; i < sentence.length(); i++)
        {
            word =  String.valueOf(sentence.charAt(i));

            if (word.equals(" "))
            {
                counter++;
            }
        }

        System.out.println(counter + " words");

        sc.close();
    }
}