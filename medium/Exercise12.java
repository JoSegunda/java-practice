import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        // Check if prime and print
        int sqrt = (int) Math.sqrt(n);
      	String result = "Prime";
      
      	for (int i = 2; i <= sqrt; i++)
        {
         	if (n % i == 0)
            {
             	result = "Not prime"; 
                break;
            }
        }
      
      System.out.println(result);

      sc.close();
    }
}
