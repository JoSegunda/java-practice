
import java.util.Scanner;

public class ProductionCalculator {
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int totalUnits, defectiveParts, productionGoal;
        boolean invalidInput = false;
        // Data input

        // -----------  ROBUST INPUT VALIDATION  ---------------------

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
        }
        while (invalidInput);
        

        //  ----------------  MAKE CALCULATIONS  --------------

        // THe number of actual parts produced
        int goodParts = totalUnits - defectiveParts ;

        // --------------   IMPROVE ON EFFICIENCY AND PRODUCTIVITY METRICS -----------------

        double yieldRate, shiftDuration, partsPerHour, targetAttainment, goodPartsPerHour, secondsPerGoodPart;

        // Validation of the shift input
        do
        {
            // Read shift hours
            System.out.print("Shift duration (h): ");
            shiftDuration = sc.nextDouble();
        }
        while (shiftDuration <= 0 || shiftDuration > 8);

        // Yield rate percentages of failures 
        yieldRate = (totalUnits > 0) ? ((double)(goodParts) / (double)(totalUnits)) * 100 : 0.0;

        // Show how close the team got to the goal
        targetAttainment = (productionGoal > 0) ? ((double)(goodParts) / (double)(productionGoal)) * 100 : 0.0;

        // Parts per hour
        goodPartsPerHour = goodParts / shiftDuration;

        // Good parts per hour
        partsPerHour = totalUnits / shiftDuration;
        
        // SecondPerGoodPart: Determine how many seconds or minutes it takes the factory, on average, to complete one usable unit.
        secondsPerGoodPart = (goodParts > 0) ? (shiftDuration * 3600) / goodParts : 0;

        // Measures the percentage of parts that are defective
        double defectRate = 0;

        if (goodParts > 0) 
        {
            defectRate = ((double)(defectiveParts) / (double)(totalUnits)) * 100;
        }

        // Check if goal accomplished
        String goalMessage;

        goalMessage = (goodParts >= productionGoal) ? "Target Reached at" :  "Target not met by";

        // ---------------- FINANCIAL IMPACT AND COSTS  --------------------------

        double unitPrice, productionCost, grossRevenue, totalCost, wasteCost, grossProfit, grossProfitMargin;

        // Validate price input
        do 
        {
            System.out.print("Price sale: $");
            unitPrice = sc.nextDouble();
            
            // Check if input is negativeor zero
            invalidInput = (unitPrice > 0) ? false : true;

        } while (invalidInput);

        // Validation production cost input
        do 
        {
            System.out.print("Production cost per unit: $");
            productionCost  = sc.nextDouble();
            
            invalidInput = checkNegative(productionCost);
        } while (invalidInput);

        // grossRevenue - Calculate the total financial volume generated from the items approved for sale.
        grossRevenue = goodParts * unitPrice;   // Note: Defective parts do not generate direct sales revenue.

        // Total Cost: Calculate how much the factory actually spent to produce everything that came off the line (good parts + defective ones).
        totalCost = totalUnits * productionCost; // Note: The cost applies to all units produced, as material and energy were consumed even for the parts that failed.

        // Waste Cost: Isolate the direct monetary loss caused exclusively by the defects.
        wasteCost = defectiveParts * productionCost;

        // Gross Profit: Evaluate the actual financial balance for the shift (earnings minus expenses).
        grossProfit = grossRevenue - totalCost;

        // Gross profit margin: Calculate the percentage profitability of the shift's sales.
        grossProfitMargin = (grossRevenue > 0.00) ? (grossProfit / grossRevenue) * 100 : 0; 

        // TODO: QUALITY CLASSIFIER

        // TODO: SUPPORT TO ASSEMBLY LINES

        // PRINT RESULTS
        System.out.println("\nGood parts: " + goodParts);
        System.out.printf("Rate of defective parts: %.2f%% \n", defectRate);

        // EFFICIENCY AND PRODUCTIVITY METRICS OUTPUTS
        System.out.printf("percentage of defect-free production on the first pass:  %s %.2f%%\n", goalMessage, yieldRate);
        System.out.printf("how close or far the team came to the established goal, as a percentage: %.2f%%\n", targetAttainment);
        System.out.printf("%.2f good parts/hour \n", goodPartsPerHour);
        System.out.printf("%.2f parts/hour \n", partsPerHour);
        System.out.printf("%.2f parts/second \n\n", secondsPerGoodPart);

        // FINANCIAL IMPACT AND COSTS OUTPUTS
        System.out.printf("Gross Revenue: %.2f\n", grossRevenue);
        System.out.printf("Total Cost: %.2f\n", totalCost);
        System.out.printf("Waste Cost: %.2f\n", wasteCost);
        System.out.printf("Gross Profit: %.2f\n", grossProfit);
        System.out.printf("Gross Profit Margin: %.2f%%\n", grossProfitMargin);

        sc.close();

    }

    // Checks wether a value is negative or not
    static boolean checkNegative(double num)
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
