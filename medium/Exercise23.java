
import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine().trim());
        int b = Integer.parseInt(sc.nextLine().trim());

        // Find the GCD
        int gcd = 1;

        int max = (a >= b) ? a : b;

        for (int i = 1; i < max; i++)
        {
            if (a % i == 0 && b % i == 0)
            {
                gcd = i;
            }
        }

        // Print the result

        System.out.println("GCD: " + gcd);

        sc.close();

    }

}