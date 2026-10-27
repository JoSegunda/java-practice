
/*
Tip Calculator
Create a tip calculator function for a restaurant bill.
*/
import java.util.Scanner;

public class Exercise42 {
  public static void calculateTip(double bill, int tipPercent) {
    // Calculate tip and total
    double tip = bill * tipPercent / 100;
    double total = tip +bill;

    // Print formatted results
    System.out.printf("Bill: $%.2f\n", bill);
    System.out.printf("Tip: $%.2f\n", tip);
    System.out.printf("Total: $%.2f\n", total);
  }
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    double bill = Double.parseDouble(sc.nextLine().trim());
    int tipPercent = Integer.parseInt(sc.nextLine().trim());

    calculateTip(bill, tipPercent);

    sc.close();
  }
}
