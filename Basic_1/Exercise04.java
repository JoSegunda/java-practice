/*
Write a Java program to print the results of the following operations.
Test Data:
a. -5 + 8 * 6          // output: 43
b. (55+9) % 9          // output: 1
c. 20 + -3*5 / 8       // output: 19
d. 5 + 15 / 3 * 2 - 8 % 3      // output: 13
*/


public class Exercise04 
{
    public static void main(String[] args)
    {
        System.out.println("Operação 1:  -5 + 8 * 6");
        System.out.println((-5 + (8 * 6)) + "\n");

        System.out.println("Operação 2:  (55+9) % 9");
        System.out.println((55 + 9) % 9 + "\n");

        System.out.println("Operação 3:  20 + -3*5 / 8 ");
        System.out.println((20 - ((3 * 5) / 8)) + "\n");

        System.out.println("Operação 4:  5 + 15 / 3 * 2 - 8 % 3 ");
        System.out.println((5 + ((15 / 3) * 2) - (8 % 3)) + "\n");
    }
}
