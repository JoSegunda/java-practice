import java.util.Scanner;

public class Exercise30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().trim();

        // Print first and last character

        for (int i = 0; i < word.length(); i++)
        {
          if (i == 0)
          {
            System.out.println("First: " + word.charAt(i));
          }
          
          if (i == word.length() - 1 || word.length() == 1)
          {
            System.out.println("Last: " + word.charAt(i));
          }
        }
        System.out.println();

        sc.close();
    }
    
}
