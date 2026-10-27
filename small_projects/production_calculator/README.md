# Production Calculator

## Overview

**Production Calculator** is a Java console application designed to monitor manufacturing performance, product quality, productivity, and financial results across multiple production shifts.

The program calculates production metrics, identifies defective parts, evaluates target achievement, estimates production costs and profits, and classifies quality levels according to the defect rate.

It also supports cumulative reporting across shifts.

## Features

- **Production Tracking:** Calculates total good parts and defective parts.
- **Productivity Metrics:** Measures yield, target attainment, and hourly production rates.
- **Cycle Time:** Estimates the average time required to produce one good part.
- **Financial Analysis:** Calculates gross revenue, production costs, waste costs, gross profit, and profit margin.
- **Quality Classification:** Assigns a quality level from Class A to Class D based on the defect rate.
- **Operational Alerts:** Provides recommended actions for each quality classification.
- **Multi-Shift Support:** Processes multiple shifts and accumulates production and financial totals.
- **Input Validation:** Rejects negative values, invalid production quantities, and shift durations outside the permitted range.

## Technologies

- **Language:** Java
- **Input:** `java.util.Scanner`
- **Interface:** Command-line interface (CLI)
- **Numeric Types:** `int`, `double`, and `boolean`

## Requirements

- Java Development Kit (JDK) installed.
- A terminal or command prompt.
- The `ProductionCalculator.java` source file.

## Installation and Execution

1. Clone or download this repository.
2. Open a terminal in the directory containing `ProductionCalculator.java`.
3. Compile the program:

   ```bash
   javac ProductionCalculator.java
   ```

4. Run the application:

   ```bash
   java ProductionCalculator
   ```

5. Follow the prompts to enter production, productivity, and financial data.

## Input Parameters

| Input | Description | Validation |
|---|---|---|
| Total units | Total number of parts produced during the shift | Must be zero or greater |
| Defective units | Number of defective parts | Must be zero or greater and cannot exceed total units |
| Production goal | Target number of good parts | Must be zero or greater |
| Shift duration | Duration of the shift in hours | Must be greater than 0 and no more than 8 hours |
| Unit sale price | Selling price per good part | Must be greater than 0 |
| Production cost per unit | Manufacturing cost per part | Must be zero or greater |

**Note:** The application uses numeric input with Java's `Scanner`. The current implementation validates numeric ranges but does not fully handle non-numeric input.

## Productivity and Efficiency Metrics

The application calculates the following metrics for each shift.

| Metric | Formula | Purpose |
|---|---|---|
| Good Parts | Total Units − Defective Units | Determines the number of usable parts |
| Yield Rate (%) | (Good Parts / Total Units) × 100 | Measures the percentage of good parts produced |
| Target Attainment (%) | (Good Parts / Production Goal) × 100 | Measures progress toward the production target |
| Total Parts per Hour | Total Units / Shift Duration | Measures overall production speed |
| Good Parts per Hour | Good Parts / Shift Duration | Measures the production rate of usable parts |
| Cycle Time (seconds) | (Shift Duration × 3,600) / Good Parts | Estimates the average time per good part |
| Defect Rate (%) | (Defective Units / Total Units) × 100 | Measures the proportion of defective production |

The implementation includes division-by-zero safeguards for yield, target attainment, and cycle time.

## Financial Metrics

The application evaluates the financial performance of each shift using the sale price and production cost per unit.

| Metric | Formula |
|---|---|
| Gross Revenue | Good Parts × Unit Sale Price |
| Total Production Cost | Total Units × Production Cost per Unit |
| Waste Cost | Defective Units × Production Cost per Unit |
| Gross Profit | Gross Revenue − Total Production Cost |
| Gross Profit Margin (%) | (Gross Profit / Gross Revenue) × 100 |

Defective parts generate no direct sales revenue, but their manufacturing costs are included in total production costs.

The profit margin is set to 0% when gross revenue is zero.

## Quality Classification

The application assigns a quality classification based on the calculated defect rate.

| Class | Defect Rate | Classification | Recommended Action |
|---|---:|---|---|
| A | Below 1% | Excellent | Maintain current process standards |
| B | 1%–3% | Acceptable | Continue production within tolerance limits |
| C | Above 3% up to 5% | Caution | Notify the supervisor and increase sampling |
| D | Above 5% | Critical | Stop the line and inspect and calibrate the equipment |

When total production is zero, the program reports **No Data / Inactive Line**.

These classifications and actions are intended to help operators identify quality problems and determine when intervention may be necessary.

## Multi-Shift Processing

The program is designed to process successive production shifts until the operator chooses to exit.

For each shift, it:

1. Collects production and financial inputs.
2. Calculates productivity, quality, and financial metrics.
3. Displays the shift report.
4. Adds the shift's results to cumulative totals.
5. Asks whether to process another shift.

At the end, the application displays a consolidated report containing:

- Number of shifts processed.
- Total parts produced.
- Total defective parts.
- Total good parts.
- Total gross revenue.
- Total production costs.
- Total gross profit.

The cumulative production and financial values are stored in accumulator variables initialized before the main loop.

## Test Cases

The following test cases use the formulas and classification rules documented for the project. Expected calculation results are rounded to two decimal places.

### Test 1 — Normal Production

**Input data**

| Parameter | Value |
|---|---:|
| Total units | 1,000 |
| Defective units | 50 |
| Production goal | 900 |
| Shift duration | 8 hours |
| Unit sale price | $10.00 |
| Production cost per unit | $4.50 |

