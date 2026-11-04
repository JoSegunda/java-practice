import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(sc.nextLine().trim());
        }
				
      int sum = 0;
      for (int num : numbers) sum += num;
    
      int avg = sum / n;
      int count = 0;
      for (int num : numbers) 
      {
        if (num > avg)
        {
            count++;
        }
      }

      System.out.println("Above average: " + count);
      
      sc.close();
    }
}
