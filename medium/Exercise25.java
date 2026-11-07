import java.util.Scanner;

public class Exercise25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine().trim());

    // Find and print prime factors
    boolean isPrime = true;
    int div = 2;

    while (n != 1) {
      if (n % div == 0) {
        // check if div is prime
        int j = 2;

        while (j <= div) {
          if ((div % j == 0) && (j != 1 && j != div)) {
            isPrime = false;
            break;
          }
          j++;
        }

        if (isPrime) {
          n /= div;
          System.out.print(div + " ");
        }
      } else {
        div++;
      }
    }

    System.out.println();
    sc.close();
  }
}
