import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().trim().toLowerCase();
        String rev = new StringBuilder(word).reverse().toString();

        // Check if palindrome and print
        if (word.equals(rev)) 
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        sc.close();
    }
}
