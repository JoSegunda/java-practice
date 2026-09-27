

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();

        double perimeter = 2 * Math.PI * r;
        double area = Math.PI * (Math.pow(r, 2));

        System.out.println("THe area of the circle is: " + area);
        System.out.println("THe perimeter of the circle is: " + perimeter);

        sc.close();
    }
}
