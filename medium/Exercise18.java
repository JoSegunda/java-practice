import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) numbers[i] = Integer.parseInt(sc.nextLine().trim());

        // Reverse and print
        int arrLength = numbers.length;
        int[] num = new int[arrLength];
        int counter = 0;
        for (int i = arrLength-1; i >= 0; i--)
        {
            num[counter] = numbers[i];
            counter++;
        }
        System.out.println(Arrays.toString(num));
        sc.close();
    }
}
