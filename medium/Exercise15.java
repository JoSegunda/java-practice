import java.util.Scanner;

public class Exercise15 {
    static int recursiveSum(int n) {
        // Base case and recursive case
      	if (n == 0)
        {
          return 0;
        }
        else
        {
          return n + recursiveSum(n-1);
        }
      

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Sum: " + recursiveSum(n));

        sc.close();
    }
}