**Expected calculation results**

| Metric | Expected Result |
|---|---:|
| Good parts | 950 |
| Yield rate | 95.00% |
| Target attainment | 105.56% |
| Total parts per hour | 125.00 |
| Good parts per hour | 118.75 |
| Cycle time | 30.32 seconds |
| Defect rate | 5.00% |
| Gross revenue | $9,500.00 |
| Total production cost | $4,500.00 |
| Waste cost | $225.00 |
| Gross profit | $5,000.00 |
| Gross profit margin | 52.63% |
| Quality classification | Class C — Caution |

**Expected action:** Notify the supervisor and increase sampling.

### Test 2 — Excellent Quality

**Input data**

| Parameter | Value |
|---|---:|
| Total units | 1,000 |
| Defective units | 5 |
| Production goal | 950 |
| Shift duration | 8 hours |
| Unit sale price | $10.00 |
| Production cost per unit | $4.00 |

**Expected results**

| Metric | Expected Result |
|---|---:|
| Good parts | 995 |
| Yield rate | 99.50% |
| Target attainment | 104.74% |
| Defect rate | 0.50% |
| Gross revenue | $9,950.00 |
| Total production cost | $4,000.00 |
| Waste cost | $20.00 |
| Gross profit | $5,950.00 |
| Gross profit margin | 59.80% |
| Quality classification | Class A — Excellent |

**Expected action:** Maintain current process standards.

### Test 3 — Critical Quality

**Input data**

| Parameter | Value |
|---|---:|
| Total units | 1,000 |
| Defective units | 80 |
| Production goal | 950 |
| Shift duration | 8 hours |
| Unit sale price | $10.00 |
| Production cost per unit | $4.00 |

**Expected results**

| Metric | Expected Result |
|---|---:|
| Good parts | 920 |
| Yield rate | 92.00% |
| Target attainment | 96.84% |
| Defect rate | 8.00% |
| Gross revenue | $9,200.00 |
| Total production cost | $4,000.00 |
| Waste cost | $320.00 |
| Gross profit | $5,200.00 |
| Gross profit margin | 56.52% |
| Quality classification | Class D — Critical |

**Expected action:** Stop the line and begin mechanical inspection and calibration.

### Test 4 — Invalid Input: Defective Units Exceed Total Units

**Input data**

| Parameter | Value |
|---|---:|
| Total units | 100 |
| Defective units | 120 |

**Expected behavior**

The application should display an error indicating that defective units cannot exceed total units and request the defective-unit input again.

### Test 5 — Invalid Shift Duration

**Input data**

| Shift Duration | Expected Behavior |
|---:|---|
| 0 hours | Request input again |
| -2 hours | Request input again |
| 9 hours | Request input again |
| 8 hours | Accept input |

The valid shift duration must be greater than zero and no more than eight hours.

### Test 6 — Zero Production

**Input data**

| Parameter | Value |
|---|---:|
| Total units | 0 |
| Defective units | 0 |
| Production goal | 0 |
| Shift duration | 8 hours |
| Unit sale price | $10.00 |
| Production cost per unit | $4.00 |

**Expected calculation results**

| Metric | Expected Result |
|---|---:|
| Good parts | 0 |
| Yield rate | 0.00% |
| Target attainment | 0.00% |
| Gross revenue | $0.00 |
| Total production cost | $0.00 |
| Waste cost | $0.00 |
| Gross profit | $0.00 |
| Gross profit margin | 0.00% |
| Quality classification | No Data / Inactive Line |

**Important:** The current implementation does not handle every zero-production metric consistently. In particular, its defect-rate calculation is conditional on having good parts, so the expected zero-production result above assumes the intended formula and safeguard rather than the exact current implementation.

## Known Limitations

The current source code contains a few issues that should be addressed for reliable operation:

- **Shift continuation input:** `nextInt()` and `nextDouble()` leave a newline in the input buffer. The subsequent `nextLine()` may consume that newline instead of the operator's response.
- **Continuation validation:** The condition using `||` when checking for `exit` and `continue` is always true. It should use `&&` so that valid choices are accepted.
- **Defect rate:** The calculation should depend on total units, not on whether good parts are greater than zero. Otherwise, a shift with only defective parts incorrectly reports a zero defect rate.
- **Input validation:** Non-numeric inputs are not handled, and some validation loops do not provide clear error messages.
- **Cumulative report:** The final report does not yet display the cumulative defect rate, average good parts per shift, or other consolidated productivity metrics described in the project specification.
- **Cycle time output:** The value is calculated in seconds per good part, although the current output label incorrectly says `parts/second`.

The test cases above describe expected calculation behavior. Because of these limitations, the current program may not complete all interactive tests as intended without code corrections.

## Project Structure

```text
ProductionCalculator/
├── ProductionCalculator.java
└── README.md
```

## Future Improvements

Potential improvements include:

- Fixing input-buffer handling and continuation validation.
- Handling invalid numeric input safely.
- Correcting edge cases involving zero production and zero good parts.
- Adding cumulative defect rates and average production per shift.
- Supporting configurable quality thresholds and production goals.
- Improving output formatting and currency handling.
- Adding automated unit tests for calculations and validation.

## License

No license has been specified for this project.

---

**Production Calculator** provides a foundation for monitoring manufacturing efficiency, product quality, and financial performance through a simple Java command-line application.