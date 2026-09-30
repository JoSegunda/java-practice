import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Item: ");
        String item = sc.nextLine().trim();

        System.out.print("Price: $");
        double price = Double.parseDouble(sc.nextLine().trim());

        System.out.print("Quantity: ");
        int quantity = Integer.parseInt(sc.nextLine().trim());

        // Calculate total and print receipt

        double total = price * quantity;

        System.out.printf("Item: %s\n", item);
        System.out.printf("Price: $%.2f\n", price);
        System.out.printf("Quantity: %d\n", quantity);
        System.out.printf("Total: $%.2f\n", total);
    }
}
