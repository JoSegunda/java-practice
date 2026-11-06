import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        // Find and print prime factors
        boolean isPrime = true;
        int div = 2;
        
        for (int i = 0; i < n; i++)
        {
            if(n % div == 0)
            {
                // check if i is prime
                int j = 1;

                while (j < div)
                {
                    System.out.println("check: "  + j);
                    if ((div % j == 0) && (j != 1 && j != div))
                    {
                        System.out.println("here: "  + j);
                        isPrime = false;
                        break;
                    }

                    j++;
                }

                n /= div;
            }

            if (isPrime) {
                System.out.print(div + " ");
            }
        }

        System.out.println();
        sc.close();
    }
}
