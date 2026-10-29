import java.util.Scanner;

public class Exercise52{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        // Check if n is a palindrome using arithmetic (no string conversion)

        int count = 1, sum = 0, intCompare = 0, temp = n;
        int check = n;

        // Check how many individual numbers there are in the integer part
        while (temp != 0) 
        {
            temp /= 10;
            count *= 10;
            sum++;
        }

        count /= 10;

        for (int i = 0; i < sum; i++)
        {
            temp = check % 10;
            check /= 10;

            int lop = temp * count;
            intCompare += lop;

            count /= 10;
        }

        if (intCompare == n) 
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
