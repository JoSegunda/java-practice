
import java.util.Scanner;

public class ProductionCalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double totalUnits, defectiveParts, productionGoal;
        // Data input

        // read total units
        System.out.print("Input total units: ");
        totalUnits = sc.nextDouble();

        // READ DEFECTIVE PARTS
        System.out.print("Input defective units: ");
        defectiveParts = sc.nextDouble();

        // READ THE PRODUCTION GOAL
        System.out.print("Input production goal: ");
        productionGoal = sc.nextDouble();

        // MAKE CALCULATIONS

        // THe number of actual parts produced
        double usefulParts = totalUnits - defectiveParts;

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
            goalMessage = "Objectivo atingido";
        }
        else
        {
            goalMessage = "objectivo não atingido";
        }
        
    }
    
}
