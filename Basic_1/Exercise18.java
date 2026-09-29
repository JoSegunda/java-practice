import java.util.Scanner;

public class Exercise18 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int value = sc.nextInt();

        System.out.println(value + "!" + " = " + factorial(value));
        
        sc.close();
    }

    static long factorial (int n)
    {
        if (n > 1)
        {
            return n * factorial(n - 1);
        }
        else return 1;
    }
}

