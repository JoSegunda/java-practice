import java.util.Scanner;

public class Exercise53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] parts = sc.nextLine().trim().split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) arr[i] = Integer.parseInt(parts[i]);

        // Compute and print the alternating sum
        int count = 0;
        int result = 0;
        for (int number : arr)
        {
            if (count % 2 == 0) 
            {
                result += number;
            }
            else
            {
                result -= number;
            }
            count++;
        }
        System.out.println(result);
        sc.close();
    }
}
