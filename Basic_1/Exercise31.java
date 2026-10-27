
/*
Repeat Each Character
Double every character in a word.
*/
import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        // Print the text with every character doubled
      for (int i = 0; i < text.length(); i++) 
      {
        System.out.print(text.charAt(i) + "" + text.charAt(i));
      }
      System.out.println();

      sc.close();
    }
}
