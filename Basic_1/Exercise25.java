import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine().trim());
        int b = Integer.parseInt(sc.nextLine().trim());

        // Print the four operations
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " x " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (a/b));
    }
}
