
import java.util.Scanner;

public class ProductionCalculator {
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int totalUnits, defectiveParts, productionGoal;
        boolean invalidInput = false;
        // Data input

        // TODO: ROBUST INPUT VALIDATION

        // Check negative values for total inputs
        do
        {
            // read total units
            System.out.print("Input total units: ");
            totalUnits = sc.nextInt();

            invalidInput = checkNegative(totalUnits);
        }
        while(invalidInput);

        // Check values for defective parts
        do
        {
            // READ DEFECTIVE PARTS
            System.out.print("Input defective units: ");
            defectiveParts = sc.nextInt();

            // Check if there are any negative values
            invalidInput = checkNegative(defectiveParts);

            // Check if the number of defective parts is greater than the total amount of parts
            if (defectiveParts > totalUnits)
            {
                invalidInput = true;
                System.out.println("ERROR: Number of defective parts cannot be greater than total parts\n");
            }
        }
        while(invalidInput);

        // Check values for production goal
        do
        {
            // READ THE PRODUCTION GOAL
            System.out.print("Input production goal: ");
            productionGoal = sc.nextInt();

            invalidInput = checkNegative(productionGoal);

            if (productionGoal > totalUnits) 
            {
                invalidInput = true;
                System.out.println("Error: Production goal cannot be greater than total units\n");    
            }
        }
        while (invalidInput);
        

        // MAKE CALCULATIONS

        // TODO: IMPROVE ON EFFICIENCY AND PRODUCTIVITY METRICS

        // THe number of actual parts produced
        int usefulParts = totalUnits - defectiveParts ;

        // Measures the percentage of parts that are defective
        double defectRate = 0;

        if (usefulParts > 0) 
        {
            defectRate = ((double)(defectiveParts) / (double)(totalUnits)) * 100;
        }

        // Check if goal accomplished
        String goalMessage;

        if (usefulParts >= productionGoal)
        {
            goalMessage = "Objective achieved";
        }
        else
        {
            goalMessage = "Objective not achieved";
        }

        // TODO: FINANCIAL IMPACT AND COSTS

        // TODO: QUALITY CLASSIFIER

        // TODO: SUPPORT TO ASSEMBLY LINES

        // PRINT RESULTS
        System.out.println("\nGood parts: " + usefulParts);
        System.out.printf("Rate of defective parts: %.2f%% \n", defectRate);
        System.out.printf("Goal Description: %s\n", goalMessage);

        sc.close();

    }

    // Checks wether a value is negative or not
    static boolean checkNegative(int num)
    {
        if (num < 0)
        {
            System.out.println("ERROR: Input cannot be negative\n");
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
