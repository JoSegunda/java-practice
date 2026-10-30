/*
Remove Duplicates
Remove consecutive duplicate characters from a string.
*/

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().trim();

        // Remove consecutive duplicates and print
        String result = "", temp, n = "";
        String middle = text;
        for (int i = 0; i < text.length(); i++)
        {
            temp = String.valueOf(middle.charAt(i));

            if (i == 0 || (!temp.equals(n))) 
            {
                result += temp;
                n = temp;
            }
            else if (temp.equals(n))
            {
                continue;
            }
        }

        System.out.println(result);

        sc.close();
    }
}
