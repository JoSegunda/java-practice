# Production Calculator

This project consists of a simple console application designed to help monitor the performance of a production line or a work shift. The program acts as a straightforward analytical assistant: it collects operational metrics entered by the operator, performs the essential mathematical calculations, and returns a clear summary of the achieved performance.

## How the Program Should Work

The application flow is divided into four consecutive logical phases:

1. **Data Input**
   The program begins by sequentially requesting three integer values from the user:
   * **Total units produced:** Gross quantity of parts coming off the line during the shift.
   * **Defective units:** Quantity of parts rejected by quality control.
   * **Production target:** The goal set for the shift in terms of good/usable parts.

2. **Processing and Business Logic**
   With the values in memory, the system performs the following calculations and validations:
   * **Calculation of Useful Parts:** Determines the effective production by subtracting the defects from the total produced.
   * **Exception Handling and Rejection Percentage:** If the total number of parts produced is greater than zero, it calculates the proportion of defects relative to the total:
   
     > **Defect Rate (%) = (Defective Units / Total Units) × 100**

     *(At this stage, it is crucial to temporarily convert the numbers to decimals/floating point, otherwise integer division will incorrectly result in 0).*
     
   * If the total produced is zero, the defect rate must be set directly to 0%, avoiding a division by zero error.
   * **Target Verification:** Compares the good units calculated with the shift target. If the useful production is equal to or greater than the defined goal, the target is considered met; otherwise, it is considered not met.

## Data Input Validations

| Test Scenario | Produced | Defective | Target | Expected Output |
| :--- | :--- | :--- | :--- | :--- |
| Normal case (target met) | 1000 | 50 | 900 | 950 good, 5.0% defects, Target met |
| Normal case (target missed) | 800 | 100 | 750 | 700 good, 12.5% defects, Target not met |
| Line stopped (division by zero) | 0 | 0 | 500 | 0 good, 0.0% defects, Target not met |
| Perfect shift | 500 | 0 | 500 | 500 good, 0.0% defects, Target met |