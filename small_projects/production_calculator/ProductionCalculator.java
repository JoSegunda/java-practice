
import java.util.Scanner;

public class ProductionCalculator {
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int totalUnits, defectiveParts, productionGoal;
        // Data input

        // TODO: ROBUST INPUT VALIDATION
        
        // read total units
        System.out.print("Input total units: ");
        totalUnits = sc.nextInt();

        // READ DEFECTIVE PARTS
        System.out.print("Input defective units: ");
        defectiveParts = sc.nextInt();

        // READ THE PRODUCTION GOAL
        System.out.print("Input production goal: ");
        productionGoal = sc.nextInt();

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
    
}
