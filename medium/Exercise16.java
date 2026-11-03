/*
Array Map Function
Write a function that doubles every number in a list.
*/

import java.util.Scanner;

public class Exercise16 {
    static int[] doubleAll(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) result[i] = numbers[i] * 2;

        // Return a new array with each number doubled
      	return result;
    }

    public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      
      int n = Integer.parseInt(sc.nextLine().trim()); 

      int[] numbers = new int[n];
      

      for (int i = 0; i < n; i++) numbers[i] = Integer.parseInt(sc.nextLine().trim()); 


      numbers = doubleAll(numbers);

      for (int j = 0; j < n; j++) System.out.print(numbers[j] + " ");
      

      System.out.println();

      sc.close();
    }
}
