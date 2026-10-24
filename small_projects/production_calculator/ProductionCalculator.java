
import java.util.Scanner;

public class ProductionCalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int totalUnits, defectiveParts, productionGoal;
        // Data input

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

        // THe number of actual parts produced
        int usefulParts = totalUnits - defectiveParts ;

        // Measures the percentage of parts that are defective
        double defectRate;

        if (totalUnits > 0) 
        {
            defectRate = (defectiveParts / totalUnits) * 100;
        }
        else
        {
            defectRate = 0;
        }

        // Check if goal accomplished
        String goalMessage;

        if (usefulParts >= productionGoal)
        {
            goalMessage = "Objective achievd";
        }
        else
        {
            goalMessage = "Objective not achieved";
        }

        System.out.println("Good parts: " + usefulParts);
        System.out.printf("Rate of defective parts: %.2f\n", defectRate);
        System.out.printf("Goal Description");

        sc.close();

    }
    
}
