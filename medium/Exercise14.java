import java.util.Scanner;

public class Exercise14 {
    static boolean isPalindrome(String word) 
    {
        int srtLen = word.length() - 1;
        int j = 0;
        boolean result = true;
        // Return true if word is a palindrome
        for (int i = srtLen; i > 0; i--)
        {
            String current = String.valueOf(word.charAt(i)); 
            String  last = String.valueOf(word.charAt(j));

            if (!current.equalsIgnoreCase(last))
            {
                result = false;
                break;
            }

            j++;
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine().trim();

        isPalindrome(txt);
        if (isPalindrome(txt))
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }
}