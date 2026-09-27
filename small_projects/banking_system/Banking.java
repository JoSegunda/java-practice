
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
                System.out.print("\nChoose the operation: ");

                choice = sc.nextInt();

            } while (choice > 5 || choice < 1);
            
            

            switch (choice) {
                // Deposit amount
                case 1:
                    do 
                    {
                        System.out.println("\n\n------------------------------");
                        System.out.print("How much would like to deposit €");

                        amount = sc.nextDouble();

                        System.out.println("-------------------------------");
                        
                        System.out.println((amount < 0) ? "Impossible to deposit, amount must be greater than 0 (zero)" : "Deposit is successfull ✅✅");

                    } while (amount <= 0);
                    
                    account += amount;
                    break;
                case 2:
                    // Repeat the prompt while the amount is invalid
                    do 
                    {
                        System.out.println("------------------------------------");
                        System.out.print("How much would like to Whithdraw: ");

                        valueWithdrawed = sc.nextDouble();

                        System.out.println("------------------------------------");

                        

                        // Display wheather the amount is valid or not
                        System.out.println((valueWithdrawed > account) ? "Impossible to Withdraw, Try again" : "Withdrawal is successfull ✅✅");
                    } while (valueWithdrawed > account);
                    
                    // Update the account
                    account -= valueWithdrawed;
                    
                    break;
                case 3:
                    System.out.println("------------------------------");
                    System.out.println("Current Balance: " + account + "€ ");
                    System.out.println("------------------------------\n");
                    break;
                default:
                    break;
            }
        }

        System.out.println("EXITING.......");


        sc.close();
    }
}
