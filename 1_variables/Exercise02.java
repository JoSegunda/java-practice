// 2. Sum of Two Numbers
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Value: ");
        int a = sc.nextInt();

        System.out.print("Input another value: ");
        int b = sc.nextInt();

        int totalSoma = a + b;
        System.out.println(a + " + " + b + " = " + (totalSoma));

        sc.close();
    }
}
