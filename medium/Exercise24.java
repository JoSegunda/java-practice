import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        // Print the first N Fibonacci numbers
        int prev = 0, next = 1, k;
        

        int stop = n;

        for (int i = 0; i < stop; i++)
        {
            System.out.print(prev + " ");
            k = next;
            next = prev + next;
            prev = k;
            
           
        }
        System.out.println();
        sc.close();
    }
}
