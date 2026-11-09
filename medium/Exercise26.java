import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        // Check and print
        int num = n, div = 1, sum = 0;

        while (div <= n)
        {
            if (num % div == 0 && div < n)
            {
                sum += div;
            }
            div++;
        }
        System.out.println((sum == n) ? "Yes" : "No");

        sc.close();
    }
}
