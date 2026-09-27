
import java.util.Scanner;

public class Banking {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================================");
        System.out.println("             Welcome to M9 Banking System            ");
        System.out.println("=====================================================");

        
        // The choice also represents the stop condition
        int choice = 0;
        double account = 0 , amount = 0, valueWithdrawed = 0;


        while (choice != 4) 
        {
            System.out.println("""
             -----------------------
             |   1. Deposit        |
             |   2. Withdraw       |
             |   3. View Balance   |
             |   4. EXIT           |
             -----------------------
                """);

            // This loop will repeat until a valid value is inputed
            do 
            {
                System.out.println("\nChoose the operation");
            } while (choice > 5 || choice < 1);
            
            

            switch (choice) {
                // Deposit amount
                case 1:
                    System.out.println("/n/n------------------------------------");
                    System.out.println("How much would like to deposit: ");
                    System.out.println("/n/n------------------------------------");

                    amount = sc.nextDouble();
                    account += amount;

                    System.out.println("Amount deposited successfully");
                    break;
                case 2:
                    do 
                    {
                        System.out.println("/n/n------------------------------------");
                        System.out.println("How much would like to Whithdraw: ");
                        System.out.println("/n/n------------------------------------");

                        valueWithdrawed = sc.nextDouble();

                        System.out.println((valueWithdrawed > account) ? "Impossible to Withdraw, Try again" : "Withdrawal is successfull ✅✅");
                    } while (valueWithdrawed > account);
                    
                    account -= valueWithdrawed;
                    
                    if (valueWithdrawed > account) {
                        System.out.println("The input amount is to high, try again please.");
                    }
                    account -= valueWithdrawed;
                    System.out.println("Amount withdrawed successfully✅✅");
                    break;
                case 3:
                    System.out.println("/n/n------------------------------");
                    System.out.println("/n/nCurrent Balance: " + amount + "€ ");
                    System.out.println("/n/n------------------------------");
                    break;
                default:
                    break;
            }
        }


        sc.close();
    }
}
